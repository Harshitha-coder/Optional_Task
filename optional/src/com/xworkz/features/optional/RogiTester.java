package com.xworkz.features.optional;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.features.optional.dao.RogiDAO;
import com.xworkz.features.optional.dao.RogiDAOImpl;
import com.xworkz.features.optional.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {

		RogiDTO rogi1 = new RogiDTO(1, "Harshitha", 22, "Headache", true);
		RogiDTO rogi2 = new RogiDTO(2, "Ranjitha", 24, "Eating", true);
		RogiDTO rogi3 = new RogiDTO(3, "Sunitha", 24, "Panic", true);
		RogiDTO rogi4 = new RogiDTO(4, "Pavithra", 23, "Sleep", true);
		RogiDTO rogi5 = new RogiDTO(5, "Dharshan", 25, "Stress", true);

		// Collection<RogiDTO> collection = Arrays.asList(rogi1, rogi2, rogi4, rogi3,
		// rogi5);
		// collection.forEach((d) -> System.out.println(d));

		RogiDAO dao = new RogiDAOImpl();
		dao.save(rogi1);
		dao.save(rogi2);
		dao.save(rogi3);
		dao.save(rogi4);
		dao.save(rogi5);

		Optional<RogiDTO> optional = dao.findOne((a) -> a.getName().equals("Harshitha"));

		if (optional.isPresent()) {
			RogiDTO dto = optional.get();
			System.out.println("found one:" + dto.getKayile());
		} else {
			System.out.println("not found");
		}

		Optional<Integer> size = dao.totalSize();
		if (size.isPresent()) {
			Integer dto = size.get();
			System.out.println("total size:" + dto);
		}

		Optional<RogiDTO> age = dao.findByMaxAge();
		if (age.isPresent()) {
			RogiDTO maxAge = age.get();
			System.out.println("found max age:" + maxAge);
		}

		Optional<RogiDTO> minAge = dao.findByMinAge();
		if (minAge.isPresent()) {
			RogiDTO temp = minAge.get();
			System.out.println("found min age:" + temp);
		}

		Collection<RogiDTO> findAll = dao.FindAll();
		for (RogiDTO rogiDTO : findAll) {
			System.out.println("found all by loop:" + rogiDTO);
		}

		Collection<RogiDTO> find = dao.FindAll((a) -> a.getAge() > 20);
		for (RogiDTO rogiDTO : find)
			System.out.println("found all:" + rogiDTO);

	}
}
