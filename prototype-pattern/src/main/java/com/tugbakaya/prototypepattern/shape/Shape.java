package com.tugbakaya.prototypepattern.shape;

public abstract class Shape implements Cloneable {

	private int positionX;
	private int positionY;

	public abstract void draw();

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	public Object clone(){

		Object clonedObject = null;
		try
		{
		clonedObject = super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clonedObject;
	}

}
