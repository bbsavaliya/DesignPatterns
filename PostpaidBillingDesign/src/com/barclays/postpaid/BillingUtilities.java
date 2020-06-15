package com.barclays.postpaid;

import java.util.ArrayList;
import java.util.List;

import com.barclays.postpaid.billing.BillingTransaction;
import com.barclays.postpaid.composite.RechargeComponentType;

public class BillingUtilities {
	private static BillingTransaction billingTransaction;
	private static List<BillingTransaction> billingTransactions = new ArrayList<BillingTransaction>(300);
	
	public static void addLocalMinuteSession () {
		for (int i = 0; i < 1100 ; i++) {
			billingTransaction = new BillingTransaction(RechargeComponentType.LOCAL);
			billingTransaction.startSession();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			billingTransaction.endSession();
			billingTransactions.add(billingTransaction);
		}
	}
	
	
	public static void addSTDMinuteSession () {
		for (int i = 0; i < 400; i++) {
			billingTransaction = new BillingTransaction(RechargeComponentType.STD);
			billingTransaction.startSession();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			billingTransaction.endSession();
			billingTransactions.add(billingTransaction);
		}
	}
	
	public static void addInternetMinuteSession () {
		for (int i = 0; i < 900; i++) {
			billingTransaction = new BillingTransaction(RechargeComponentType.INTERNET_DATA);
			billingTransaction.startSession();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			billingTransaction.endSession();
			billingTransactions.add(billingTransaction);
		}
	}
	
	public static List<BillingTransaction> getBillingTranscations() {
		return billingTransactions;
	}
}
