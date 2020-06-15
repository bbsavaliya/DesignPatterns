package com.barclays.postpaid;

import java.time.LocalDateTime;
import java.util.List;

import com.barclays.postpaid.billing.BillingTransaction;
import com.barclays.postpaid.billing.PostpaidBillingEngine;
import com.barclays.postpaid.builder.RechargePackBuilder;
import com.barclays.postpaid.builder.RechargePackDirector;
import com.barclays.postpaid.composite.RecharchPack;

public class PostpaidBillingEngineTest {
	public static void main(String[] args) {
		final RechargePackDirector rechargePackDirector = new RechargePackDirector(new RechargePackBuilder());
		final RecharchPack rechargePack = rechargePackDirector.construct300RechargePack();
		
		BillingUtilities.addLocalMinuteSession();
		BillingUtilities.addSTDMinuteSession();
		BillingUtilities.addInternetMinuteSession();
		
		final List<BillingTransaction> billingTransactions = BillingUtilities.getBillingTranscations();
		PostpaidBillingEngine billingEngine = new PostpaidBillingEngine(billingTransactions);
		LocalDateTime localDateTime = LocalDateTime.now();
		localDateTime = localDateTime.withMonth(6);
		localDateTime = localDateTime.withYear(2020);
		
		double postpaidBill = billingEngine.processBilling(rechargePack, localDateTime);
		
		System.out.println("Postpaid Bill : " + postpaidBill);
	}
}