package com.recharge.billing.user;

import com.recharge.billing.user.usage.IUsage;
import com.recharge.product.ValuePack;

public interface IUserProfile {
	public String getUserName();
	
	public void setUserName(String UserName);
	
	public ValuePack getValuePack();
	
	public IUsage getUsage(); 
}