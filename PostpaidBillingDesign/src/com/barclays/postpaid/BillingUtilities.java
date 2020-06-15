package com.barclays.postpaid;

import com.barclays.postpaid.billing.BillingTransaction;
import com.barclays.postpaid.billing.CustomerBilling;
import com.barclays.postpaid.composite.RechargeComponentType;

public class BillingUtilities {
	public static void addLocalMinuteSession (CustomerBilling customerBilling) {
		BillingTransaction local;
		for(int i=0;i<11;i++) {
			local = new BillingTransaction(RechargeComponentType.LOCAL);
			local.startSession();
			local.endSession();
			customerBilling.addBillingTranscation(local);
		}
	}
	
	
	public static void addSTDMinuteSession (CustomerBilling customerBilling) {
		BillingTransaction local;
		for(int i=0;i<4;i++) {
			local = new BillingTransaction(RechargeComponentType.STD);
			local.startSession();
			local.endSession();
			customerBilling.addBillingTranscation(local);
		}
	}
	
	public static void addInternetMinuteSession (CustomerBilling customerBilling) {
		BillingTransaction local;
		for(int i=0;i<9;i++) {
			local = new BillingTransaction(RechargeComponentType.INTERNET_DATA);
			local.startSession();
			local.endSession();
			customerBilling.addBillingTranscation(local);
		}
	}
}
