package com.builderpattern.handson;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealbuilder = new MealBuilder();
		
		//Build and test the veg meal..
		Meal vegMeal = mealbuilder.prepareVegMeal();
		System.out.println("Veg Meal!!");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());
		System.out.println();
		
		//Build and test the non-veg meal..
		Meal NonVegMeal = mealbuilder.prepareVegMeal();
		System.out.println("Non Veg Meal!!");
		NonVegMeal.showItems();
		System.out.println("Total cost: " + NonVegMeal.getCost());
		System.out.println();
	}
}
