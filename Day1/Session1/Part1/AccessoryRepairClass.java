package com.cts.solidprinciples.handsons.day1.session1.part1;

public class AccessoryRepairClass implements ProcessAccessoryRepairInterface{
	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " accessory repair accepted!!!");
	}
}
