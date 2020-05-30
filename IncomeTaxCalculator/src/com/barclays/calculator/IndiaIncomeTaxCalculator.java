package com.barclays.calculator;

import com.barclays.exemptions.ExemptionRule;
import com.barclays.slabs.SlabRule;

public class IndiaIncomeTaxCalculator extends IncomeTaxCalculator {
	@Override
	public double calculateIncome(Income income, ExemptionRule exemptions, SlabRule slabRule) {
		return super.calculateIncome(income, exemptions, slabRule);
	}
}