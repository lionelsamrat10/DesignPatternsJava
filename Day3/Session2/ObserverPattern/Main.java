package com.observer.pattern.handson;

public class Main {
	public static void main(String[] args) {
		Publisher pub = new Publisher();
		SubscriberOne sub1 = new SubscriberOne(pub);
		SubscriberTwo sub2 = new SubscriberTwo(pub);
		SubscriberThree sub3 = new SubscriberThree(pub);
		
		System.out.println("First State: ");
		pub.setState("State of all users changed!!!!");
		pub.detach(sub3);
	}
}
