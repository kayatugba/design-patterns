package com.tugbakaya.builderpattern.builder;

import com.tugbakaya.builderpattern.house.House;

public class IglooHousebuilder implements HouseBuilder {

	private House house;

	public IglooHousebuilder() {
		this.house = new House();
	}

	public void buildBasement() {

		house.setBasement("Igloo basement");
	}

	public void buildStructure() {
		house.setStructure("Igloo structure");
		
	}

	public void buildInterior() {
		house.setInterior("Igloo interior");
		
	}

	public void buildRoof() {
		house.setRoof("Igloo roof");
		
	}

	public House getHouse() {
		return this.house;
	}

}
