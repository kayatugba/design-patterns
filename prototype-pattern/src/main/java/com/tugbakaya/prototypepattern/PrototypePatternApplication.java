
package com.tugbakaya.prototypepattern;

public class PrototypePatternApplication {
	public static void main(String[] args) {
		System.out.println("Prototype pattern application");
		ShapeStore.getShape("Rectangle").draw();
		ShapeStore.getShape("Circle").draw();

	}
}
