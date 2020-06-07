package com.barclays.inventorymgmt.builder;

import com.barclays.inventorymgmt.order.product.Inventory;
import com.barclays.inventorymgmt.order.product.InventoryProduct;

public class InventoryBuilder implements Builder {
	private Inventory inventory;
	
	public InventoryBuilder() {
		this.inventory = new Inventory();
	}
	
	@Override
	public InventoryBuilder add(InventoryProduct inventoryProduct) {
		this.inventory.addInventory(inventoryProduct);
		return this;
	}

	@Override
	public Inventory build() {
		return this.inventory;
	}
}