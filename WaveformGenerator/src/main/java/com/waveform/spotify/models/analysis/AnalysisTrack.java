/*
 * AnalysisTrack
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
  "num_samples",
  "duration",
  "sample_md5",
  "offset_seconds",
  "window_seconds",
  "analysis_sample_rate",
  "analysis_channels",
  "end_of_fade_in",
  "start_of_fade_out",
  "loudness",
  "tempo",
  "tempo_confidence",
  "time_signature",
  "time_signature_confidence",
  "key",
  "key_confidence",
  "mode",
  "mode_confidence",
  "codestring",
  "code_version",
  "echoprintstring",
  "echoprint_version",
  "synchstring",
  "synch_version",
  "rhythmstring",
  "rhythm_version"
})
/**
 * 
 *	 The AnalysisTrack class is a model used in the deserialization
 *	 of a response from the Spotify track analysis endpoint.
 *	 
 *	 This class provides general information on the track which has been analysed.
 * 
 *	 @author    Jake Howden
 */
public class AnalysisTrack {

  @JsonProperty("num_samples")
  private Integer numSamples;
  @JsonProperty("duration")
  private Double duration;
  @JsonProperty("sample_md5")
  private String sampleMd5;
  @JsonProperty("offset_seconds")
  private Integer offsetSeconds;
  @JsonProperty("window_seconds")
  private Integer windowSeconds;
  @JsonProperty("analysis_sample_rate")
  private Integer analysisSampleRate;
  @JsonProperty("analysis_channels")
  private Integer analysisChannels;
  @JsonProperty("end_of_fade_in")
  private Integer endOfFadeIn;
  @JsonProperty("start_of_fade_out")
  private Double startOfFadeOut;
  @JsonProperty("loudness")
  private Double loudness;
  @JsonProperty("tempo")
  private Double tempo;
  @JsonProperty("tempo_confidence")
  private Double tempoConfidence;
  @JsonProperty("time_signature")
  private Integer timeSignature;
  @JsonProperty("time_signature_confidence")
  private Double timeSignatureConfidence;
  @JsonProperty("key")
  private Integer key;
  @JsonProperty("key_confidence")
  private Double keyConfidence;
  @JsonProperty("mode")
  private Integer mode;
  @JsonProperty("mode_confidence")
  private Double modeConfidence;
  @JsonProperty("codestring")
  private String codestring;
  @JsonProperty("code_version")
  private Double codeVersion;
  @JsonProperty("echoprintstring")
  private String echoprintstring;
  @JsonProperty("echoprint_version")
  private Double echoprintVersion;
  @JsonProperty("synchstring")
  private String synchstring;
  @JsonProperty("synch_version")
  private Integer synchVersion;
  @JsonProperty("rhythmstring")
  private String rhythmstring;
  @JsonProperty("rhythm_version")
  private Integer rhythmVersion;

  @JsonProperty("num_samples")
  public Integer getNumSamples() {
    return numSamples;
  }

  @JsonProperty("num_samples")
  public void setNumSamples(Integer numSamples) {
    this.numSamples = numSamples;
  }

  @JsonProperty("duration")
  public Double getDuration() {
    return duration;
  }

  @JsonProperty("duration")
  public void setDuration(Double duration) {
    this.duration = duration;
  }

  @JsonProperty("sample_md5")
  public String getSampleMd5() {
    return sampleMd5;
  }

  @JsonProperty("sample_md5")
  public void setSampleMd5(String sampleMd5) {
    this.sampleMd5 = sampleMd5;
  }

  @JsonProperty("offset_seconds")
  public Integer getOffsetSeconds() {
    return offsetSeconds;
  }

  @JsonProperty("offset_seconds")
  public void setOffsetSeconds(Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
  }

  @JsonProperty("window_seconds")
  public Integer getWindowSeconds() {
    return windowSeconds;
  }

  @JsonProperty("window_seconds")
  public void setWindowSeconds(Integer windowSeconds) {
    this.windowSeconds = windowSeconds;
  }

  @JsonProperty("analysis_sample_rate")
  public Integer getAnalysisSampleRate() {
    return analysisSampleRate;
  }

  @JsonProperty("analysis_sample_rate")
  public void setAnalysisSampleRate(Integer analysisSampleRate) {
    this.analysisSampleRate = analysisSampleRate;
  }

  @JsonProperty("analysis_channels")
  public Integer getAnalysisChannels() {
    return analysisChannels;
  }

  @JsonProperty("analysis_channels")
  public void setAnalysisChannels(Integer analysisChannels) {
    this.analysisChannels = analysisChannels;
  }

  @JsonProperty("end_of_fade_in")
  public Integer getEndOfFadeIn() {
    return endOfFadeIn;
  }

  @JsonProperty("end_of_fade_in")
  public void setEndOfFadeIn(Integer endOfFadeIn) {
    this.endOfFadeIn = endOfFadeIn;
  }

  @JsonProperty("start_of_fade_out")
  public Double getStartOfFadeOut() {
    return startOfFadeOut;
  }

  @JsonProperty("start_of_fade_out")
  public void setStartOfFadeOut(Double startOfFadeOut) {
    this.startOfFadeOut = startOfFadeOut;
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

  @JsonProperty("time_signature")
  public Integer getTimeSignature() {
    return timeSignature;
  }

  @JsonProperty("time_signature")
  public void setTimeSignature(Integer timeSignature) {
    this.timeSignature = timeSignature;
  }

  @JsonProperty("time_signature_confidence")
  public Double getTimeSignatureConfidence() {
    return timeSignatureConfidence;
  }

  @JsonProperty("time_signature_confidence")
  public void setTimeSignatureConfidence(Double timeSignatureConfidence) {
    this.timeSignatureConfidence = timeSignatureConfidence;
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

  @JsonProperty("codestring")
  public String getCodestring() {
    return codestring;
  }

  @JsonProperty("codestring")
  public void setCodestring(String codestring) {
    this.codestring = codestring;
  }

  @JsonProperty("code_version")
  public Double getCodeVersion() {
    return codeVersion;
  }

  @JsonProperty("code_version")
  public void setCodeVersion(Double codeVersion) {
    this.codeVersion = codeVersion;
  }

  @JsonProperty("echoprintstring")
  public String getEchoprintstring() {
    return echoprintstring;
  }

  @JsonProperty("echoprintstring")
  public void setEchoprintstring(String echoprintstring) {
    this.echoprintstring = echoprintstring;
  }

  @JsonProperty("echoprint_version")
  public Double getEchoprintVersion() {
    return echoprintVersion;
  }

  @JsonProperty("echoprint_version")
  public void setEchoprintVersion(Double echoprintVersion) {
    this.echoprintVersion = echoprintVersion;
  }

  @JsonProperty("synchstring")
  public String getSynchstring() {
    return synchstring;
  }

  @JsonProperty("synchstring")
  public void setSynchstring(String synchstring) {
    this.synchstring = synchstring;
  }

  @JsonProperty("synch_version")
  public Integer getSynchVersion() {
    return synchVersion;
  }

  @JsonProperty("synch_version")
  public void setSynchVersion(Integer synchVersion) {
    this.synchVersion = synchVersion;
  }

  @JsonProperty("rhythmstring")
  public String getRhythmstring() {
    return rhythmstring;
  }

  @JsonProperty("rhythmstring")
  public void setRhythmstring(String rhythmstring) {
    this.rhythmstring = rhythmstring;
  }

  @JsonProperty("rhythm_version")
  public Integer getRhythmVersion() {
    return rhythmVersion;
  }

  @JsonProperty("rhythm_version")
  public void setRhythmVersion(Integer rhythmVersion) {
    this.rhythmVersion = rhythmVersion;
  }
}