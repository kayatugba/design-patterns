package com.tugbakaya.adapterpattern.advancedmediaplayer;

public class VLCPlayer implements AdvancedMediaPlayer {

	public void play(String mediaType, String fileName) {
		System.out.println("Playing in VLCPlayer " + mediaType + " " + fileName);

	}

}
