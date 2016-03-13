package com.reborne.designpatterns.factorypattern;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Invoking Rectangle draw method");
	}

}
