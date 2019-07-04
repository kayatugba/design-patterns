package com.tugbakaya.adapterpattern.advancedmediaplayer;

public class Mp4Player implements AdvancedMediaPlayer {

	public void play(String mediaType, String fileName) {
		System.out.println("Playing in Mp4Player " + mediaType + " "+ fileName);

	}

}
