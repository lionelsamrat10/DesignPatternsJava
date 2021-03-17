package com.cts.solidprinciples.handsons.day1.session1.part1;

public class PhoneRepairClass implements ProcessPhoneRepairInterface {
	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!!");
	}

}
