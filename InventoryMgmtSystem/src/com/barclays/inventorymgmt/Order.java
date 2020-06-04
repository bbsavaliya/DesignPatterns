package com.barclays.inventorymgmt;

import java.util.Map;

public class Order {
	private long orderId;
	private Map<Product, Integer> demandedProductList;
	
	public Order(long orderId, Map<Product, Integer> demandedProductList) {
		this.orderId = orderId;
		this.demandedProductList = demandedProductList;
	}

	public long getOrderId() {
		return orderId;
	}

	public Map<Product, Integer> getDemandedProductList() {
		return demandedProductList;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", demandedProductList=" + demandedProductList + "]";
	}
}