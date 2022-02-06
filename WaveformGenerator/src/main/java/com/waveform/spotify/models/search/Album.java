/*
 * Album
 * 
 * v1.0.0
 *
 * 05/02/2022
 */
package com.waveform.spotify.models.search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "album_type",
  "artists",
  "external_urls",
  "href",
  "id",
  "images",
  "name",
  "release_date",
  "release_date_precision",
  "total_tracks",
  "type",
  "uri"
})
/**
 * 
 *	 The Album class is a model used in the deserialization
 *	 of a response from the Spotify search endpoint.
 *
 *	 @author    Jake Howden
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {

  @JsonProperty("album_type")
  private String albumType;
  @JsonProperty("artists")
  private List < Artist > artists = null;
  @JsonProperty("external_urls")
  private ExternalUrl externalUrl;
  @JsonProperty("href")
  private String href;
  @JsonProperty("id")
  private String id;
  @JsonProperty("images")
  private List < Image > images = null;
  @JsonProperty("name")
  private String name;
  @JsonProperty("release_date")
  private String releaseDate;
  @JsonProperty("release_date_precision")
  private String releaseDatePrecision;
  @JsonProperty("total_tracks")
  private Integer totalTracks;
  @JsonProperty("type")
  private String type;
  @JsonProperty("uri")
  private String uri;

  @JsonProperty("album_type")
  public String getAlbumType() {
    return albumType;
  }

  @JsonProperty("album_type")
  public void setAlbumType(String albumType) {
    this.albumType = albumType;
  }

  @JsonProperty("artists")
  public List < Artist > getArtists() {
    return artists;
  }

  @JsonProperty("artists")
  public void setArtists(List < Artist > artists) {
    this.artists = artists;
  }

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

  @JsonProperty("images")
  public List < Image > getImages() {
    return images;
  }

  @JsonProperty("images")
  public void setImages(List < Image > images) {
    this.images = images;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("release_date")
  public String getReleaseDate() {
    return releaseDate;
  }

  @JsonProperty("release_date")
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  @JsonProperty("release_date_precision")
  public String getReleaseDatePrecision() {
    return releaseDatePrecision;
  }

  @JsonProperty("release_date_precision")
  public void setReleaseDatePrecision(String releaseDatePrecision) {
    this.releaseDatePrecision = releaseDatePrecision;
  }

  @JsonProperty("total_tracks")
  public Integer getTotalTracks() {
    return totalTracks;
  }

  @JsonProperty("total_tracks")
  public void setTotalTracks(Integer totalTracks) {
    this.totalTracks = totalTracks;
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