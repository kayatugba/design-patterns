package com.tugbakaya.bridgepattern.shape;

import com.tugbakaya.bridgepattern.colordrawer.ColorDrawer;

public abstract class Shape {

	ColorDrawer colorDrawer;
	int positionX;
	int positionY;

	public Shape(int positionX, int positionY, ColorDrawer colorDrawer) {
		this.colorDrawer = colorDrawer;
		this.positionX = positionX;
		this.positionY = positionY;

	}
	
	public void draw()
	{
		colorDrawer.draw();
	}

}
