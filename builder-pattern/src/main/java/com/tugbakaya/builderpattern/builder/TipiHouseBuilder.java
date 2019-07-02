package com.tugbakaya.builderpattern.builder;

import com.tugbakaya.builderpattern.house.House;

public class TipiHouseBuilder implements HouseBuilder {

	private House house;

	public TipiHouseBuilder() {
		this.house = new House();
	}

	public void buildBasement() {
		house.setBasement("Tipi basement");

	}

	public void buildStructure() {
		house.setStructure("Tipi structure");

	}

	public void buildInterior() {
		house.setInterior("Tipi interior");

	}

	public void buildRoof() {
		house.setRoof("Tipi roof");

	}

	public House getHouse() {
		return this.house;
	}

}
