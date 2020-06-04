package com.barclays.inventorymgmt.processor;

import com.barclays.inventorymgmt.Order;
import com.barclays.inventorymgmt.OrderStatus;

public interface Processor {
	public OrderStatus process(Order order);
}