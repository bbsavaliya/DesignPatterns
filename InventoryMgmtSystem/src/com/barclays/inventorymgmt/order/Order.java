package com.barclays.inventorymgmt.order;

import java.util.List;

import com.barclays.inventorymgmt.order.product.Item;

public class Order {
	private long orderId;
	private OrderStatusCategory orderStatus;
	private List<Item> demandedItems;
	
	public Order(long orderId, List<Item> demandedProductList) {
		this.orderId = orderId;
		this.demandedItems = demandedProductList;
	}

	public long getOrderId() {
		return orderId;
	}

	public List<Item> getDemandedItems() {
		return demandedItems;
	}

	public OrderStatusCategory getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusCategory orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + ", demandedItems=" + demandedItems + "]";
	}

	public boolean isOrderFullFilled() {
		return !(this.demandedItems.stream().anyMatch(demandedItem -> demandedItem.getDemandedQuantity() - demandedItem.getFullfilledQuantity() > 0));
	}
}