# Waveform Generator
Waveform generator is a tool written in Java to generate a 
1080p image of the waveform of any Spotify song.

The project currently has a full backend implementation, it could be deployed and integrated with a frontend system.

# How it works
The waveform generator has three steps to go from a track query to waveform image:
1. The user inputs a query string for a track, e.g. "The Beatles Yesterday". 
  This query string is sent to the Spotify search endpoint which returns tracks that match the query.
  Search endpoint is documented here: https://developer.spotify.com/documentation/web-api/reference/#/operations/search.
2. The user then selects an item from the results returned in step 1. This item has a track id that can be used to 
  request a track analysis from Spotify, this analysis contains details of the loudness of the track at certain segments
  in the song.
  Track analysis endpoint is documented here: https://developer.spotify.com/documentation/web-api/reference/#/operations/get-audio-analysis.
3. Using the analysis of the track, we can work out the sound level at certain segments of the track. 
  These sound levels are mapped onto an image as mirrored rectangles which results in a waveform.

Here is an example output:

![saved](https://user-images.githubusercontent.com/47042397/153032544-54e4548d-1227-46af-890b-8a1b98a9ddd7.png)

# Setup
The setup for the project is simple and only requires the setup of three environment variables.
1. Set up a Spotify app here: https://developer.spotify.com/dashboard. Once the app is created a Client Id and Secret will be generated.
  These are the first two environment variables needed. Set and name them SPOTIFY_CLIENT_ID and SPOTIFY_CLIENT_SECRET respectively 
  wherever you plan on running this project.
2. This project follows Spotify's Authorization Code Flow:
   
   ![AuthG_AuthoriztionCode](https://user-images.githubusercontent.com/47042397/152798439-c8098cac-3d51-4d08-8cae-a9d1370d9f88.png)
   
   Follow the Request User Authorization section first, which generates a code that can be exchanged for a refresh token.
   Once you have obtained the code, follow the Request Access Token section. This will generate your first access token
   but more importantly, will generate your refresh token.
   
   Set the refresh token as an environment variable named SPOTIFY_REFRESH_TOKEN.
 
 The project now has everything it needs to run and is ready to be integrated with a frontend system.

# TODO
I do plan to add a React.js frontend to this project which would 
mean the whole project could be deployed with no extra work.
