package com.barclays.postpaid.component;

import com.barclays.postpaid.strategy.Billing;

public class LocalMin implements Billing {
	private final int loacalMins;
	private final double localMinCharge;
	
	public LocalMin(int localMins, double localMinCharge) {
		this.loacalMins = localMins;
		this.localMinCharge = localMinCharge;
	}

	public int getLoacalMins() {
		return loacalMins;
	}

	public double getLocalMinCharge() {
		return localMinCharge;
	}

	@Override
	public double calculateBill(Usage usage) {
		int totalUsage = usage.getLocalMins() - this.loacalMins;
		return totalUsage > 0 ? totalUsage * this.localMinCharge : 0.0;
	}

	@Override
	public String toString() {
		return "LocalMin [loacalMins=" + loacalMins + ", localMinCharge=" + localMinCharge + "]";
	}
}