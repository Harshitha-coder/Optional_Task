package com.xworkz.features.stream.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.features.stream.comparator.QuantityComparator;
import com.xworkz.features.stream.dto.GroceryDTO;

public class GroceryDAOImpl implements GroceryDAO {

	private Collection<GroceryDTO> collection = new ArrayList<GroceryDTO>();

	@Override
	public boolean create(GroceryDTO dto) {

		return this.collection.add(dto);
	}

	@Override
	public Optional<GroceryDTO> findOne(GrocerySearch search) {

		return this.collection.stream().filter((b) -> search.test(b)).findFirst();

	}

	@Override
	public Collection<GroceryDTO> findAll(GrocerySearch search) {

		return this.collection.stream().filter((g) -> search.test(g)).collect(Collectors.toList());

	}

	@Override
	public Optional<GroceryDTO> findByMaxQuantity() {

		QuantityComparator comparator = new QuantityComparator();
		return this.collection.stream().max(comparator);
	}

	@Override
	public Optional<GroceryDTO> findByManufacturedDate(Date date) {
		return this.collection.stream().filter((v) -> v.getManufacturedDate().equals(date)).findFirst();
	}

	/*@Override
	public Collection<GroceryDTO> findAllByExpiredDate() {
		
		return this.collection.stream().filter().collect(Collectors.toList());
	}*/
}
