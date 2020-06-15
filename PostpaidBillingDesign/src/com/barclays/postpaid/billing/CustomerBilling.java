package com.barclays.postpaid.billing;

import java.util.ArrayList;
import java.util.List;

import com.barclays.postpaid.composite.RecharchPack;

public class CustomerBilling {
	private final long customerId;
	List<BillingTransaction> billingTransactions;
	private final RecharchPack recharchPack;
	
	public CustomerBilling(long customerId, RecharchPack recharchPack) {
		this.customerId = customerId;
		this.recharchPack = recharchPack;
		this.billingTransactions = new ArrayList<BillingTransaction>();
	}
	
	public void addBillingTranscation(BillingTransaction billingTransaction) {
		this.billingTransactions.add(billingTransaction);
	}

	public long getCustomerId() {
		return customerId;
	}

	public List<BillingTransaction> getBillingTransactions() {
		return billingTransactions;
	}

	public RecharchPack getRecharchPack() {
		return recharchPack;
	}
}