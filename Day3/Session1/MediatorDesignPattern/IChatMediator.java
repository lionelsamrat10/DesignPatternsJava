package com.mediator.patter.handson;

public interface IChatMediator {
	void addUser(IUser user);
	void sendMessage(String message, IUser sender);
}
