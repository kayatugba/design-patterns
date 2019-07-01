package com.tugbakaya.abstractfactorypattern;

import com.tugbakaya.abstractfactorypattern.cars.Car;
import com.tugbakaya.abstractfactorypattern.cars.CarType;
import com.tugbakaya.abstractfactorypattern.factories.CarFactory;
import com.tugbakaya.abstractfactorypattern.factories.FactoryProducer;

public class AbstractFactoryPatternApplication {

	public static void main(String[] args) {
		System.out.println("AbstractFactoryPatternApplication");
		
		CarFactory carFactory = FactoryProducer.getCarFactory();
		Car luxuryCar = carFactory.buildCar(CarType.LUXURY);
		

	}

}
