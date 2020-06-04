package com.barclays.inventorymgmt;

import java.util.Map;

public class OrderStatus {
	private final long orderId;
	private final String orderStatus;
	private final Map<Product,Integer> demandedProductList;
	private final Map<Product,Integer> fullfilledProductList;
	
	public OrderStatus(long orderId, String orderStatus, Map<Product,Integer> demandedProductList, Map<Product,Integer> fullfilledProductList) {
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.demandedProductList = demandedProductList;
		this.fullfilledProductList = fullfilledProductList;
	}

	public long getOrderId() {
		return orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public Map<Product,Integer> getDemandedProductList() {
		return demandedProductList;
	}

	public Map<Product,Integer> getFullfilledProductList() {
		return fullfilledProductList;
	}

	@Override
	public String toString() {
		return "OrderStatus [orderId=" + orderId + ", orderStatus=" + orderStatus + ", demandedProductList="
				+ demandedProductList + ", fullfilledProductList=" + fullfilledProductList + "]";
	}
}