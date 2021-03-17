package com.cts.solidprinciples.handsons.day1.session1.part2;

import java.util.*;

//First Interface
	interface GetPhone {
		public abstract String getPhonePart1();
	}
	//Second Interface
	interface GetCost {
		public abstract double getPhonePart1Cost();
	}
	
	class GetPhoneDetails implements GetPhone{
		@Override
		public String getPhonePart1() {
			return "Display";
		}
	}
	
	class GetCostDetails implements GetCost{
		@Override
		public double getPhonePart1Cost() {
			return 500;
		}
	}

public class SOLID_Principles_DependencyInjection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of the Phone!!!");
		GetPhoneDetails gpd = new GetPhoneDetails();
		String part1 = gpd.getPhonePart1();
		
		System.out.println(part1 + " repaired!!");
		
		GetCostDetails gcd = new GetCostDetails();
		double partCost = gcd.getPhonePart1Cost();
		System.out.println("Repair cost = " + partCost * 0.5);
	}

}
