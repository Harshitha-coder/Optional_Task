package com.xworkz.features.stream.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;


import com.xworkz.features.stream.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO {

	Collection<SoapDTO> collection = new ArrayList<SoapDTO>();

	@Override
	public boolean save(SoapDTO dto) {

		return this.collection.add(dto);
	}

	@Override
	public Optional<SoapDTO> findTypeBypriceGreaterThan(double price) {

		return this.collection.stream().filter((s) -> s.getPrice() > price).findFirst();
	}

	@Override
	public Optional<SoapDTO> findByBrand(String brand) {

		return this.collection.stream().filter((a) -> a.getBrand().equals(brand)).findFirst();
	}

	@Override
	public Collection<SoapDTO> findAll() {

		return this.collection;
	}
}
