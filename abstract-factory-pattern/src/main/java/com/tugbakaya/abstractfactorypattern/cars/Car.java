package com.tugbakaya.abstractfactorypattern.cars;

import com.tugbakaya.abstractfactorypattern.factories.FactoryLocation;

public class Car {

	CarType carType = null;
	FactoryLocation factoryLocation = null;
	
	
	public Car(CarType carType, FactoryLocation factoryLocation)
	{
		System.out.println("Creating "+ carType+" car in "+ factoryLocation);
		this.carType = carType;
		this.factoryLocation = factoryLocation;
	}

}
