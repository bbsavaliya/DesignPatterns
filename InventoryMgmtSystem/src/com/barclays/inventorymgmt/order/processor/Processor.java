package com.barclays.inventorymgmt.order.processor;

import com.barclays.inventorymgmt.order.Order;

public interface Processor {
	public Order process(Order order);
}