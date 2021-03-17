package com.abstractfactorypattern.handson;

public class AudiFactory extends Factory{

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}

	@Override
	public Headlight makeHeadLight() {
		return new AudiHeadlight();
	}
	
}
