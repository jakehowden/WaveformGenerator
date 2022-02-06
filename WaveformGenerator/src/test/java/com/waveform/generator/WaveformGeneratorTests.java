/**
 * WaveformGeneratorTests
 * 
 * v1.0.0
 * 
 * 05/02/2022
 */
package com.waveform.generator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waveform.spotify.models.analysis.TrackAnalysisResponse;

/**
 * Unit tests for Waveform Generator.
 * 
 * @author Jake Howden
 */
public class WaveformGeneratorTests {
	private WaveformGenerator generator = new WaveformGenerator();
	private ObjectMapper mapper = new ObjectMapper();
	
	@Test
	public void TestGenerateWaveform() throws IOException {
		TrackAnalysisResponse analysis;
		try {
			analysis = mapper.readValue(new File("src/test/json/test_analysis_response.json"), TrackAnalysisResponse.class);
		} catch (IOException e) {
			throw e;
		}
		
		assertDoesNotThrow(() -> { 
			generator.Generate(analysis);
		});
	}
}
