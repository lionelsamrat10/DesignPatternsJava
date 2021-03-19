package com.mediator.patter.handson;
public class Main {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		
		IUser basicUser = new BasicUser(chatMediator, "Samrat");
		IUser premiumUser = new PremiumUser(chatMediator, "Peter");
		
		chatMediator.addUser(basicUser);
		chatMediator.addUser(premiumUser);
		chatMediator.addUser(new BasicUser(chatMediator, "Joseph"));
		chatMediator.addUser(new PremiumUser(chatMediator, "Lionel"));
		
		premiumUser.sendMessage("Hi there!!");
	}

}
