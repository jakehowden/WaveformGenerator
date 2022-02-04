/*
 * SpotifyInterface
 * 
 * v1.1.0
 *
 * 31/01/2022
 */
package com.waveform.spotify;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.apache.catalina.loader.WebappClassLoader;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waveform.spotify.models.OAuth;
import com.waveform.spotify.models.TrackAnalysisResponse;

/*
 * 
 *	 The SpotifyInterface class provides definitions for all methods 
 *	 defined in the ISpotifyInterface interface.
 * 
 *	 @author    Jake Howden
 */
public class SpotifyInterface {
	
	private String baseUrl = "https://api.spotify.com/v1/";
	private HttpClient client = HttpClient.newHttpClient();
	private ObjectMapper mapper = new ObjectMapper();
	
	public TrackAnalysisResponse analyseTrack(String trackId) throws IOException, InterruptedException, Exception {
		String endpoint = baseUrl + "audio-analysis/" + trackId;
		OAuth oauth = mapper.readValue(new File("src/main/json/oauth.json"), OAuth.class);
		HttpRequest request = HttpRequest.newBuilder()
				 						 .uri(URI.create(endpoint))
										 .header("Authorization", "Bearer " + oauth.getToken())
										 .GET()
										 .build();
		
		HttpResponse<String> response;
		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw e;
		}
		
		if(HttpStatus.valueOf(response.statusCode()).is2xxSuccessful()) {
			TrackAnalysisResponse analysis = mapper.readValue(response.body(), TrackAnalysisResponse.class);
			
			return analysis;
		} else {
			var e = new Exception();
			throw e;
		}
		
	}
}
