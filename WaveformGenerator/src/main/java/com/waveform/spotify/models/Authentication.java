/*
 * Authentication
 * 
 * v2.0.0
 *
 * 04/02/2022
 */
package com.waveform.spotify.models;
/**
 * 
 *	 The OAuth class is used to hold authentication data 
 *	 needed for the Spotify APIs.
 *
 *	 @author    Jake Howden
 */
public class Authentication {
	
	private String accessToken;
	
	private long expiry;
	
	private String refreshToken;
	
	private String clientId;
	
	private String clientSecret;
	
	public Authentication() {
		accessToken = null;
		refreshToken = System.getenv("SPOTIFY_REFRESH_TOKEN");
		clientId = System.getenv("SPOTIFY_CLIENT_ID");
		clientSecret = System.getenv("SPOTIFY_CLIENT_SECRET");
	}
	
	public String getToken() {
		return accessToken;
	}
	
	public void setToken(String token) {
		this.accessToken = token;
	}
	
	public long getExpiry() {
		return expiry;
	}
	
	public void setExpiry(long expiry) {
		this.expiry = expiry;
	}
	
	public String getRefreshToken() {
		return refreshToken;
	}
	
	public String getClientId() {
		return clientId;
	}
	
	public String getClientSecret() {
		return clientSecret;
	}
}
