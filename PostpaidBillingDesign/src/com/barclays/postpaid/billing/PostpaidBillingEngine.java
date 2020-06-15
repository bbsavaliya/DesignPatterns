package com.barclays.postpaid.billing;

import java.time.LocalDate;

import com.barclays.postpaid.composite.ValuePackComponent;

public class PostpaidBillingEngine implements BillingEngine {
	private final CustomerBilling customerBilling;
	public PostpaidBillingEngine(CustomerBilling customerBilling) {
	
		this.customerBilling = customerBilling;
	}
	
	@Override
	public double processBilling(LocalDate startDate, LocalDate endDate) {
		double totalBill = this.customerBilling.getRecharchPack().getBasePrice();
		for(ValuePackComponent valuePack : this.customerBilling.getRecharchPack().getValuePack()) {
			totalBill += this.billingAddition(valuePack, startDate, endDate);
		}
		
		return totalBill;
	}
	
	
	private Double billingAddition(ValuePackComponent valuePack, LocalDate startDate, LocalDate endDate) {
		return this.customerBilling
					.getBillingTransactions()
					.stream()
					.filter(billingTx -> (billingTx.getSessionStartTime().toLocalDate().equals(startDate) ||
											billingTx.getSessionStartTime().toLocalDate().equals(endDate)) &&
											valuePack.getRechargeComponentType() == billingTx.getRechargeComponentType()
							)
							.mapToDouble(billingTx -> billingTx.getTotalSessionTime())
							.collect(BillingAddition::new, BillingAddition::accept, BillingAddition::combine)
							.total(valuePack.getFreeMinutes(), valuePack.getExtraCharge());
							
	}
}