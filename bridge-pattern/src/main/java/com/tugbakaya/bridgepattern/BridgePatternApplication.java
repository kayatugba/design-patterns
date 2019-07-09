package com.tugbakaya.bridgepattern;

import com.tugbakaya.bridgepattern.colordrawer.RedColorDrawer;
import com.tugbakaya.bridgepattern.shape.Shape;
import com.tugbakaya.bridgepattern.shape.Square;

public class BridgePatternApplication {

	public static void main(String[] args) {
		System.out.println("Bridge pattern application");
		Shape redSquare = new Square(10, 10, new RedColorDrawer());
		redSquare.draw();

	}
}
