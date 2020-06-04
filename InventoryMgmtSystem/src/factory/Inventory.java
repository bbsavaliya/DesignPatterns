package factory;

import java.util.Map;

import com.barclays.inventorymgmt.Product;

public class Inventory {
	private Map<Product, Integer> productStore;
	
	public Inventory(Map<Product, Integer> productStore) {
		this.productStore = productStore;
	}

	public Map<Product, Integer> getProductStore() {
		return productStore;
	}
}