package com.reborne.designpatterns.builderpattern;

public class ChickenSandwich extends Sandwich{

	@Override
	public float price() {
		
		return 50.0f;
	}

	@Override
	public String name() {
		return "ChickenSandwich";
	}

	
}
