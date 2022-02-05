/*
 * AnalysisBar
 * 
 * v1.0.0
 *
 * 31/01/2022
 */
package com.waveform.spotify.models.analysis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "start",
  "duration",
  "confidence"
})
/**
 * 
 *	 The AnalysisBar class is a model used in the deserialization
 *	 of a response from the Spotify track analysis API.
 *	 
 *	 A bar (or measure) is a segment of time defined as a given number of beats.
 * 
 *	 @author    Jake Howden
 */
public class AnalysisBar {

  @JsonProperty("start")
  private Double start;
  @JsonProperty("duration")
  private Double duration;
  @JsonProperty("confidence")
  private Double confidence;

  @JsonProperty("start")
  public Double getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(Double start) {
    this.start = start;
  }

  @JsonProperty("duration")
  public Double getDuration() {
    return duration;
  }

  @JsonProperty("duration")
  public void setDuration(Double duration) {
    this.duration = duration;
  }

  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }

  @JsonProperty("confidence")
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

}