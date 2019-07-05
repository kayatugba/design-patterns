package com.tugbakaya.decoratorpattern;

import com.tugbakaya.decoratorpattern.decorator.RedShapeDecorator;
import com.tugbakaya.decoratorpattern.shape.Circle;
import com.tugbakaya.decoratorpattern.shape.Shape;

public class DecoratorPatternApplication {

	public static void main(String[] args) {
		System.out.println("Decorator pattern application");
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();

	}

}
