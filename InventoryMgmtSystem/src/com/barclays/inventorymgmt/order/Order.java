package com.barclays.inventorymgmt.order;

import java.util.List;

import com.barclays.inventorymgmt.order.product.Item;

public class Order {
	private long orderId;
	private List<Item> demandedProductList;
	
	public Order(long orderId, List<Item> demandedProductList) {
		this.orderId = orderId;
		this.demandedProductList = demandedProductList;
	}

	public long getOrderId() {
		return orderId;
	}

	public List<Item> getDemandedProductList() {
		return demandedProductList;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", demandedProductList=" + demandedProductList + "]";
	}
}