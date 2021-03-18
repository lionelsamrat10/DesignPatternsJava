package com.adapterpattern.handson;

public class Test {

	public static void main(String[] args) {
		Movable buggatiVeyron = new BugattiVeyron();
		MovableAdapter bVAdapter = new MovableAdapterImpl(buggatiVeyron);
		
		System.out.println("Price in Euros: " + bVAdapter.getPrice());
		System.out.println("Speed in KMPH: " + bVAdapter.getSpeed());
	}

}
