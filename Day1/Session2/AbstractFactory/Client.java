package com.abstractfactorypattern.handson;

import java.util.*;
public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the brand name: ");
		String brandName = sc.nextLine();
		
		//Create the instance of Factory and hold the value returned by the getFactory()
		Factory fct = FactoryGetter.getFactory(brandName);
		
		if(fct != null) {
			fct.makeTire();
			fct.makeHeadLight();
		}else {
			System.out.println("You have entered wrong choice!!");
		}
	}

}
