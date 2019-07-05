package com.tugbakaya.facadepattern;

import com.tugbakaya.facadepattern.shape.Circle;
import com.tugbakaya.facadepattern.shape.Rectangle;
import com.tugbakaya.facadepattern.shape.Shape;

public class ShapeFacade {

	private Shape rectangle;
	private Shape circle;

	public ShapeFacade() {
		rectangle = new Rectangle();
		circle = new Circle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

}
