/**
 * FullFlowTests
 * 
 * v1.0.0
 * 
 * 06/02/2022
 */
package com.waveform.fullflow;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;

import org.junit.jupiter.api.Test;

import com.waveform.generator.WaveformGenerator;
import com.waveform.spotify.SpotifyInterface;
import com.waveform.spotify.models.analysis.TrackAnalysisResponse;
import com.waveform.spotify.models.search.SearchResponse;

/**
 * Unit tests which test the full lifecycles of the application.
 * 
 * @author Jake Howden
 */
public class FullFlowTests {

	SpotifyInterface spotify = new SpotifyInterface();
	WaveformGenerator generator = new WaveformGenerator();
	
	@Test
	public void TestWaveformGenerationFlow() {
		assertDoesNotThrow(() -> {
			String queryString = "the beatles yesterday";
			SearchResponse search = spotify.Search(queryString);

			assertNotNull(search);
			assertTrue(search.getTracks().getTotal() > 0);
			
			String trackId = search.getTracks().getItems().get(0).getId();
			TrackAnalysisResponse analysis = spotify.analyseTrack(trackId);
			
			assertNotNull(analysis);
			assertEquals(0, analysis.getMeta().getStatusCode());
			
			BufferedImage waveform = generator.Generate(analysis);
			
			assertNotNull(waveform);
		});
		
	}
}
