package com.tugbakaya.facadepattern;

public class FacadePatternApplication {
	public static void main(String[] args) {
		System.out.println("Facade pattern application");

		ShapeFacade shapeFacade = new ShapeFacade();
		shapeFacade.drawCircle();
		shapeFacade.drawRectangle();

	}

}
