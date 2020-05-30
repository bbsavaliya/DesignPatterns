package com.barclays.slabs;

import java.util.List;
import java.util.stream.Collectors;

public class SlabRule {
	private final List<TaxSlab> taxSlabs;
	
	public SlabRule(List<TaxSlab> taxSlabs) {
		this.taxSlabs = taxSlabs;
	}
	
	private TaxSlab findByTaxSlab(double taxableAmount) {
		return this.taxSlabs.stream().filter(taxSlab -> taxSlab.getMaxIncome() > taxableAmount).collect(Collectors.toList()).get(0);
	}
	
	public double calculateTaxBasedOnIncome(double taxableAmount) {
		TaxSlab taxSlab = this.findByTaxSlab(taxableAmount);
		return taxableAmount * taxSlab.getSlabPercentage();
	}
}