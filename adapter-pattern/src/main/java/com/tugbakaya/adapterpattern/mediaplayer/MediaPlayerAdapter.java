package com.tugbakaya.adapterpattern.mediaplayer;

import com.tugbakaya.adapterpattern.advancedmediaplayer.AdvancedMediaPlayer;
import com.tugbakaya.adapterpattern.advancedmediaplayer.Mp4Player;
import com.tugbakaya.adapterpattern.advancedmediaplayer.VLCPlayer;

public class MediaPlayerAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public void play(String mediaType, String fileName) {

		if (mediaType == "vlc") {
			advancedMediaPlayer = new VLCPlayer();
		} else if (mediaType == "mp4") {
			advancedMediaPlayer = new Mp4Player();

		}
		advancedMediaPlayer.play(mediaType, fileName);
	}

}
