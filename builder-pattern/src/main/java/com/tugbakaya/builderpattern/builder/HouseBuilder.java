package com.tugbakaya.builderpattern.builder;

import com.tugbakaya.builderpattern.house.House;

public interface HouseBuilder {

	public void buildBasement();
	public void buildStructure();
	public void buildInterior();
	public void buildRoof();

	public House getHouse();

}
