/*
 * WaveformGenerator
 * 
 * v1.0.0
 *
 * 31/01/2022
 */
package com.waveform.generator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	private String SpotifyGreen = "#1DB954";
	
	/**
	*  Generates a waveform image from the analysis of a Spotify track.
	*
	* @param  analysis - response from the Spotify track analysis API.
	* @return BufferedImage - representing the tracks waveform.
	*/
	public BufferedImage Generate (TrackAnalysisResponse analysis) {
		
		double trackDuration = analysis.getTrack().getDuration();
		
		List<SimpleSegment> segments = new ArrayList<>();
		for(AnalysisSegment s : analysis.getSegments()) {
			
			segments.add(new SimpleSegment(trackDuration, 
					s.getStart(), 
					s.getDuration(), 
					s.getLoudnessMax()));
		}
		
		List<Double> levels = new ArrayList<>();
		for(double i = 0.000; i < segments.size(); i += 0.001) {
			double threshold = i;
			Optional<SimpleSegment> s = segments.stream().filter((segment) -> threshold <= segment.getStart() + segment.getDuration()).findFirst();
			
			if(s.isPresent()) {
				double loudness = ((double)Math.round((s.get().getLoudness() / 2) * 100)) / 100;
				levels.add(loudness);
			}
		}
		
		return drawImage(levels);
	}
	
	/**
	*  Draws a waveform image from the given sound levels.
	*
	* @param  levels - the varying noise levels of the track.
	* @return BufferedImage - representing the tracks waveform.
	*/
	private BufferedImage drawImage(List<Double> levels) {
		int width = 1920;
		int height = 1080;
		BufferedImage img = new BufferedImage(width, height, 1);
		Graphics2D graphics = img.createGraphics();
		
		// Fill background
		graphics.setColor(Color.decode(SpotifyGreen));
		graphics.fillRect(0, 0, img.getWidth(), img.getHeight());
		
		// Draw Waves
		graphics.setColor(Color.white);
		for(int i = 0; i < width; i++) {
			// Draw a 4 pixel wide rectangle every 8 pixels
			if(i % 8 == 0) {
				double where = (double) i / width;
				int j = (int) Math.ceil(levels.size() * where);
				int h = (int) Math.round(levels.get(j) * height) / 2;
				
				// Mirror the rectangles, they now extend from the middle up and down.
				graphics.drawRect(i, (height / 2) - h, 4, h);
				graphics.fillRect(i, (height / 2) - h, 4, h);
				graphics.drawRect(i, (height / 2), 4, h);
				graphics.fillRect(i, (height / 2), 4, h);
			}
		}
		
		graphics.dispose();
		return img;
	}
	
}
