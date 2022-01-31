package com.waveform.spotify.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackAnalysis {
	@JsonProperty("num_samples")
	int numberSamples;
	
	@JsonProperty("duration")
	double duration;
	
	@JsonProperty("sample_md5")
	String sample_md5;
	
	@JsonProperty("offset_seconds")
	int offsetSeconds;
	
	@JsonProperty("window_seconds")
	int windowSeconds;
	
	@JsonProperty("analysis_sample_rate")
	int analysisSampleRate;
	
	@JsonProperty("analysis_channels")
	int analysisChannels;
}
