package com.reborne.designpatterns.statepattern;

public class StopState implements State {

	public String toString() {
		return "Stop State";
	}

	@Override
	public void doAction(Context context) {
		System.out.println("Human @ Stop State");
		context.setState(this);
	}
}
