package com.barclays.fundtransfer.model;

public class User {
	private final long userId;
	private final String password;
	
	public User(long userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public long getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}
}