package com.barclays.inventorymgmt.order.product;

public class Item {
	private final String name;
	private final String brand;
	private final int actualQuantity;
	private int demandedQuantity;
	private int fullfilledQuantity;
	
	public Item(String name, String brand, int actualQuantity) {
		this.name = name;
		this.brand = brand;
		this.actualQuantity = this.demandedQuantity = actualQuantity;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}
	
	public int getActualQuantity() {
		return actualQuantity;
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
		return "Item [name=" + name + ", brand=" + brand + ", actualQuantity=" + actualQuantity + ", demandedQuantity="
				+ demandedQuantity + ", fullfilledQuantity=" + fullfilledQuantity + "]";
	}
}