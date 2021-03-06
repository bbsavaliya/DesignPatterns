package com.barclays.exemptions;

import java.util.List;

import com.barclays.calculator.Income;

public class USExemptionRule extends ExemptionRule {
	
	public USExemptionRule(List<Exemption> exemptions) {
		super(exemptions);
	}
	
	@Override
	public double calculateDeductions(Income income) {
		return super.calculateDeductions(income);
	}
}