package com.tugbakaya.statepattern;

import com.tugbakaya.statepattern.state.State;

public class Context {

	State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
