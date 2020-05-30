package com.barclays.calculator.fectory;

public class IndiaIncomeTaxCalculateFectory implements IncomeTaxProcessFectory {

	@Override
	public IncomeTaxCalculatorFectory createIncomeTaxCalculatorFectory() {
		return new IndiaIncomeTaxCalculatorFectory();
	}

	@Override
	public ExemptionRuleFectory createExemptionRuleFectory() {
		return new IndiaExemptionRuleFectory();
	}

	@Override
	public SlabRuleFectory createSlabRuleFectory() {
		return new IndiaSlabRuleFectory();
	}

}