package org.adele.growbeggars.model;

import java.util.HashMap;
import java.util.Map;

import org.adele.growbeggars.Constants.Item;

/*
 * 유저가 가지고 있는 아이템
 */
public class Inventory {
	private Map<Item, Integer> items;

	public Inventory() {
		items = new HashMap<>();
	}
	
	public int getCount(Item item) {
		if(items.containsKey(item)) {
			return items.get(item);
		}
		return 0;
	}
	
	public boolean useItem(Item item) {
		if(items.containsKey(item)) {
			if(items.get(item) > 0) {
				items.put(item, items.get(item) - 1);
				return true;
			}
		}
		return false;
	}
	
	public void addItem(Item item, int count) {
		if(items.containsKey(item)) {
			items.put(item, items.get(item) + count);
		} else {
			items.put(item, count);
		}
	}
	
}
