package com.barclays.postpaid.billing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.barclays.postpaid.composite.RecharchPack;
import com.barclays.postpaid.composite.ValuePackComponent;

public class CustomerBilling implements BillingEngine {
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

	@Override
	public double processBilling(LocalDate startDate, LocalDate endDate) {
		double totalBill = this.recharchPack.getBasePrice();
		for(ValuePackComponent valuePack : this.recharchPack.getValuePack()) {
			totalBill += this.billingAddition(valuePack, startDate, endDate);
		}
		
		return totalBill;
	}
	
	
	private Double billingAddition(ValuePackComponent valuePack, LocalDate startDate, LocalDate endDate) {
		return this.billingTransactions
					.stream()
					.filter(billingTx -> (billingTx.getSessionStartTime().toLocalDate().equals(startDate) ||
											billingTx.getSessionStartTime().toLocalDate().equals(endDate)) &&
											valuePack.getRechargeComponentType() == billingTx.getRechargeComponentType()
							)
							.mapToDouble(billingTx -> billingTx.getTotalSessionTime())
							.collect(BillingAddition::new, BillingAddition::accept, BillingAddition::combine)
							.total(valuePack.getFreeMinutes(), valuePack.getExtraCharge());
							
	}
	
	public long getCustomerId() {
		return this.customerId;
	}
}