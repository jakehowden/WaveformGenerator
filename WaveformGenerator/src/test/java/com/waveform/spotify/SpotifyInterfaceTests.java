/**
 * SpotifyInterfaceTests
 * 
 * v1.0.0
 * 
 * 03/02/2022
 */
package com.waveform.spotify;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import javax.ws.rs.BadRequestException;

import org.junit.jupiter.api.Test;

import com.waveform.spotify.models.analysis.TrackAnalysisResponse;
import com.waveform.spotify.models.search.SearchResponse;

/**
 * Unit tests for Spotify Interface.
 * 
 * @author Jake Howden
 */
public class SpotifyInterfaceTests {
	
	ISpotifyInterface spotify = new SpotifyInterface();
	
	@Test
	public void TestSearch() throws IOException, InterruptedException, BadRequestException {
		String queryString = "the beatles yesterday";
		SearchResponse response;
		try {
			response = spotify.search(queryString);
		} catch (IOException | InterruptedException e) {
			throw e;
		} catch (BadRequestException e) {
			throw e;
		}
		
		assertNotNull(response);
		assertTrue(response.getTracks().getTotal() > 0);
	}
	
	@Test
	public void TestAnalyseTrack() throws IOException, InterruptedException, BadRequestException {
		String trackId = "11dFghVXANMlKmJXsNCbNl";
		TrackAnalysisResponse response;
		try {
			response = spotify.analyseTrack(trackId);
		} catch (IOException | InterruptedException e) {
			throw e;
		} catch (BadRequestException e) {
			throw e;
		}
		
		assertNotNull(response);
		assertEquals(0, response.getMeta().getStatusCode());
	}
	
	@Test
	public void TestAnalyseTrackInvalidTrackId() {
		String trackId = "thisisnotavalidtrack";
		
		assertThrows(BadRequestException.class, () -> {
			spotify.analyseTrack(trackId);
		});
	}
	
	@Test
	public void TestRefreshAccessToken() {
		assertDoesNotThrow(() -> {
			spotify.refreshAccessToken();
		});
	}
}
