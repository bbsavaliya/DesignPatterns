package com.barclays.exemptions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.barclays.calculator.INVESTMENT;
import com.barclays.calculator.Income;

public class ExemptionRule {
	private final List<Exemption> exemptions;
	
	public ExemptionRule(List<Exemption> exemptions) {
		this.exemptions = exemptions;
	}
	
	private Exemption findByInvestment(INVESTMENT investment) {
		return this.exemptions.stream().filter(exemption -> exemption.getInvestment() == investment).collect(Collectors.toList()).get(0);
	}
	
	public double calculateDeductions(Income income) {
		double totalDeductions = 0.0;
		Map<INVESTMENT, Double> savings = income.getSavings();
		
		totalDeductions = savings.entrySet().stream().mapToDouble(entry -> {
			Exemption exemption = this.findByInvestment(entry.getKey());
			return entry.getValue() * exemption.getExemptionPercentage();
		}).sum();
		
		return totalDeductions;
	}
}