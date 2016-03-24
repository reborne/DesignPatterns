package com.reborne.designpatterns.adapterpattern;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Now playing mp4 file. Name: "+fileName);
	}

	
}
