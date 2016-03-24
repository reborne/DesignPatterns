package com.reborne.designpatterns.builderpattern;

public class VegSandwich extends Sandwich {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "VegSandwich";
	}

}
