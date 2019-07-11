package com.tugbakaya.mediatorpattern.user;

import com.tugbakaya.mediatorpattern.ChatRoom;

public class User {
	
	private String userName;
	
	public User(String userName)
	{
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void sendMessage(String message)
	{
		ChatRoom.showMessage(this, message);
	}
	
	

}
