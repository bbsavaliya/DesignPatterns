package com.design.postpaid.composite;

public class STDMin extends ValuePackComponent {
	private final int stdMins;
	private final double stdMinExtraCharge;
	private RechargeComponentType rechargeComponentType;
	
	public STDMin(int stdMins, double stdMinExtraCharge, RechargeComponentType rechargeComponentType) {
		this.stdMins = stdMins;
		this.stdMinExtraCharge = stdMinExtraCharge;
		this.rechargeComponentType = rechargeComponentType;
	}

	@Override
	public RechargeComponentType getRechargeComponentType() {
		return rechargeComponentType;
	}

	@Override
	public int getFreeMinutes() {
		return this.stdMins;
	}

	@Override
	public double getExtraCharge() {
		return this.stdMinExtraCharge;
	}
}