package com.barclays.slabs;

import java.util.List;

public class IndiaSlabRule extends SlabRule {
	
	public IndiaSlabRule(List<TaxSlab> taxSlabs) {
		super(taxSlabs);
	}
	
	@Override
	public double calculateTaxBasedOnIncome(double taxableAmount) {
		return super.calculateTaxBasedOnIncome(taxableAmount);
	}
}