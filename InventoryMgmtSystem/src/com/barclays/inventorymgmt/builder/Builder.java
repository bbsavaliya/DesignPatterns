package com.barclays.inventorymgmt.builder;

import com.barclays.inventorymgmt.order.product.Inventory;
import com.barclays.inventorymgmt.order.product.InventoryProduct;

public interface Builder {
	InventoryBuilder add(InventoryProduct inventoryProduct);
	
	Inventory build();
}