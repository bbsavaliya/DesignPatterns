package com.recharge.billing.user.impl;

import com.recharge.billing.user.AbstractUserProfile;
import com.recharge.billing.user.usage.IUsage;
import com.recharge.product.ValuePack;

public class UserProfile extends AbstractUserProfile {
	protected final ValuePack valuePack;
	protected final IUsage usage;
	
	public UserProfile(String userName, ValuePack valuePack, IUsage usage) {
		this.setUserName(userName);
		this.valuePack = valuePack;
		this.usage = usage;
	}
	
	@Override
	public ValuePack getValuePack() {
		return this.valuePack;
	}

	@Override
	public IUsage getUsage() {
		return this.usage;
	}
}