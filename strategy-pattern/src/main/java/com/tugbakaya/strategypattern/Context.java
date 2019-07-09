package com.tugbakaya.strategypattern;

import com.tugbakaya.strategypattern.strategy.Strategy;

public class Context {
	
	Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void getResult(int a, int b)
	{
		strategy.doCalculation(a,b);
	}
	
	

}
