package com.barclays.calculator;

import com.barclays.exemptions.ExemptionRule;
import com.barclays.slabs.SlabRule;

public class IncomeTaxCalculator {
	
	public double calculateIncome(Income income, ExemptionRule exemptions, SlabRule slabRule) {
		double deductions = exemptions.calculateDeductions(income);
		double taxableIncome = income.getTotalIncome() - deductions;
		return slabRule.calculateTaxBasedOnIncome(taxableIncome);
	}
}