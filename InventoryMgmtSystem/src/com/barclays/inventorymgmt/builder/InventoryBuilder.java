package com.barclays.inventorymgmt.builder;

import java.util.ArrayList;
import java.util.List;

import com.barclays.inventorymgmt.order.product.Inventory;
import com.barclays.inventorymgmt.order.product.InventoryProduct;

public class InventoryBuilder implements Builder {
	private List<InventoryProduct> inventoryProductList;
	private Inventory inventory;
	
	public InventoryBuilder() {
		this.inventoryProductList = new ArrayList<InventoryProduct>();
	}
	
	@Override
	public InventoryBuilder add(InventoryProduct inventoryProduct) {
		this.inventoryProductList.add(inventoryProduct);
		return this;
	}

	@Override
	public Inventory build() {
		this.inventory = new Inventory();
		this.inventory.add(inventoryProductList);
		return this.inventory;
	}
}