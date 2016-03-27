package com.reborne.designpatterns.commandpattern;

public class Stock {
	private String name = "ABCDEF";
	private int quantity = 5;

	public void buy() {
		System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] sold");
	}
}
