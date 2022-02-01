/*
 * SimpleSegment
 * 
 * v1.0.0
 *
 * 31/01/2022
 */
package com.waveform.generator;

/**
 * 
 *	 The SimpleSegment class provides a lightweight version
 *	 of the com.waveform.spotify.models.AnalysisSegment class.
 * 
 *	 @author    Jake Howden
 *	 @see https://medium.com/swlh/creating-waveforms-out-of-spotify-tracks-b22030dd442b 
 *		  for the tutorial this code is adapted from.
 */
public class SimpleSegment {
	private Double start;
	private Double duration;
	private Double loudness;
	
	/**
	*  Constructor of SimpleSegment class.
	*
	* @param  trackDuration - the duration of the track.
	* @param  start - the starting point (in seconds) of the segment.
	* @param  duration - the duration (in seconds) of the segment.
	* @param  loudness - the overall loudness in decibels (dB) of the segment.
	*/
	public SimpleSegment(double trackDuration, double start, double duration, double loudness) {
		this.start = this.start / trackDuration;
		this.duration = this.duration / trackDuration;
		this.loudness = 1 - (Math.min(Math.max(loudness, -35), 0) / -35);
	}
	
	public Double getStart() {
		return start;
	}
	
	public void setStart(Double start) {
		this.start = start;
	}
	
	public Double getDuration() {
		return duration;
	}
	
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	
	public Double getLoudness() {
		return loudness;
	}
	
	public void setLoudness(Double loudness) {
		this.loudness = loudness;
	}
}
