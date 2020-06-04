package com.barclays.inventorymgmt.processor;

import com.barclays.inventorymgmt.Order;
import com.barclays.inventorymgmt.OrderStatus;

import factory.Inventory;

public class SupplierLevelInventoryProcessor implements Processor {
	private final Processor nextProcessor;
	private final Inventory inventory;

	public SupplierLevelInventoryProcessor(Processor nextProcessor, Inventory inventory) {
		this.nextProcessor = nextProcessor;
		this.inventory = inventory;
	}
	
	@Override
	public OrderStatus process(Order order) {
		return null;
	}
}