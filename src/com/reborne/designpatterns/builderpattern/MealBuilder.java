package com.reborne.designpatterns.builderpattern;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegSandwich());
		meal.addItem(new Cola());

		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenSandwich());
		meal.addItem(new SevenUp());
		return meal;
	}

}
