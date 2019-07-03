package com.tugbakaya.prototypepattern;

import java.util.HashMap;

import com.tugbakaya.prototypepattern.shape.Circle;
import com.tugbakaya.prototypepattern.shape.Rectangle;
import com.tugbakaya.prototypepattern.shape.Shape;

public class ShapeStore {

	public static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

	static {
		Rectangle r = new Rectangle();
		r.setPositionX(10);
		r.setPositionY(20);
		shapeMap.put("Rectangle", r);
		Circle c = new Circle();
		c.setPositionX(100);
		c.setPositionY(200);
		shapeMap.put("Circle", c);
	}

	public static Shape getShape(String type) {

		return (Shape) shapeMap.get(type).clone();

	}

}
