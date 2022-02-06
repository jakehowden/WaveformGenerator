/*
 * ExternalUrl
 * 
 * v1.0.0
 *
 * 05/02/2022
 */
package com.waveform.spotify.models.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "spotify"
})
/**
 * 
 *	 The ExternalUrl class is a model used in the deserialization
 *	 of a response from the Spotify search endpoint.
 *
 *	 @author    Jake Howden
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalUrl {

  @JsonProperty("spotify")
  private String spotify;

  @JsonProperty("spotify")
  public String getSpotify() {
    return spotify;
  }

  @JsonProperty("spotify")
  public void setSpotify(String spotify) {
    this.spotify = spotify;
  }
}