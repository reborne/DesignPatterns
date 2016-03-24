package com.reborne.designpatterns.builderpattern;

public abstract class Sandwich implements Item{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	
	@Override
	public abstract float price();

}
