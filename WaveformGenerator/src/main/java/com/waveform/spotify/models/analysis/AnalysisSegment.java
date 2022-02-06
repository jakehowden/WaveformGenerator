/*
 * AnalysisSegment
 * 
 * v1.0.0
 *
 * 31/01/2022
 */
package com.waveform.spotify.models.analysis;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "start",
  "duration",
  "confidence",
  "loudness_start",
  "loudness_max",
  "loudness_max_time",
  "loudness_end",
  "pitches",
  "timbre"
})
/**
 * 
 *	 The AnalysisSegment class is a model used in the deserialization
 *	 of a response from the Spotify track analysis endpoint.
 *	 
 *	 A segment details loudness and pitch throughout a certain segment of the song.
 * 
 *	 @author    Jake Howden
 */
public class AnalysisSegment {

  @JsonProperty("start")
  private Double start;
  @JsonProperty("duration")
  private Double duration;
  @JsonProperty("confidence")
  private Double confidence;
  @JsonProperty("loudness_start")
  private Double loudnessStart;
  @JsonProperty("loudness_max")
  private Double loudnessMax;
  @JsonProperty("loudness_max_time")
  private Double loudnessMaxTime;
  @JsonProperty("loudness_end")
  private Integer loudnessEnd;
  @JsonProperty("pitches")
  private List<Double> pitches = null;
  @JsonProperty("timbre")
  private List<Double> timbre = null;

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

  @JsonProperty("loudness_start")
  public Double getLoudnessStart() {
    return loudnessStart;
  }

  @JsonProperty("loudness_start")
  public void setLoudnessStart(Double loudnessStart) {
    this.loudnessStart = loudnessStart;
  }

  @JsonProperty("loudness_max")
  public Double getLoudnessMax() {
    return loudnessMax;
  }

  @JsonProperty("loudness_max")
  public void setLoudnessMax(Double loudnessMax) {
    this.loudnessMax = loudnessMax;
  }

  @JsonProperty("loudness_max_time")
  public Double getLoudnessMaxTime() {
    return loudnessMaxTime;
  }

  @JsonProperty("loudness_max_time")
  public void setLoudnessMaxTime(Double loudnessMaxTime) {
    this.loudnessMaxTime = loudnessMaxTime;
  }

  @JsonProperty("loudness_end")
  public Integer getLoudnessEnd() {
    return loudnessEnd;
  }

  @JsonProperty("loudness_end")
  public void setLoudnessEnd(Integer loudnessEnd) {
    this.loudnessEnd = loudnessEnd;
  }

  @JsonProperty("pitches")
  public List<Double> getPitches() {
    return pitches;
  }

  @JsonProperty("pitches")
  public void setPitches(List<Double> pitches) {
    this.pitches = pitches;
  }

  @JsonProperty("timbre")
  public List<Double> getTimbre() {
    return timbre;
  }

  @JsonProperty("timbre")
  public void setTimbre(List<Double> timbre) {
    this.timbre = timbre;
  }

}