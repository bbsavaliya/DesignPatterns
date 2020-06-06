package com.barclays.inventorymgmt.order.product;

import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
	private List<InventoryProduct> inventoryProductList;
	
	public Inventory() {
	}
	
	public void add(List<InventoryProduct> inventoryProductList) {
		this.inventoryProductList = inventoryProductList;
	}
	
	private InventoryProduct findProdectByItem(Item item) {
		return this.inventoryProductList.stream()
								 .filter(inventoryProduct -> inventoryProduct.getName().equals(item.getName()) && 
										 	inventoryProduct.getBrand().equals(item.getBrand())
										).collect(Collectors.toList()).get(0);
	}
	
	public void processInventoryOrder(List<Item> demandedProductList, List<Item> shortageItemList, List<InventoryProduct> fulfilledProductList) {
		InventoryProduct inventoryProduct = null;
		
		for(Item item : demandedProductList) {
			inventoryProduct = this.findProdectByItem(item);
			if(item.getQuantity() > inventoryProduct.getQuantity()) {
				shortageItemList.add(new Item(item.getName(), item.getBrand(), item.getQuantity() - inventoryProduct.getQuantity()));
				fulfilledProductList.add(new InventoryProduct(inventoryProduct.getName(), inventoryProduct.getQuantity(), inventoryProduct.getBrand(), inventoryProduct.getDescription()));
			} else {
				fulfilledProductList.add(new InventoryProduct(inventoryProduct.getName(), item.getQuantity(), inventoryProduct.getBrand(), inventoryProduct.getDescription()));
			}
		}		
	}
}