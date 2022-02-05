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
		/* 
		* Instead of having the value in seconds, divide by duration 
		* to give a value between 0 and 1.
		* 
		* Gives a clearer understanding of at what point 
		* this segment occurs in the song.
		*/ 
		this.start = start / trackDuration;
		this.duration = duration / trackDuration;
		
		/* 
		* In a similar fashion we want to make sure the value is between 0 and 1.
		* 
		* The loudness can be from 0dB to -60dB, however Spotify tracks 
		* rarely go below -35dB hence why this caps the loudness at -35dB.
		* 
		* This gives us a better idea of how loud this segment is at this time.
		*/ 
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
