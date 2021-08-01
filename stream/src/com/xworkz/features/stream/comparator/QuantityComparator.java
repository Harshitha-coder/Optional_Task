package com.xworkz.features.stream.comparator;

import java.util.Comparator;

import com.xworkz.features.stream.dto.GroceryDTO;

public class QuantityComparator implements Comparator<GroceryDTO> {

	@Override
	public int compare(GroceryDTO o1, GroceryDTO o2) {
		Double q1 = o1.getQuantity();
		Double q2 = o2.getQuantity();
		return q1.compareTo(q2);
	}
}
