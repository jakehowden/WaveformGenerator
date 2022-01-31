package com.waveform.spotify.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "start",
  "duration",
  "confidence",
  "loudness",
  "tempo",
  "tempo_confidence",
  "key",
  "key_confidence",
  "mode",
  "mode_confidence",
  "time_signature",
  "time_signature_confidence"
})
public class AnalysisSection {

  @JsonProperty("start")
  private Integer start;
  @JsonProperty("duration")
  private Double duration;
  @JsonProperty("confidence")
  private Integer confidence;
  @JsonProperty("loudness")
  private Double loudness;
  @JsonProperty("tempo")
  private Double tempo;
  @JsonProperty("tempo_confidence")
  private Double tempoConfidence;
  @JsonProperty("key")
  private Integer key;
  @JsonProperty("key_confidence")
  private Double keyConfidence;
  @JsonProperty("mode")
  private Integer mode;
  @JsonProperty("mode_confidence")
  private Double modeConfidence;
  @JsonProperty("time_signature")
  private Integer timeSignature;
  @JsonProperty("time_signature_confidence")
  private Integer timeSignatureConfidence;
  
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(Integer start) {
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
  public Integer getConfidence() {
    return confidence;
  }

  @JsonProperty("confidence")
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  @JsonProperty("loudness")
  public Double getLoudness() {
    return loudness;
  }

  @JsonProperty("loudness")
  public void setLoudness(Double loudness) {
    this.loudness = loudness;
  }

  @JsonProperty("tempo")
  public Double getTempo() {
    return tempo;
  }

  @JsonProperty("tempo")
  public void setTempo(Double tempo) {
    this.tempo = tempo;
  }

  @JsonProperty("tempo_confidence")
  public Double getTempoConfidence() {
    return tempoConfidence;
  }

  @JsonProperty("tempo_confidence")
  public void setTempoConfidence(Double tempoConfidence) {
    this.tempoConfidence = tempoConfidence;
  }

  @JsonProperty("key")
  public Integer getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(Integer key) {
    this.key = key;
  }

  @JsonProperty("key_confidence")
  public Double getKeyConfidence() {
    return keyConfidence;
  }

  @JsonProperty("key_confidence")
  public void setKeyConfidence(Double keyConfidence) {
    this.keyConfidence = keyConfidence;
  }

  @JsonProperty("mode")
  public Integer getMode() {
    return mode;
  }

  @JsonProperty("mode")
  public void setMode(Integer mode) {
    this.mode = mode;
  }

  @JsonProperty("mode_confidence")
  public Double getModeConfidence() {
    return modeConfidence;
  }

  @JsonProperty("mode_confidence")
  public void setModeConfidence(Double modeConfidence) {
    this.modeConfidence = modeConfidence;
  }

  @JsonProperty("time_signature")
  public Integer getTimeSignature() {
    return timeSignature;
  }

  @JsonProperty("time_signature")
  public void setTimeSignature(Integer timeSignature) {
    this.timeSignature = timeSignature;
  }

  @JsonProperty("time_signature_confidence")
  public Integer getTimeSignatureConfidence() {
    return timeSignatureConfidence;
  }

  @JsonProperty("time_signature_confidence")
  public void setTimeSignatureConfidence(Integer timeSignatureConfidence) {
    this.timeSignatureConfidence = timeSignatureConfidence;
  }
}
