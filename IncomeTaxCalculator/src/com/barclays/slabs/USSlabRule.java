package com.barclays.slabs;

import java.util.List;

public class USSlabRule extends SlabRule {

	public USSlabRule(List<TaxSlab> taxSlabs) {
		super(taxSlabs);
	}
	
	@Override
	public double calculateTaxBasedOnIncome(double taxableAmount) {
		return super.calculateTaxBasedOnIncome(taxableAmount);
	}
}