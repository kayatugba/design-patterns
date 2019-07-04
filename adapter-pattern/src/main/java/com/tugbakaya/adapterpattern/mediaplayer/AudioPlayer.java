package com.tugbakaya.adapterpattern.mediaplayer;

public class AudioPlayer implements MediaPlayer {
	
	MediaPlayerAdapter mediaPlayerAdapter;

	public void play(String mediaType, String fileName) {
		if(mediaType == "mp3")
		{
			System.out.println("Playing in MediaPlayerClass " + mediaType + " "+ fileName);
		}
		else
		{
			mediaPlayerAdapter = new MediaPlayerAdapter();
			mediaPlayerAdapter.play(mediaType, fileName);
		}


	}

}
