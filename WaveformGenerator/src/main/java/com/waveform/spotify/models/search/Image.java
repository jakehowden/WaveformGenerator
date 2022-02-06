/*
 * Image
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
  "height",
  "url",
  "width"
})
/**
 * 
 *	 The Image class is a model used in the deserialization
 *	 of a response from the Spotify search endpoint.
 *
 *	 @author    Jake Howden
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

  @JsonProperty("height")
  private Integer height;
  @JsonProperty("url")
  private String url;
  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  @JsonProperty("height")
  public void setHeight(Integer height) {
    this.height = height;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  @JsonProperty("width")
  public void setWidth(Integer width) {
    this.width = width;
  }
}