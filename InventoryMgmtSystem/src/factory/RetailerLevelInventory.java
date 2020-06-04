package factory;

import java.util.HashMap;
import java.util.Map;

import com.barclays.inventorymgmt.Product;

public class RetailerLevelInventory implements InventoryFactory {
	@Override
	public Inventory createInventory() {
		Map<Product, Integer> productsMap = new HashMap<>();
		
		productsMap.put(new Product(1, 500, "product1"), 10000);
		productsMap.put(new Product(2, 1000, "product2"), 50000);
		productsMap.put(new Product(3, 2000, "product3"), 25000);
		
		return new Inventory(productsMap);
	}
}