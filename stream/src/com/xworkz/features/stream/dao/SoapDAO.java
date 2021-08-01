package com.xworkz.features.stream.dao;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.features.stream.dto.SoapDTO;

public interface SoapDAO {

	boolean save(SoapDTO dto);

	Optional<SoapDTO> findTypeBypriceGreaterThan(double price);

	Optional<SoapDTO> findByBrand(String brand);

	Collection<SoapDTO> findAll();
}
