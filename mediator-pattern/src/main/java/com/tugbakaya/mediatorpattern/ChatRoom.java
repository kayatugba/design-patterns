package com.tugbakaya.mediatorpattern;

import com.tugbakaya.mediatorpattern.user.User;

public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.println(user.getUserName() + " " + message);
	}

}
