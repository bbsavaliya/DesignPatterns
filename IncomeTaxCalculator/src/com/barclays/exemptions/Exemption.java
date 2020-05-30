package com.barclays.exemptions;

import com.barclays.calculator.INVESTMENT;

public class Exemption {
	private final INVESTMENT investment;
	private final double exemptionPercentage;
	
	public Exemption(INVESTMENT investment, double exemptionPercentage) {
		this.investment = investment;
		this.exemptionPercentage = exemptionPercentage;
	}

	public INVESTMENT getInvestment() {
		return investment;
	}

	public double getExemptionPercentage() {
		return exemptionPercentage;
	}
}