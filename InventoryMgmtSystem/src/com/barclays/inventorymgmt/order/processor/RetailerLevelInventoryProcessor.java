package com.barclays.inventorymgmt.order.processor;

import com.barclays.inventorymgmt.order.Order;
import com.barclays.inventorymgmt.order.OrderStatusCategory;
import com.barclays.inventorymgmt.order.product.Inventory;

public class RetailerLevelInventoryProcessor implements Processor {
	private final Processor nextProcessor;
	private final Inventory inventory;
	
	public RetailerLevelInventoryProcessor(Processor nextProcessor, Inventory inventory) {
		this.nextProcessor = nextProcessor;
		this.inventory = inventory;
	}
	
	@Override
	public Order process(final Order order) {
		this.inventory.processInventoryOrder(order);
		
		if(null != this.nextProcessor && !order.isOrderFullFilled()) {
			return this.nextProcessor.process(order);
		}
		
		order.setOrderStatus(OrderStatusCategory.FULFILLED);
		return order;
	}
}