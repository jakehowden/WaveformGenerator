/*
 * SpotifyInterface
 * 
 * v1.1.0
 *
 * 31/01/2022
 */
package com.waveform.spotify;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Instant;
import java.util.Base64;

import org.springframework.http.HttpStatus;

import javax.ws.rs.BadRequestException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waveform.spotify.models.Authentication;
import com.waveform.spotify.models.OAuthResponse;
import com.waveform.spotify.models.TrackAnalysisResponse;

/*
 * 
 *	 The SpotifyInterface class provides definitions for all methods 
 *	 defined in the ISpotifyInterface interface.
 * 
 *	 @author    Jake Howden
 */
public class SpotifyInterface {
	
	private String accountsBase = "https://accounts.spotify.com/";
	private String apiBase = "https://api.spotify.com/v1/";
	private Authentication auth = new Authentication();
	private HttpClient client = HttpClient.newHttpClient();
	private ObjectMapper mapper = new ObjectMapper();
	
	public TrackAnalysisResponse analyseTrack(String trackId) throws IOException, InterruptedException, BadRequestException {
		
		if(auth.getToken() == null || auth.getExpiry() < Instant.now().getEpochSecond()) {
			// access Token is null or expired
			refreshAccessToken();
		}
		
		String endpoint = apiBase + "audio-analysis/" + trackId;
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(endpoint))
				.header("Authorization", auth.getToken())
				.GET()
				.build();
		
		HttpResponse<String> response;
		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			throw e;
		}
		
		if(HttpStatus.valueOf(response.statusCode()).is2xxSuccessful()) {
			TrackAnalysisResponse analysis = mapper.readValue(response.body(), TrackAnalysisResponse.class);
			return analysis;
		} else {
			var e = new BadRequestException("Status Code: " + response.statusCode() + ". Body: " + response.body());
			throw e;
		}
	}
	
	public void refreshAccessToken() throws IOException, InterruptedException {
		String endpoint = accountsBase + "api/token/";
		String authHeader = Base64.getEncoder()
				.encodeToString((auth.getClientId() + ":" + auth.getClientSecret()).getBytes());
		var body = HttpRequest.BodyPublishers.ofString(authHeader);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(endpoint))
				.header("Authorization", "Basic" + authHeader)
				.header("Content-Type", "application/x-www-form-urlencoded")
				.POST(body)
				.build();
		
		HttpResponse<String> response;
		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			throw e;
		}
		
		if(HttpStatus.valueOf(response.statusCode()).is2xxSuccessful()) {
			OAuthResponse oAuth = mapper.readValue(response.body(), OAuthResponse.class);
			auth.setToken(oAuth.getAccessToken());
			// add expires in seconds to current Epoch seconds
			auth.setExpiry((Instant.now().getEpochSecond() + oAuth.getExpiresIn())); 
		} else {
			var e = new BadRequestException("Status Code: " + response.statusCode() + ". Body: " + response.body());
			throw e;
		}
	}
}
