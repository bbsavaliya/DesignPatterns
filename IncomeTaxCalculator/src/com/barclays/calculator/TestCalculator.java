package com.barclays.calculator;

import java.util.HashMap;
import java.util.Map;

import com.barclays.calculator.fectory.IncomeTaxCalculatorFectory;
import com.barclays.calculator.fectory.IndiaIncomeTaxCalculateFectory;
import com.barclays.calculator.fectory.IndiaIncomeTaxCalculatorFectory;
import com.barclays.exemptions.ExemptionRule;
import com.barclays.slabs.SlabRule;

public class TestCalculator {
	public static void main(String[] args) {
		final Map<INVESTMENT, Double> savings = new HashMap<INVESTMENT, Double>();
		savings.put(INVESTMENT.HOUSING_LOAN, 500000.0);
		savings.put(INVESTMENT.INVESTMENT_IN_PENSION_SCHEME, 150000.0);
		
		final Income income = new Income(1500000.0, savings);
		final IndiaIncomeTaxCalculateFectory incomeTaxCalculateFectory = new IndiaIncomeTaxCalculateFectory();
		final ExemptionRule exemptions  = incomeTaxCalculateFectory.createExemptionRuleFectory().createExemptionRule();
		final SlabRule slabs = incomeTaxCalculateFectory.createSlabRuleFectory().createSlabRule();
		
		IncomeTaxCalculatorFectory incomeTaxCalculatorFectory = new IndiaIncomeTaxCalculatorFectory();
		IncomeTaxCalculator calculator = incomeTaxCalculatorFectory.createIncomeTaxCalculator();
		double taxAmount = calculator.calculateIncome(income, exemptions, slabs);
		
		System.out.println("Total Tax Payable for this year : " + taxAmount);
	}
} 