package com.waveform.spotify.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaAnalysis {
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
	
	public String getAnalyzerVersion() {
		return analyzerVersion;
	}
	
	public void setAnalyzerVersion(String av) {
		analyzerVersion = av;
	}
	
}
