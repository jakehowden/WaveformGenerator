/*
 * AnalysisMeta
 * 
 * v1.0.0
 *
 * 31/01/2022
 */
package com.waveform.spotify.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"analyzer_version",
"platform",
"detailed_status",
"status_code",
"timestamp",
"analysis_time",
"input_process"
})
/**
 * 
 *	 The AnalysisMeta class is a model used in the deserialization
 *	 of a response from the Spotify track analysis API.
 *	 
 *	 This contains meta data about the analysis of the track.
 * 
 *	 @author    Jake Howden
 */
public class AnalysisMeta {
	@JsonProperty("analyzer_version")
	private String analyzerVersion;
	
	@JsonProperty("platform")
	private String platform;
	
	@JsonProperty("detailed_status")
	private String detailedStatus;
	
	@JsonProperty("status_code")
	private int statusCode;
	
	@JsonProperty("timestamp")
	private int timestamp;
	
	@JsonProperty("analysis_time")
	private double analysisTime;
	
	@JsonProperty("input_process")
	private String inputProcess;

	@JsonProperty("analyzer_version")
	public String getAnalyzerVersion() {
	return analyzerVersion;
	}

	@JsonProperty("analyzer_version")
	public void setAnalyzerVersion(String analyzerVersion) {
		this.analyzerVersion = analyzerVersion;
	}

	@JsonProperty("platform")
	public String getPlatform() {
		return platform;
	}

	@JsonProperty("platform")
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@JsonProperty("detailed_status")
	public String getDetailedStatus() {
		return detailedStatus;
	}

	@JsonProperty("detailed_status")
	public void setDetailedStatus(String detailedStatus) {
		this.detailedStatus = detailedStatus;
	}

	@JsonProperty("status_code")
	public Integer getStatusCode() {
		return statusCode;
	}

	@JsonProperty("status_code")
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	@JsonProperty("timestamp")
	public Integer getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("analysis_time")
	public Double getAnalysisTime() {
		return analysisTime;
	}

	@JsonProperty("analysis_time")
	public void setAnalysisTime(Double analysisTime) {
		this.analysisTime = analysisTime;
	}

	@JsonProperty("input_process")
	public String getInputProcess() {
		return inputProcess;
	}

	@JsonProperty("input_process")
	public void setInputProcess(String inputProcess) {
		this.inputProcess = inputProcess;
	}
	
}
