package com.tugbakaya.statepattern.state;

import com.tugbakaya.statepattern.Context;

public class StartState implements State {
	
	public void doAction(Context context) {
		System.out.println("In Start State");
		context.setState(this);
	}

}
