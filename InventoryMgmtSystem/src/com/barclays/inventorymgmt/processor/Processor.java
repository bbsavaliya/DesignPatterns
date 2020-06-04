package com.barclays.inventorymgmt.processor;

import com.barclays.inventorymgmt.OrderStatus;

public interface Processor<T> {
	public OrderStatus process(T order);
}