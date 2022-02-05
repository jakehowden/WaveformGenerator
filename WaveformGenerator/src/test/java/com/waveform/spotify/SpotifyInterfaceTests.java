/**
 * SpotifyInterfaceTests
 * 
 * v1.0.0
 * 
 * 03/02/2022
 */
package com.waveform.spotify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import javax.ws.rs.BadRequestException;

import org.junit.jupiter.api.Test;

import com.waveform.spotify.models.TrackAnalysisResponse;

/**
 * Unit tests for Spotify Interface.
 * 
 * @author Jake Howden
 */
public class SpotifyInterfaceTests {
	
	SpotifyInterface spotify = new SpotifyInterface();
	
	@Test
	public void TestAnalyseTrack() throws IOException, InterruptedException, BadRequestException {
		String trackId = "11dFghVXANMlKmJXsNCbNl";
		TrackAnalysisResponse response;
		try {
			response = spotify.analyseTrack(trackId);
		} catch (IOException e) {
			throw e;
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw e;
		} catch (BadRequestException e) {
			e.printStackTrace();
			throw e;
		}
		
		assertNotNull(response);
		assertEquals(0, response.getMeta().getStatusCode());
	}
	
	@Test
	public void TestAnalyseTrackInvalidTrackId() throws IOException, InterruptedException, BadRequestException {
		String trackId = "thisisnotavalidtrack";
		boolean OK = false;
		try {
			spotify.analyseTrack(trackId);
		} catch (IOException e) {
			throw e;
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw e;
		} catch (BadRequestException e) {
			OK = true;
		}
		
		assertTrue(OK);
	}
}
