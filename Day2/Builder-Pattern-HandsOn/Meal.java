package com.builderpattern.handson;
import java.util.*;
public class Meal {
	private List<Item> items = new ArrayList<>();
	
	//Add item to the list
	public void addItem(Item item) {
		items.add(item);
	}
	//Get cost of the items
	public float getCost() {
		float cost = 0.0f;
		
		for(Item item: items) {
			cost += item.price();
		}
		return cost;
	}
	//ShowItems
	public void showItems() {
		for(Item item: items) {
			System.out.println("Item: " + item.name());
			System.out.println("Packing: " + item.packing().pack());
			System.out.println("Price: " + item.price());
		}
	}
}
