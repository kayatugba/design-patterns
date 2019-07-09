package com.tugbakaya.proxypattern;

import com.tugbakaya.proxypattern.image.ProxyImage;

public class ProxyPatternApplication {

	public static void main(String[] args) {
		System.out.println("Proxy pattern application");
		ProxyImage proxyImage = new ProxyImage("Image.img");
		proxyImage.display();
		
		System.out.println("After first load");
		proxyImage.display();

	}

}
