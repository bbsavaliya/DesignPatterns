package com.barclays.inventorymgmt.order.product;

public class InventoryProduct {
	private final String name;
	private final int quantity;
	private final String brand;
	private final String description;
	
	public InventoryProduct(String name, int quantity,String brand, String description) {
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Object obj) {
		InventoryProduct inventoryProduct = (InventoryProduct)obj;
		return (this.name.equals(inventoryProduct.getName()) && this.brand.equals(inventoryProduct.getBrand())); 
	}
	
	@Override
	public String toString() {
		return "InventoryProduct [name=" + name + ", quantity=" + quantity + ", brand=" + brand + ", description="
				+ description + "]";
	}
}