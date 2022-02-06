/*
 * SearchResponse
 * 
 * v1.0.0
 *
 * 05/02/2022
 */
package com.waveform.spotify.models.search;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"tracks"
})
/**
 * 
 *	 The SearchResponse class is the response model used 
 *	 when querying the Spotify search endpoint.
 *
 *	 @author    Jake Howden
 */
public class SearchResponse {
	@JsonProperty("tracks")
	private Tracks tracks;
	
	@JsonProperty("tracks")
	public Tracks getTracks() {
		return tracks;
	}
	
	@JsonProperty("tracks")
	public void setTracks(Tracks tracks) {
		this.tracks = tracks;
	}
}
