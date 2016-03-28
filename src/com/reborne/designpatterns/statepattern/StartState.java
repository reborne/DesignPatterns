package com.reborne.designpatterns.statepattern;

public class StartState implements State {

	public String toString() {
		return "Start State";
	}

	@Override
	public void doAction(Context context) {
		System.out.println("Human @ the start state");
		context.setState(this);
		
	}
}
