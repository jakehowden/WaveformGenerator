package com.waveform.spotify;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.waveform.spotify.models.TrackAnalysisResponse;

public class SpotifyInterface {
	
	private String baseUrl = "https://api.spotify.com/v1/";
	private HttpClient client = HttpClient.newHttpClient();
	
	public TrackAnalysisResponse AnalyseTrack(String trackId) throws IOException, InterruptedException
	{
		String endpoint = baseUrl + "audio-analysis/" + trackId;
		HttpRequest request = HttpRequest.newBuilder()
										 .uri(URI.create(endpoint))
										 .build();
		
		HttpResponse<TrackAnalysisResponse> response;
		try {
			response = client.send(request, null);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw e;
		}
		
		return response.body();
	}
}
