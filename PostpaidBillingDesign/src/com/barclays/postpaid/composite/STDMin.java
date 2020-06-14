package com.barclays.postpaid.composite;

public class STDMin extends ValuePackComponent {
	private final int stdMins;
	private final double stdMinExtraCharge;
	private RechargeComponentType rechargeComponentType;
	
	public STDMin(int stdMins, double stdMinExtraCharge, RechargeComponentType rechargeComponentType) {
		this.stdMins = stdMins;
		this.stdMinExtraCharge = stdMinExtraCharge;
		this.rechargeComponentType = rechargeComponentType;
	}
	
	public int getStdMins() {
		return stdMins;
	}

	public double getStdMinExtraCharge() {
		return stdMinExtraCharge;
	}

	public RechargeComponentType getRechargeComponentType() {
		return rechargeComponentType;
	}
}