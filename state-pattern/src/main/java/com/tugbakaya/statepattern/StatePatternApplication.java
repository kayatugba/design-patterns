package com.tugbakaya.statepattern;

import com.tugbakaya.statepattern.state.StartState;
import com.tugbakaya.statepattern.state.State;
import com.tugbakaya.statepattern.state.StopState;

public class StatePatternApplication {

	public static void main(String[] args) {
		System.out.println("State Pattern Application");
		Context context = new Context();
		State startState = new StartState();
		startState.doAction(context);
		
		State stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());

	}

}
