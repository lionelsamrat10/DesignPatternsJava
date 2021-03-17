package com.abstractfactorypattern.handson;

public class FactoryGetter {
	public static Factory getFactory(String brand) {
		//If brand name is Mercedes then return its factory object
		if (brand.equalsIgnoreCase("Mercedes")) {
			return new MercedesFactory();
		}
		//If brand name is Audi then return its factory object
		else if (brand.equalsIgnoreCase("Audi")) {
			return new AudiFactory();
		}
		//Else return null
		return null;
	}
}
