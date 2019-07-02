package com.tugbakaya.builderpattern;

import com.tugbakaya.builderpattern.builder.HouseBuilder;
import com.tugbakaya.builderpattern.builder.IglooHousebuilder;
import com.tugbakaya.builderpattern.builder.TipiHouseBuilder;
import com.tugbakaya.builderpattern.engineer.CivilEngineer;
import com.tugbakaya.builderpattern.house.House;

public class BuilderPatternApplication {

	public static void main(String[] args) {
		HouseBuilder houseBuilder = new TipiHouseBuilder();
		CivilEngineer civilEngineer = new CivilEngineer(houseBuilder);
		civilEngineer.construct();
		House house  = civilEngineer.getHouse();
		house.showHouseProperties();

	}

}
