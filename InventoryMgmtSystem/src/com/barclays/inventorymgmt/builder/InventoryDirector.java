package com.barclays.inventorymgmt.builder;

import com.barclays.inventorymgmt.order.product.Inventory;
import com.barclays.inventorymgmt.order.product.InventoryProduct;

public class InventoryDirector {
	private final Builder builder;
	
	public InventoryDirector(Builder builder) {
		this.builder = builder;
	}
	
	public Inventory createRetailInventory() {
		return this.builder.add(new InventoryProduct("Toothpaste", 1500, "Vicco", "Toothpaste"))
					.add(new InventoryProduct("Soap", 500, "Dettol", "Soap"))
					.add(new InventoryProduct("Shampoo", 1000, "Patanjali", "Shampoo"))
					.add(new InventoryProduct("Toothbrush", 1500, "Sensodyne", "Toothbrush"))
					.build();
	}
	
	public Inventory createDistributerInventory() {
		return this.builder.add(new InventoryProduct("Toothpaste", 2000, "Vicco", "Toothpaste"))
					.add(new InventoryProduct("Soap", 1000, "Dettol", "Soap"))
					.add(new InventoryProduct("Shampoo", 2500, "Patanjali", "Shampoo"))
					.add(new InventoryProduct("Toothbrush", 1000, "Sensodyne", "Toothbrush"))
					.build();
	}
	
	public Inventory createSupplierInventory() {
		return this.builder.add(new InventoryProduct("Toothpaste", 5000, "Vicco", "Toothpaste"))
					.add(new InventoryProduct("Soap", 2500, "Dettol", "Soap"))
					.add(new InventoryProduct("Shampoo", 3000, "Patanjali", "Shampoo"))
					.add(new InventoryProduct("Toothbrush", 2000, "Sensodyne", "Toothbrush"))
					.build();
	}
}