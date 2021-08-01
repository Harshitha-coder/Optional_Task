package com.xworkz.features.stream;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.xworkz.features.stream.dao.GroceryDAO;
import com.xworkz.features.stream.dao.GroceryDAOImpl;
import com.xworkz.features.stream.dto.GroceryDTO;
import com.xworkz.features.stream.dto.constants.GroceryType;

public class GroceryTester {

	public static void main(String[] args) {

		Date currentDate = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 4, 13);

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2021, 7, 03);

		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2022, 9, 31);

		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(2021, 7, 01);

		GroceryDTO grocery1 = new GroceryDTO("Sunflower Oil", 170d, GroceryType.CANNED_GOODS, 1d, true, "Fortune", true,
				true, 56748392542l, currentDate, calendar.getTime());

		GroceryDTO grocery2 = new GroceryDTO("Capsicum", 22d, GroceryType.VEGETABLES, 0.1d, true, "Fresh", true, true,
				7685986534l, currentDate, calendar1.getTime());

		GroceryDTO grocery3 = new GroceryDTO("Nutrition drink", 320d, GroceryType.SERIALS, 0.75d, true, "Boost", true,
				true, 564783645l, currentDate, calendar2.getTime());
		GroceryDTO grocery4 = new GroceryDTO("Chicken", 240d, GroceryType.MEAT, 1.5d, true, "Fresh", false, false,
				657543564l, currentDate, calendar3.getTime());

		GroceryDAO dao = new GroceryDAOImpl();
		dao.create(grocery1);
		dao.create(grocery3);
		dao.create(grocery4);
		dao.create(grocery2);

		Optional<GroceryDTO> optional = dao.findOne((b) -> b.getBrand().equals("Fresh"));
		if (optional.isPresent()) {
			GroceryDTO findOne = optional.get();
			System.out.println("found one:" + findOne);
		}

		Collection<GroceryDTO> collection = dao.findAll((b) -> b.getPrice() > 150);
		collection.forEach((g) -> System.out.println("found all:" + g));

		Optional<GroceryDTO> max = dao.findByMaxQuantity();
		if (max.isPresent()) {
			GroceryDTO dto = max.get();
			System.out.println("found max quantity:" + dto);
		}

		Optional<GroceryDTO> date = dao.findByManufacturedDate(currentDate);
		if (date.isPresent()) {
			GroceryDTO dto = date.get();
			System.out.println("found manufacturedDate:" + dto);
		}

		//Collection<GroceryDTO> coll = dao.findAllByExpiredDate(calendar2.getTime());
		//coll.forEach((b) -> System.out.println("found all by expiredDate:" + b));
	}
}
