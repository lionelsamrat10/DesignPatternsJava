package com.cts.solidprinciples.handsons.day1.session1.part1;

public class PhoneOrderClass implements ProcessOrderInterface{
	@Override
	public void ProcessOrder(String modelName) {
		//Process the order
		System.out.println(modelName + " order accepted!!");
	}

}
