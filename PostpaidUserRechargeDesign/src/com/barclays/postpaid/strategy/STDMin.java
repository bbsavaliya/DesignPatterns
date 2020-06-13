package com.barclays.postpaid.strategy;

import com.barclays.postpaid.component.Usage;

public class STDMin implements Billing {
	private final int stdMins;
	private final double stdMinCharge;
	
	public STDMin(int stdMins, double stdMinCharge) {
		this.stdMins = stdMins;
		this.stdMinCharge = stdMinCharge;
	}

	public int getStdMins() {
		return stdMins;
	}

	public double getStdMinCharge() {
		return stdMinCharge;
	}

	@Override
	public double calculateBill(Usage usage) {
		int totalUsage = usage.getStdMins() - this.stdMins;
		return totalUsage > 0 ? totalUsage * this.stdMinCharge : 0.0;
	}

	@Override
	public String toString() {
		return "STDMin [stdMins=" + stdMins + ", stdMinCharge=" + stdMinCharge + "]";
	}
}