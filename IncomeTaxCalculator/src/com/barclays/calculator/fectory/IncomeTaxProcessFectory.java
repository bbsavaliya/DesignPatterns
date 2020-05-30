package com.barclays.calculator.fectory;

public interface IncomeTaxProcessFectory {
	public IncomeTaxCalculatorFectory createIncomeTaxCalculatorFectory();
	
	public ExemptionRuleFectory createExemptionRuleFectory();
	
	public SlabRuleFectory createSlabRuleFectory();
}