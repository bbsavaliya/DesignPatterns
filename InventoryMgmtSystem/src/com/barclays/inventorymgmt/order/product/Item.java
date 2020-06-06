package com.barclays.inventorymgmt.order.product;

public class Item {
	private final String name;
	private final String brand;
	private final int quantity;
	
	public Item(String name, String brand, int quantity) {
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", brand=" + brand + ", quantity=" + quantity + "]";
	}
}