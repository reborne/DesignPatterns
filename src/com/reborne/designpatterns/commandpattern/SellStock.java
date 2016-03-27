package com.reborne.designpatterns.commandpattern;

public class SellStock implements Order{

	private Stock abcdStock;
	
	public SellStock(Stock abcdStock) {
		this.abcdStock = abcdStock;
	}

	@Override
	public void execute() {
		abcdStock.sell();
	}

}
