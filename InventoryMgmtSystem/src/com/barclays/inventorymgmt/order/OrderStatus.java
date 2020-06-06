package com.barclays.inventorymgmt.order;

import java.util.List;

import com.barclays.inventorymgmt.order.product.InventoryProduct;
import com.barclays.inventorymgmt.order.product.Item;

public class OrderStatus {
	private final OrderStatusCategory orderStatusCategory;
	private final List<Item> demandedProductList;
	private final List<InventoryProduct> fullfilledProductList;
	
	public OrderStatus(long orderId, OrderStatusCategory orderStatusCategory, List<Item> demandedProductList, List<InventoryProduct> fullfilledProductList) {
		this.orderStatusCategory = orderStatusCategory;
		this.demandedProductList = demandedProductList;
		this.fullfilledProductList = fullfilledProductList;
	}

	public OrderStatusCategory getOrderStatusCategory() {
		return orderStatusCategory;
	}

	public List<Item> getDemandedProductList() {
		return demandedProductList;
	}

	public List<InventoryProduct> getFullfilledProductList() {
		return fullfilledProductList;
	}

	@Override
	public String toString() {
		return "OrderStatus [orderStatusCategory=" + orderStatusCategory + ", demandedProductList="
				+ demandedProductList + ", fullfilledProductList=" + fullfilledProductList + "]";
	}
}