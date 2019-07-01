package com.tugbakaya.abstractfactorypattern.factories;

import com.tugbakaya.abstractfactorypattern.cars.Car;
import com.tugbakaya.abstractfactorypattern.cars.CarType;
import com.tugbakaya.abstractfactorypattern.cars.LuxuryCar;
import com.tugbakaya.abstractfactorypattern.cars.MidiCar;
import com.tugbakaya.abstractfactorypattern.cars.MiniCar;

public class TurkeyCarFactory extends CarFactory {

	public TurkeyCarFactory() {
		this.factoryLocation = FactoryLocation.TURKEY;
	}

	@Override
	public Car buildCar(CarType carType) {
		switch (carType) {
		case LUXURY:
			return new LuxuryCar(carType, factoryLocation);
		case MIDI:
			return new MidiCar(carType, factoryLocation);
		case MINI:
			return new MiniCar(carType, factoryLocation);
		default:
			break;
		}
		return null;
	}

}
