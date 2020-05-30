package com.recharge.main;

import com.recharge.billing.strategy.IBillingStrategy;
import com.recharge.billing.strategy.impl.ValuePackBillingStrtegy;
import com.recharge.billing.user.IUserProfile;
import com.recharge.billing.user.impl.UserProfile;
import com.recharge.billing.user.usage.IUsage;
import com.recharge.billing.user.usage.impl.Usage;
import com.recharge.builder.ValuePackBuilder;
import com.recharge.builder.impl.ValuePackBuilderImpl300;
import com.recharge.director.ValuePackDirector;
import com.recharge.product.ValuePack;

public class ValuePackBillingEngine {
	public static void main(String[] args) {
		ValuePackDirector director = new ValuePackDirector();
		ValuePackBuilder builder = new ValuePackBuilderImpl300();
		ValuePack valuePack = director.constructValuePack(builder);
		System.out.println(valuePack);
		
		IUsage usage = new Usage(1100, 400, 500);
		IUserProfile userProfile = new UserProfile("Brijesh", valuePack, usage);
		IBillingStrategy billingStrategy = new ValuePackBillingStrtegy(userProfile);
		
		double totalCharges = billingStrategy.calculateBill();
		System.out.println("Total Charges for Value Pack : " + totalCharges);
	}
}