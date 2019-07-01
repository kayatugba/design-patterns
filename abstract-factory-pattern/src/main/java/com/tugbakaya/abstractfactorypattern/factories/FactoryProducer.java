package com.tugbakaya.abstractfactorypattern.factories;

public class FactoryProducer {

	public FactoryProducer() {
		// TODO Auto-generated constructor stub
	}
	
	public static CarFactory getCarFactory()
	{
		FactoryLocation factoryLocation = FactoryLocation.TURKEY;
		switch (factoryLocation) {
		case USA:
			return new USACarFactory();
		case TURKEY:
			return new TurkeyCarFactory();
		case ENGLAND:
			return new EnglandCarFactory();
		default:
			break;
		}
		return null;
	}

}
