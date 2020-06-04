package com.barclays.inventorymgmt.processor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.stream.Collectors;

import com.barclays.inventorymgmt.Order;
import com.barclays.inventorymgmt.OrderStatus;
import com.barclays.inventorymgmt.Product;

import factory.Inventory;

public class RetailerLevelInventoryProcessor implements Processor {
	private final Processor nextProcessor;
	private final Inventory inventory;
	
	public RetailerLevelInventoryProcessor(Processor nextProcessor, Inventory inventory) {
		this.nextProcessor = nextProcessor;
		this.inventory = inventory;
	}
	
	private int findByProductInInventory(Product product) {
		return this.inventory.getProductStore().entrySet().stream()
				.filter(entry -> entry.getKey().getProductId() == product.getProductId())
				.collect(Collectors.toList()).get(0).getValue();
	}
	
	@Override
	public OrderStatus process(Order order) {
		Map<Product, Integer> fulfilledStock = new HashMap<>();
		Map<Product, Integer> shortageStock = new HashMap<>();
		int inventoryQuantity = 0;
		int demandedQuantity = 0;
		Product demandedProduct;
		Order shortageOrder = null;

		Map<Product, Integer> demandedStock = order.getDemandedProductList();
		for (Entry<Product, Integer> entry : demandedStock.entrySet()) {
			inventoryQuantity = findByProductInInventory(entry.getKey());
			demandedQuantity = entry.getValue();
			demandedProduct = entry.getKey();

			if (inventoryQuantity >= demandedQuantity) {
				fulfilledStock.put(demandedProduct, demandedQuantity);
				return new OrderStatus(order.getOrderId(), "Fullfilled", order.getDemandedProductList(),fulfilledStock);
			} else if (inventoryQuantity < demandedQuantity) {
				shortageStock.put(demandedProduct, demandedQuantity - inventoryQuantity);
				shortageOrder = new Order(new Random().nextInt(), shortageStock);
			}
		}

		if (shortageOrder != null && nextProcessor != null) {
			OrderStatus orderStatus = nextProcessor.process(shortageOrder);
			if(orderStatus.getOrderStatus().equals("Fulfilled")) {
				return new OrderStatus(order.getOrderId(), "Fullfilled", order.getDemandedProductList(),fulfilledStock);
			}
		}
		return new OrderStatus(order.getOrderId(), "Not Fullfilled", order.getDemandedProductList(),fulfilledStock);
	}
}