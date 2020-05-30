package com.barclays.calculator.fectory;

import com.barclays.calculator.IncomeTaxCalculator;
import com.barclays.calculator.IndiaIncomeTaxCalculator;

public class IndiaIncomeTaxCalculatorFectory implements IncomeTaxCalculatorFectory {
	@Override
	public IncomeTaxCalculator createIncomeTaxCalculator() {
		return new IndiaIncomeTaxCalculator();
	}
}