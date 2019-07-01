package com.tugbakaya.abstractfactorypattern.factories;

import com.tugbakaya.abstractfactorypattern.cars.Car;
import com.tugbakaya.abstractfactorypattern.cars.CarType;

public abstract class CarFactory {
	
	FactoryLocation factoryLocation = null;
	
	public abstract Car buildCar(CarType carType);

}
