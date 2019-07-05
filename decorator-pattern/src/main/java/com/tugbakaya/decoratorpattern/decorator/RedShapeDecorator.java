package com.tugbakaya.decoratorpattern.decorator;

import com.tugbakaya.decoratorpattern.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {



	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Adding red color");
	}
}
