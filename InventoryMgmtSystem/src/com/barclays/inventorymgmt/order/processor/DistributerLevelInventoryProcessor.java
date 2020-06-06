package com.barclays.inventorymgmt.order.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.barclays.inventorymgmt.order.Order;
import com.barclays.inventorymgmt.order.OrderStatus;
import com.barclays.inventorymgmt.order.OrderStatusCategory;
import com.barclays.inventorymgmt.order.product.Inventory;
import com.barclays.inventorymgmt.order.product.InventoryProduct;
import com.barclays.inventorymgmt.order.product.Item;

public class DistributerLevelInventoryProcessor implements Processor {
	private final Processor nextProcessor;
	private final Inventory inventory;
	
	public DistributerLevelInventoryProcessor(Processor nextProcessor, Inventory inventory) {
		this.nextProcessor = nextProcessor;
		this.inventory = inventory;
	}
	
	@Override
	public OrderStatus process(final Order order) {
		List<Item> shortageItemList = new ArrayList<>();
		List<InventoryProduct> fulfilledProductList = new ArrayList<>();
		this.inventory.processInventoryOrder(order.getDemandedProductList(), shortageItemList, fulfilledProductList);
		
		if(null != this.nextProcessor && !shortageItemList.isEmpty()) {
			return this.nextProcessor.process(new Order(new Random().nextLong(), shortageItemList));
		}
		
		return new OrderStatus(order.getOrderId(), OrderStatusCategory.FULFILLED, order.getDemandedProductList(), fulfilledProductList);}
}