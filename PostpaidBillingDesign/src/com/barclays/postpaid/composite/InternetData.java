package com.barclays.postpaid.composite;

public class InternetData extends ValuePackComponent {
	private final int internetData;
	private final double internetDataExtraCharge;
	private RechargeComponentType rechargeComponentType;

	public InternetData(int internetData, double internetDataExtraCharge, RechargeComponentType rechargeComponentType) {
		this.internetData = internetData;
		this.internetDataExtraCharge = internetDataExtraCharge;
		this.rechargeComponentType = rechargeComponentType;
	}
	
	@Override
	public RechargeComponentType getRechargeComponentType() {
		return rechargeComponentType;
	}

	@Override
	public int getFreeMinutes() {
		return this.internetData;
	}

	@Override
	public double getExtraCharge() {
		return this.internetDataExtraCharge;
	}
}