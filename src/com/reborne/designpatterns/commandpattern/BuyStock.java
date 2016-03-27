package com.reborne.designpatterns.commandpattern;

public class BuyStock implements Order{
	
	private Stock abcdefStock;
	
	@Override
	public void execute() {
		abcdefStock.buy();
	}

	public BuyStock(Stock abcdefStock) {
		this.abcdefStock = abcdefStock;
	}

	
}
