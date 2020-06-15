package com.barclays.postpaid;

import java.time.LocalDate;

import com.barclays.postpaid.billing.CustomerBilling;
import com.barclays.postpaid.billing.PostpaidBillingEngine;
import com.barclays.postpaid.builder.RechargePackBuilder;
import com.barclays.postpaid.builder.RechargePackDirector;
import com.barclays.postpaid.composite.RecharchPack;

public class PostpaidBillingEngineTest {
	public static void main(String[] args) {
		final RechargePackDirector rechargePackDirector = new RechargePackDirector(new RechargePackBuilder());
		final RecharchPack rechargePack = rechargePackDirector.construct300RechargePack();
		final CustomerBilling customerBilling = new CustomerBilling(1, rechargePack);
		
		BillingUtilities.addLocalMinuteSession(customerBilling);
		BillingUtilities.addSTDMinuteSession(customerBilling);
		BillingUtilities.addInternetMinuteSession(customerBilling);
		
		PostpaidBillingEngine billingEngine = new PostpaidBillingEngine(customerBilling);
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.now();
		
		double postpaidBill = billingEngine.processBilling(startDate, endDate);
		
		System.out.println("Postpaid Bill : " + postpaidBill);
	}
}