package com.xworkz.features.optional.dao;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.features.optional.dto.RogiDTO;

public interface RogiDAO {

	boolean save(RogiDTO dto);

	Optional<RogiDTO> findOne(RogiSearch search);

	Optional<Integer> totalSize();

	Optional<RogiDTO> findByMaxAge();
	
	Optional<RogiDTO> findByMinAge();

	Collection<RogiDTO> FindAll();

	Collection<RogiDTO> FindAll(RogiSearch search);
}
