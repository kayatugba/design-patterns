package com.tugbakaya.factorypattern.factory;

import com.tugbakaya.factorypattern.shapes.Circle;
import com.tugbakaya.factorypattern.shapes.Shape;
import com.tugbakaya.factorypattern.shapes.ShapeType;
import com.tugbakaya.factorypattern.shapes.Square;
import com.tugbakaya.factorypattern.shapes.Triangle;

public class ShapeFactory {

	public Shape getShape(ShapeType shapeType) {
		switch (shapeType) {
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case TRIANGLE:
			return new Triangle();
		default:
			return null;
		}
	}

}
