/*
 * Tracks
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
  "href",
  "items",
  "limit",
  "next",
  "offset",
  "previous",
  "total"
})
/**
 * 
 *	 The Tracks class is a model used in the deserialization
 *	 of a response from the Spotify search endpoint.
 *
 *	 @author    Jake Howden
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tracks {

  @JsonProperty("href")
  private String href;
  @JsonProperty("items")
  private List<SearchItem> items = null;
  @JsonProperty("limit")
  private Integer limit;
  @JsonProperty("next")
  private String next;
  @JsonProperty("offset")
  private Integer offset;
  @JsonProperty("previous")
  private String previous;
  @JsonProperty("total")
  private Integer total;

  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  @JsonProperty("items")
  public List<SearchItem> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<SearchItem> items) {
    this.items = items;
  }

  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  @JsonProperty("limit")
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  @JsonProperty("next")
  public void setNext(String next) {
    this.next = next;
  }

  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  @JsonProperty("offset")
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  @JsonProperty("previous")
  public String getPrevious() {
    return previous;
  }

  @JsonProperty("previous")
  public void setPrevious(String previous) {
    this.previous = previous;
  }

  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  @JsonProperty("total")
  public void setTotal(Integer total) {
    this.total = total;
  }

}