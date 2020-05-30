package com.recharge.billing.strategy.impl;

import com.recharge.billing.strategy.IBillingStrategy;
import com.recharge.billing.user.IUserProfile;
import com.recharge.billing.user.usage.IUsage;
import com.recharge.product.ValuePack;

public class ValuePackBillingStrtegy implements IBillingStrategy {
	private final IUserProfile userProfile;
	
	public ValuePackBillingStrtegy(IUserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Override
	public double calculateBill() {
		ValuePack valuePack = this.userProfile.getValuePack();
		IUsage usage =this.userProfile.getUsage();
		
		int extraLocalMins = usage.getLocalMins() - valuePack.getLocalMins();
		int extraStdMins = usage.getStdMins() - valuePack.getStdMins();
		int extraData = usage.getInternetData() - valuePack.getInternetData();
		
		double totalCharges = valuePack.getBasePrice();
		if(extraLocalMins > 0) {
			totalCharges = totalCharges + (0.5 * extraLocalMins);
		}
		if(extraStdMins > 0) {
			totalCharges = totalCharges + (1 * extraStdMins);
		}
		if(extraData > 0) {
			totalCharges = totalCharges + (3 * extraData);
		}
		return totalCharges;
	}
}