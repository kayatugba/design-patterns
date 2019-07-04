package com.tugbakaya.adapterpattern;

import com.tugbakaya.adapterpattern.mediaplayer.AudioPlayer;

public class AdapterPatternApplication {

	public static void main(String[] args) {
		System.out.println("Adapter pattern application");
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "mp3 file");
		player.play("mp4", "mp4 file");
		player.play("vlc", "vlc file");

	}

}
