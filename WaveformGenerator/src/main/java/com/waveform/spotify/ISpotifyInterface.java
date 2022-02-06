/*
 * ISpotifyInterface
 * 
 * v1.0.0
 *
 * 6/02/2022
 */
package com.waveform.spotify;

import java.io.IOException;

import javax.ws.rs.BadRequestException;

import com.waveform.spotify.models.analysis.TrackAnalysisResponse;
import com.waveform.spotify.models.search.SearchResponse;

/**
 * 
 *	 The ISpotifyInterface interface provides definitions for the
 *	 Spotify endpoint methods.
 * 
 *	 @author    Jake Howden
 */
public interface ISpotifyInterface {
	
	/**
	 * 
	 *	 The Search method searches Spotify tracks using the query string provided.
	 *	
	 *	 @return The top 25 tracks which match the query string. Supports pagination for more tracks.
	 *
	 */
	public SearchResponse search(String queryString) throws IOException, InterruptedException, BadRequestException;
	
	/**
	 * 
	 *	 The analyseTrack method takes a track id and calls Spotify's track analysis endpoint.
	 *	
	 *	 @return Full track analysis of the song.
	 *
	 */
	public TrackAnalysisResponse analyseTrack(String trackId) throws IOException, InterruptedException, BadRequestException;
	
	/**
	 * 
	 *	 The refreshAccessToken method refreshes the access token and expiry time.
	 *	 
	 *	 Sets the refreshed values in the Authentication model in the SpotifyInterface;
	 *
	 */
	public void refreshAccessToken() throws IOException, InterruptedException, BadRequestException;
}
