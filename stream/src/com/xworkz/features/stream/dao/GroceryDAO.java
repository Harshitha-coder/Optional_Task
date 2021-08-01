package com.xworkz.features.stream.dao;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.xworkz.features.stream.dto.GroceryDTO;

public interface GroceryDAO {

	boolean create(GroceryDTO dto);

	Optional<GroceryDTO> findOne(GrocerySearch search);

	Collection<GroceryDTO> findAll(GrocerySearch search);

	Optional<GroceryDTO> findByMaxQuantity();

	Optional<GroceryDTO> findByManufacturedDate(Date date);

	//Collection<GroceryDTO> findAllByExpiredDate();
}
