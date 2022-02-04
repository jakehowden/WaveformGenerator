/*
 * OAuth
 * 
 * v1.0.0
 *
 * 03/02/2022
 */
package com.waveform.spotify.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 *	 The OAuth class is used to hold authentication data 
 *	 needed for the Spotify APIs.
 *
 *	 @author    Jake Howden
 */
public class OAuth {
	@JsonProperty("oauth_token")
	private String token;
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
}
