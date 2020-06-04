package com.barclays.inventorymgmt;

public class Product {
	private final long productId;
	private final double price;
	private final String productName;
	
	public Product(long productId, double price, String productName) {
		this.productId = productId;
		this.price = price;
		this.productName = productName;
	}

	public long getProductId() {
		return productId;
	}

	public double getPrice() {
		return price;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", productName=" + productName + "]";
	}
}