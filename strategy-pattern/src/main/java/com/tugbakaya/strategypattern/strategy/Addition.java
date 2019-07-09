package com.tugbakaya.strategypattern.strategy;

public class Addition implements Strategy {

	public void doCalculation(int a, int b) {
		int result = a+b;
		System.out.println("Doing addition " + result);

	}

}
