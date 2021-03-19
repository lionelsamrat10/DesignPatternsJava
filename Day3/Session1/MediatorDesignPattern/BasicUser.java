package com.mediator.patter.handson;

public class BasicUser implements IUser {
	
	private IChatMediator chatmediator;
	private String name;
	
	//Parameterised Constructor to instansiate the instance variables
	public BasicUser(IChatMediator chatmediator, String name) {
		this.chatmediator = chatmediator;
		this.name = name;
	}
	
	@Override
	public void sendMessage(String message) {
		chatmediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(name + ": {Basic User} has received a message: " + message);
	}

}
