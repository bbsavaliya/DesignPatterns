package com.barclays.inventorymgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.barclays.inventorymgmt.builder.InventoryBuilder;
import com.barclays.inventorymgmt.builder.InventoryDirector;
import com.barclays.inventorymgmt.order.Order;
import com.barclays.inventorymgmt.order.processor.DistributerLevelInventoryProcessor;
import com.barclays.inventorymgmt.order.processor.Processor;
import com.barclays.inventorymgmt.order.processor.RetailerLevelInventoryProcessor;
import com.barclays.inventorymgmt.order.processor.SupplierLevelInventoryProcessor;
import com.barclays.inventorymgmt.order.product.Inventory;
import com.barclays.inventorymgmt.order.product.Item;

public class InventoryMgmtTest {
	public static void main(String[] args) {
		final Inventory retailerInventory = new InventoryDirector(new InventoryBuilder()).createRetailInventory();
		final Inventory distributerInventory = new InventoryDirector(new InventoryBuilder()).createDistributerInventory();
		final Inventory supplierInventory = new InventoryDirector(new InventoryBuilder()).createSupplierInventory();
		
		final Processor processor = new RetailerLevelInventoryProcessor(
										new DistributerLevelInventoryProcessor(
												new SupplierLevelInventoryProcessor(
														null, supplierInventory), distributerInventory), retailerInventory);
		
		List<Item> demandedItems = new ArrayList<Item>();
		demandedItems.add(new Item("Toothpaste", "Vicco", 25500));
		demandedItems.add(new Item("Shampoo", "Patanjali", 15500));
		Order order = new Order(new Random().nextLong(), demandedItems);
	
		System.out.println(processor.process(order));
	}
} 