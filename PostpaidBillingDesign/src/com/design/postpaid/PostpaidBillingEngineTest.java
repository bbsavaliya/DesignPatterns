package com.design.postpaid;

import java.time.LocalDate;

import com.design.postpaid.billing.CustomerBilling;
import com.design.postpaid.builder.RechargePackBuilder;
import com.design.postpaid.builder.RechargePackDirector;
import com.design.postpaid.composite.RecharchPack;

public class PostpaidBillingEngineTest {
	public static void main(String[] args) {
		final RechargePackDirector rechargePackDirector = new RechargePackDirector(new RechargePackBuilder());
		final RecharchPack rechargePack = rechargePackDirector.construct300RechargePack();
		final CustomerBilling customerBilling = new CustomerBilling(1, rechargePack);
		
		BillingUtilities.addLocalMinuteSession(customerBilling);
		BillingUtilities.addSTDMinuteSession(customerBilling);
		BillingUtilities.addInternetMinuteSession(customerBilling);
		
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.now();
		
		double postpaidBill = customerBilling.processBilling(startDate, endDate);
		
		System.out.println("Postpaid Bill : " + postpaidBill);
	}
}