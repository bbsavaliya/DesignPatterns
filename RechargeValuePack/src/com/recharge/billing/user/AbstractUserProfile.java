package com.recharge.billing.user;

public abstract class AbstractUserProfile implements IUserProfile {
	protected String userName;
	
	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String getUserName() {
		return this.userName;
	}
}