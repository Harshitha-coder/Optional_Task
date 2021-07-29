package com.xworkz.features.optional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.xworkz.features.optional.dto.RogiDTO;

public class RogiDAOImpl implements RogiDAO {

	List<RogiDTO> list = new ArrayList<RogiDTO>();

	@Override
	public boolean save(RogiDTO dto) {
		boolean added = this.list.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public Optional<RogiDTO> findOne(RogiSearch search) {
		Iterator<RogiDTO> itr = list.iterator();
		Optional<RogiDTO> findOne = Optional.empty();
		while (itr.hasNext()) {
			RogiDTO dto = itr.next();
			if (search.huduku(dto)) {
				findOne = Optional.of(dto);
			}
		}
		return findOne;
	}

	@Override
	public Optional<Integer> totalSize() {
		int total = this.list.size();
		Optional<Integer> totalSize = Optional.of(total);
		return totalSize;
	}

	@Override
	public Optional<RogiDTO> findByMaxAge() {
		Optional<RogiDTO> age = Optional.empty();
		age = Optional.of(Collections.max(list));
		return age;
	}

	@Override
	public Optional<RogiDTO> findByMinAge() {
		Optional<RogiDTO> age = Optional.empty();
		age = Optional.of(Collections.min(list));
		return age;
	}

	@Override
	public Collection<RogiDTO> FindAll() {
		Collection<RogiDTO> findAll = new ArrayList<RogiDTO>();
		findAll = this.list;
		return findAll;
	}

	@Override
	public Collection<RogiDTO> FindAll(RogiSearch search) {
		Collection<RogiDTO> findAll = new ArrayList<RogiDTO>();
		list.forEach((a) -> {
			if (search.huduku(a))
				findAll.add(a);
		});
		return findAll;
	}
}
