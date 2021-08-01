package com.xworkz.features.stream;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.features.stream.dao.SoapDAO;
import com.xworkz.features.stream.dao.SoapDAOImpl;
import com.xworkz.features.stream.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {

		SoapDTO soap1 = new SoapDTO("Godrej NO 1", 108d, 100d, "Bathing");
		SoapDTO soap2 = new SoapDTO("Surf Excel", 25d, 250d, "Detergent");
		SoapDTO soap3 = new SoapDTO("Rexona", 42d, 150d, "Bathing");
		SoapDTO soap4 = new SoapDTO("Rin", 26d, 250d, "Detergent");

		SoapDAO dao = new SoapDAOImpl();
		dao.save(soap4);
		dao.save(soap2);
		dao.save(soap3);
		dao.save(soap1);

		Optional<SoapDTO> type = dao.findTypeBypriceGreaterThan(25);
		if (type.isPresent()) {
			SoapDTO temp = type.get();
			System.out.println(temp.getType());
		}

		Optional<SoapDTO> brand = dao.findByBrand("Rin");
		if (brand.isPresent()) {
			SoapDTO b = brand.get();
			System.out.println(b.getPrice());
		}

		Collection<SoapDTO> all = dao.findAll();
		all.forEach((b) -> System.out.println(b));

	}

}
