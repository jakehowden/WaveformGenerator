package com.waveform.spotify.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthRequest {
	@JsonProperty("grant_type")
	private String grantType = "refresh_token";
	
	@JsonProperty("refresh_token")
	private String refreshToken;
	
	public OAuthRequest(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}
