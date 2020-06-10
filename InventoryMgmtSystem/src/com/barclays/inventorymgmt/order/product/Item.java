package com.barclays.inventorymgmt.order.product;

public class Item {
	private final String name;
	private final String brand;
	private int demandedQuantity;
	private int fullfilledQuantity;
	
	public Item(String name, String brand, int demandedQuantity) {
		this.name = name;
		this.brand = brand;
		this.demandedQuantity = demandedQuantity;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}
	
	public int getDemandedQuantity() {
		return demandedQuantity;
	}

	public void setDemandedQuantity(int demandedQuantity) {
		this.demandedQuantity = demandedQuantity;
	}

	public int getFullfilledQuantity() {
		return fullfilledQuantity;
	}

	public void setFullfilledQuantity(int fullfilledQuantity) {
		this.fullfilledQuantity = fullfilledQuantity;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", brand=" + brand + ", demandedQuantity="
				+ demandedQuantity + ", fullfilledQuantity=" + fullfilledQuantity + "]";
	}
}