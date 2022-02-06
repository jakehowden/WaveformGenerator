/*
 * TrackAnalysisResponse
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
"meta",
"track",
"bars",
"beats",
"sections",
"segments",
"tatums"
})
/**
 * 
 *	 The TrackAnalysisResponse class is the response model used 
 *	 when querying the Spotify track analysis endpoint.
 *
 *	 @author    Jake Howden
 */
public class TrackAnalysisResponse {
	@JsonProperty("meta")
	private AnalysisMeta meta;
	@JsonProperty("track")
	private AnalysisTrack track;
	@JsonProperty("bars")
	private List<AnalysisBar> bars = null;
	@JsonProperty("beats")
	private List<AnalysisBeat> beats = null;
	@JsonProperty("sections")
	private List<AnalysisSection> sections = null;
	@JsonProperty("segments")
	private List<AnalysisSegment> segments = null;
	@JsonProperty("tatums")
	private List<AnalysisTatum> tatums = null;
	
	@JsonProperty("meta")
	public AnalysisMeta getMeta() {
	  return meta;
	}

	@JsonProperty("meta")
	public void setMeta(AnalysisMeta meta) {
	  this.meta = meta;
	}

	@JsonProperty("track")
	public AnalysisTrack getTrack() {
	  return track;
	}

	@JsonProperty("track")
	public void setTrack(AnalysisTrack track) {
	  this.track = track;
	}

	@JsonProperty("bars")
	public List < AnalysisBar > getBars() {
	  return bars;
	}

	@JsonProperty("bars")
	public void setBars(List < AnalysisBar > bars) {
	  this.bars = bars;
	}

	@JsonProperty("beats")
	public List < AnalysisBeat > getBeats() {
	  return beats;
	}

	@JsonProperty("beats")
	public void setBeats(List < AnalysisBeat > beats) {
	  this.beats = beats;
	}

	@JsonProperty("sections")
	public List < AnalysisSection > getSections() {
	  return sections;
	}

	@JsonProperty("sections")
	public void setSections(List < AnalysisSection > sections) {
	  this.sections = sections;
	}

	@JsonProperty("segments")
	public List < AnalysisSegment > getSegments() {
	  return segments;
	}

	@JsonProperty("segments")
	public void setSegments(List < AnalysisSegment > segments) {
	  this.segments = segments;
	}

	@JsonProperty("tatums")
	public List < AnalysisTatum > getTatums() {
	  return tatums;
	}

	@JsonProperty("tatums")
	public void setTatums(List < AnalysisTatum > tatums) {
	  this.tatums = tatums;
	}
}
