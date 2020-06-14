package com.barclays.postpaid.composite;

public class LocalMin extends ValuePackComponent {
	private final int localMins;
	private final double localMinExtraCharge;
	private RechargeComponentType rechargeComponentType;

	public LocalMin(int localMins, double localMinExtraCharge, RechargeComponentType rechargeComponentType) {
		this.localMins = localMins;
		this.localMinExtraCharge = localMinExtraCharge;
		this.rechargeComponentType = rechargeComponentType;
	}
	
	public int getLocalMins() {
		return localMins;
	}

	public double getLocalMinExtraCharge() {
		return localMinExtraCharge;
	}

	public RechargeComponentType getRechargeComponentType() {
		return rechargeComponentType;
	}
}