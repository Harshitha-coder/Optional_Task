package com.xworkz.features.stream.dao;

import com.xworkz.features.stream.dto.GroceryDTO;

@FunctionalInterface
public interface GrocerySearch {

	boolean test(GroceryDTO dto);
}
