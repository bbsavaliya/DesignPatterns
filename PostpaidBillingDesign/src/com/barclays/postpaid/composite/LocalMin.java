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

	@Override
	public RechargeComponentType getRechargeComponentType() {
		return rechargeComponentType;
	}

	@Override
	public int getFreeMinutes() {
		return this.localMins;
	}

	@Override
	public double getExtraCharge() {
		return this.localMinExtraCharge;
	}
}