package com.tugbakaya.decoratorpattern.decorator;

import com.tugbakaya.decoratorpattern.shape.Shape;

public abstract class ShapeDecorator implements Shape {

	Shape decoratedShape;

	public ShapeDecorator(Shape shape) {
		this.decoratedShape = shape;
	}

	public void draw() {
		decoratedShape.draw();

	}

}
