package com.tugbakaya.strategypattern;

import com.tugbakaya.strategypattern.strategy.Addition;

public class StrategyPatternApplication {

	public static void main(String[] args) {
		System.out.println("Strategy Pattern Application");
		
		Context context = new Context();
		context.setStrategy(new Addition());
		context.getResult(10,5);

	}

}
