/*
 * OAuthResponse
 * 
 * v1.0.0
 *
 * 04/02/2022
 */
package com.waveform.spotify.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "access_token",
  "token_type",
  "scope",
  "expires_in"
})
/*
 * 
 *	 The OAuthResponse class is the response model used 
 *	 when querying the Spotify refresh access token endpoint.
 *
 *	 @author    Jake Howden
 */
public class OAuthResponse {

  @JsonProperty("access_token")
  private String accessToken;
  
  @JsonProperty("token_type")
  private String tokenType;
  
  @JsonProperty("scope")
  private String scope;
  
  @JsonProperty("expires_in")
  private Integer expiresIn;

  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty("access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  @JsonProperty("token_type")
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(String scope) {
    this.scope = scope;
  }

  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

}