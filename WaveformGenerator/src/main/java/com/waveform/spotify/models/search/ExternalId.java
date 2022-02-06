/*
 * ExternalId
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
  "isrc"
})
/**
 * 
 *	 The ExternalId class is a model used in the deserialization
 *	 of a response from the Spotify search endpoint.
 *
 *	 @author    Jake Howden
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalId {

  @JsonProperty("isrc")
  private String isrc;

  @JsonProperty("isrc")
  public String getIsrc() {
    return isrc;
  }

  @JsonProperty("isrc")
  public void setIsrc(String isrc) {
    this.isrc = isrc;
  }

}