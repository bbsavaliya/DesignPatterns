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
	
	public int getInternetData() {
		return internetData;
	}

	public double getInternetDataExtraCharge() {
		return internetDataExtraCharge;
	}

	public RechargeComponentType getRechargeComponentType() {
		return rechargeComponentType;
	}
}