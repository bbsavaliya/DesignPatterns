package com.barclays.postpaid.composite;

import java.util.ArrayList;
import java.util.List;

public class RecharchPack extends ValuePackComponent {
	private List<ValuePackComponent> valuePack;
	
	public RecharchPack() {
		this.valuePack = new ArrayList<ValuePackComponent>();
	}
	
	public void addComponent(ValuePackComponent valuePackComponent) {
		this.valuePack.add(valuePackComponent);
	}

	public List<ValuePackComponent> getValuePack() {
		return valuePack;
	}
}