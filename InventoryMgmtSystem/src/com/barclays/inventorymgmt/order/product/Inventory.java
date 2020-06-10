package com.barclays.inventorymgmt.order.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.barclays.inventorymgmt.order.Order;

public class Inventory {
	private List<InventoryProduct> inventoryProductList;
	
	public Inventory() {
		this.inventoryProductList = new ArrayList<InventoryProduct>();
	}
	
	public void addInventory(InventoryProduct inventoryProduct) {
		this.inventoryProductList.add(inventoryProduct);
	}
	
	private InventoryProduct findProdectByItem(Item item) {
		return this.inventoryProductList.stream()
								 .filter(inventoryProduct -> inventoryProduct.getName().equals(item.getName()) && 
										 	inventoryProduct.getBrand().equals(item.getBrand())
										).collect(Collectors.toList()).get(0);
	}
	
	public void processInventoryOrder(final Order order) {
		order.getDemandedItems().stream().filter(demandedItem -> demandedItem.getDemandedQuantity() > 0).forEach(demandedItem -> {
			final InventoryProduct inventoryProduct = this.findProdectByItem(demandedItem);
			final int remainingFulfilledQuantity = demandedItem.getDemandedQuantity() - demandedItem.getFullfilledQuantity();
			
			if(inventoryProduct.getQuantity() >= remainingFulfilledQuantity) {
				demandedItem.setFullfilledQuantity(remainingFulfilledQuantity);
			} else {
				demandedItem.setFullfilledQuantity(demandedItem.getFullfilledQuantity() + inventoryProduct.getQuantity());
			}
		});
	}
}