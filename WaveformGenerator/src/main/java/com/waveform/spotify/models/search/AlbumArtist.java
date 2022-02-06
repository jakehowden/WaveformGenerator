/*
 * AlbumArtist
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
  "external_urls",
  "href",
  "id",
  "name",
  "type",
  "uri"
})
/**
 * 
 *	 The AlbumArtist class is a model used in the deserialization
 *	 of a response from the Spotify search endpoint.
 *
 *	 @author    Jake Howden
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumArtist {

  @JsonProperty("external_urls")
  private ExternalUrl externalUrl;
  @JsonProperty("href")
  private String href;
  @JsonProperty("id")
  private String id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("type")
  private String type;
  @JsonProperty("uri")
  private String uri;

  @JsonProperty("external_urls")
  public ExternalUrl getExternalUrl() {
    return externalUrl;
  }

  @JsonProperty("external_urls")
  public void setExternalUrl(ExternalUrl externalUrl) {
    this.externalUrl = externalUrl;
  }

  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  @JsonProperty("uri")
  public void setUri(String uri) {
    this.uri = uri;
  }
}