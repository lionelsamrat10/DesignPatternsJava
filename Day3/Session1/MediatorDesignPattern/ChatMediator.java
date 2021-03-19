package com.mediator.patter.handson;

import java.util.*;
public class ChatMediator implements IChatMediator {
	
	List<IUser> users;
	
	public ChatMediator(){
		//Create a new arraylist of users
		users = new ArrayList<>();
	}
	
	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, IUser sender) {
		for(IUser itr: users) {
			if(itr != sender) {
				//If user is not sender, it will receive the messages
				//Senders will only send the messages
				itr.receiveMessage(message);
			}
		}
	}

}
