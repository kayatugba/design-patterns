package com.tugbakaya.builderpattern.engineer;

import com.tugbakaya.builderpattern.builder.HouseBuilder;
import com.tugbakaya.builderpattern.house.House;

public class CivilEngineer {

	HouseBuilder houseBuilder;

	public CivilEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void construct() {
		houseBuilder.buildBasement();
		houseBuilder.buildStructure();
		houseBuilder.buildRoof();
		houseBuilder.buildInterior();

	}

	public House getHouse() {
		return this.houseBuilder.getHouse();
	}

}
