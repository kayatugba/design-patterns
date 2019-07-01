package com.tugbakaya.factorypattern;

import com.tugbakaya.factorypattern.factory.ShapeFactory;
import com.tugbakaya.factorypattern.shapes.Shape;
import com.tugbakaya.factorypattern.shapes.ShapeType;

public class FactoryPatternApplication {

	public static void main(String[] args) {
		System.out.println("Factory Pattern Application");
		ShapeFactory shapeFactory = new ShapeFactory();


		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();


		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();

		Shape triangle = shapeFactory.getShape(ShapeType.TRIANGLE);
		circle.draw();

	}

}
