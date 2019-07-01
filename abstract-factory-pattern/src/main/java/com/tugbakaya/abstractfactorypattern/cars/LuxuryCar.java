package com.tugbakaya.abstractfactorypattern.cars;

import com.tugbakaya.abstractfactorypattern.factories.FactoryLocation;

public final class LuxuryCar extends Car {

	public LuxuryCar(CarType carType, FactoryLocation factoryLocation) {
		super(carType, factoryLocation);
	}

}
