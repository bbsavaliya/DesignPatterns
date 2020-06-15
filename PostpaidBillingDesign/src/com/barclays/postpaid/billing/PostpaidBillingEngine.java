package com.barclays.postpaid.billing;

import java.time.LocalDateTime;
import java.util.List;

import com.barclays.postpaid.composite.RecharchPack;
import com.barclays.postpaid.composite.RechargeComponentType;
import com.barclays.postpaid.composite.ValuePackComponent;

public class PostpaidBillingEngine implements BillingEngine {
	private final List<BillingTransaction> billingTranscation;
	
	public PostpaidBillingEngine(List<BillingTransaction> billingTranscation) {
		this.billingTranscation = billingTranscation;
	}
	
	@Override
	public double processBilling(RecharchPack recharchPack, LocalDateTime billingDate) {
		
		int localUsageByMonth = this.findSessionUsageByRechargeComponent(RechargeComponentType.LOCAL, billingDate);
		int stdUsageByMonth = this.findSessionUsageByRechargeComponent(RechargeComponentType.STD, billingDate);
		int internetUsageByMonth = this.findSessionUsageByRechargeComponent(RechargeComponentType.INTERNET_DATA, billingDate);
		
		double totalBill = recharchPack.getBasePrice()
							+ this.findUsageChargeByRechargeComponent(recharchPack.getValuePack(), RechargeComponentType.LOCAL, localUsageByMonth)
							+ this.findUsageChargeByRechargeComponent(recharchPack.getValuePack(), RechargeComponentType.STD, stdUsageByMonth)
							+ this.findUsageChargeByRechargeComponent(recharchPack.getValuePack(), RechargeComponentType.INTERNET_DATA, internetUsageByMonth);
		
		return totalBill;
	}
	
	private int findSessionUsageByRechargeComponent(RechargeComponentType rechargeComponentType, LocalDateTime billingDate) {
		return this.billingTranscation.stream()
										.filter(billingTrans -> billingTrans.getSessionStartTime().getMonth().equals(billingDate.getMonth()) && 
																billingTrans.getSessionEndTime().getYear() == billingDate.getYear()
										).filter(billingTrans -> billingTrans.getRechargeComponentType() == rechargeComponentType)
										.mapToInt(bellingSession -> bellingSession.getTotalSessionTime())
										.sum();
	}
	
	private double findUsageChargeByRechargeComponent(List<ValuePackComponent> valuePackComponents, RechargeComponentType rechargeComponentType, int usage) {
		return valuePackComponents.stream()
									.filter(valuePack -> valuePack.getRechargeComponentType() == rechargeComponentType)
									.filter(valuePack -> (usage - valuePack.getFreeMinutes()) > 0)
									.mapToDouble(valuePack -> (usage - valuePack.getFreeMinutes()) * valuePack.getExtraCharge())
									.sum();
	}
}