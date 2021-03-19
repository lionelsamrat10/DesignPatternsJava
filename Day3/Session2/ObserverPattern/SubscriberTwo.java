package com.observer.pattern.handson;

public class SubscriberTwo implements Observer {

	Publisher publisher;
	
	public SubscriberTwo(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber two :: " + publisher.getState());
	}

}