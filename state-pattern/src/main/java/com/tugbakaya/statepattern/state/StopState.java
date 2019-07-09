package com.tugbakaya.statepattern.state;

import com.tugbakaya.statepattern.Context;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("In Stop State");
		context.setState(this);
	}

}
