package com.reborne.designpatterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f; // Total price
		
		for(Item item: items){
			cost += item.price();
		}
		return cost;
	}

	public void showItems(){
		for(Item item: items){
			System.out.println("Item name: " + item.name());
			System.out.println("Item packaging: " + item.packing().pack());
			System.out.println("Item Price: " + item.price());
		}
	}
}
