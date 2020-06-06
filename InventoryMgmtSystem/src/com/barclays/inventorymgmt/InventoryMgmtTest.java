package com.barclays.inventorymgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.barclays.inventorymgmt.builder.InventoryBuilder;
import com.barclays.inventorymgmt.builder.InventoryDirector;
import com.barclays.inventorymgmt.order.Order;
import com.barclays.inventorymgmt.order.OrderStatus;
import com.barclays.inventorymgmt.order.processor.DistributerLevelInventoryProcessor;
import com.barclays.inventorymgmt.order.processor.Processor;
import com.barclays.inventorymgmt.order.processor.RetailerLevelInventoryProcessor;
import com.barclays.inventorymgmt.order.processor.SupplierLevelInventoryProcessor;
import com.barclays.inventorymgmt.order.product.Inventory;
import com.barclays.inventorymgmt.order.product.Item;

public class InventoryMgmtTest {
	public static void main(String[] args) {
		final InventoryDirector inventoryDirector = new InventoryDirector(new InventoryBuilder());
		
		final Inventory retailerInventory = inventoryDirector.createRetailInventory();
		final Inventory distributerInventory = inventoryDirector.createDistributerInventory();
		final Inventory supplierInventory = inventoryDirector.createSupplierInventory();
		
		final Processor processor = new RetailerLevelInventoryProcessor(
										new DistributerLevelInventoryProcessor(
												new SupplierLevelInventoryProcessor(
														null, supplierInventory), distributerInventory), retailerInventory);
		
		List<Item> demandedProductList = new ArrayList<Item>();
		demandedProductList.add(new Item("Toothpaste", "Vicco", 2000));
		demandedProductList.add(new Item("Shampoo", "Patanjali", 1500));
		Order order = new Order(new Random().nextLong(), demandedProductList);
		final OrderStatus orderStatus = processor.process(order);
	
		System.out.println(orderStatus);
	}
	
}