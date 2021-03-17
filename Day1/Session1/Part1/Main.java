//Author: Samrat Mitra
package com.cts.solidprinciples.handsons.day1.session1.part1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		//Create the instance of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//The original test application of us
		System.out.println("Welcome to our site. Would you like to order or repair?");
		//Take the option chosen
		String processOption = sc.nextLine().toLowerCase().trim();
		
		switch(processOption) {
			case "order":
				System.out.println("Please provide the phone model name!!");
				PhoneOrderClass poc = new PhoneOrderClass();
				//Take the phone model name
				String phoneModelName = sc.nextLine();
				//call the process order method
				poc.ProcessOrder(phoneModelName);
				
				break;
			case "phonerepair":
				System.out.println("Please provide the Phone model name you want to repair!!");
				String phoneRepairModelName = sc.nextLine();
				
				//Create the instance of the PhoneRepairClass class
				PhoneRepairClass prc = new PhoneRepairClass();
				//Call the phone repair function
				prc.ProcessPhoneRepair(phoneRepairModelName);
				
				break;
				
			case "accessoryrepair":
				System.out.println("Please provide the Accessory name you want to repair!!");
				String accessoryRepairModelName = sc.nextLine();
				
				//Create the instance of the AccessoryRepairClass class
				AccessoryRepairClass arc = new AccessoryRepairClass();
				//Call the accessory repair function
				arc.ProcessAccessoryRepair(accessoryRepairModelName);
				
				break;
				
			default:
				System.out.println("Enter a valid option !!!!!");
				break;
		}
		//Close the Scanner sc object
		sc.close();
	}
}
