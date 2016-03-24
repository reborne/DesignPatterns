package com.reborne.designpatterns.builderpattern;

public class Cola extends ColdDrink{

	@Override
	public String name() {
		return "Cola";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
