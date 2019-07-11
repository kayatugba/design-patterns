package com.tugbakaya.mediatorpattern;

import com.tugbakaya.mediatorpattern.user.User;

public class MediatorPatternApplication {

	public static void main(String[] args) {
		System.out.println("Mediator Pattern Application");
		User user1 = new User("user1");
		User user2 = new User("user2");
		user1.sendMessage("I am user1");
		user2.sendMessage("I am user2");
	}

}
