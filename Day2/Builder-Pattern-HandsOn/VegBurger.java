package com.builderpattern.handson;

//This is the concrete class, that is extending the Burger class
public class VegBurger extends Burger{
	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
