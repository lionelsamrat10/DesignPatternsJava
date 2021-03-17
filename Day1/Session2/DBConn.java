package com.designpatterns.handson.day1.session2.part1.dbclass;

public class DBConn {
	//Create a static private member instance to hold its own instance
	private static DBConn instance = new DBConn();
	
	//Make the constructor as private
	private DBConn() {}
	
	//Implement a getInstance() method
	public static DBConn getInstance() {
		return instance;
	}

	public static void getHashCode() {
		DBConn instanceDB = getInstance();
		System.out.println("Hash Code of instance is: " + instanceDB.hashCode());
	}
	
}
