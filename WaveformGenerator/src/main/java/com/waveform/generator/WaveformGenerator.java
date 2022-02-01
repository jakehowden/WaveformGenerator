/*
 * WaveformGenerator
 * 
 * v1.0.0
 *
 * 31/01/2022
 */
package com.waveform.generator;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Segment;

import com.waveform.spotify.models.AnalysisSegment;
import com.waveform.spotify.models.TrackAnalysisResponse;

/**
 * 
 *	 The WaveformGenerator class generates a waveform image
 *	 using Spotify track analysis data.
 * 
 *	 @author    Jake Howden
 *	 @see https://medium.com/swlh/creating-waveforms-out-of-spotify-tracks-b22030dd442b 
 *		  for the tutorial this code is adapted from.
 */
public class WaveformGenerator {
	
	public void Generate (TrackAnalysisResponse analysis) {
		
		double trackDuration = analysis.getTrack().getDuration();
		
		List<SimpleSegment> segments = new ArrayList<>();
		for(AnalysisSegment s : analysis.getSegments()) {
			
			segments.add(new SimpleSegment(trackDuration, 
					s.getStart(), 
					s.getDuration(), 
					s.getLoudnessMax()));
		}
		
		
	}
	
}
