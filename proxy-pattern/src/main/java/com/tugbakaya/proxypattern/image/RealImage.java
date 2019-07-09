package com.tugbakaya.proxypattern.image;

public class RealImage implements Image {
	
	String fileName;
	
	public RealImage(String fileName)
	{
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	public void display() {
		System.out.println("Displaying image file" + fileName);

	}
	
	public void loadFromDisk(String fileName)
	{
		System.out.println("Loading from disk " + fileName);
	}

	

}
