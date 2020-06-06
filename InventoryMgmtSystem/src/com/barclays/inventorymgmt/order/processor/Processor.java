package com.barclays.inventorymgmt.order.processor;

import com.barclays.inventorymgmt.order.Order;
import com.barclays.inventorymgmt.order.OrderStatus;

public interface Processor {
	public OrderStatus process(Order order);
}