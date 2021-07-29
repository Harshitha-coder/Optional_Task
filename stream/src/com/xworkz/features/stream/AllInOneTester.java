package com.xworkz.features.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AllInOneTester {

	public static void main(String[] args) {

		
		Collection<String> watchBrandsList = Arrays.asList("Fastrack", "TimeWear", "Casio", "Kirton", "Titan", "Timex",
				"TimeWear");
		
		Collection<String> data = watchBrandsList.stream().filter((value) -> value.startsWith("T")).sorted()
				.collect(Collectors.toList());
		
		System.out.println(data.size());
		data.forEach((s) -> System.out.println("pan starting with a:" + s));

		
		System.out.println("********************");
		
		List<String> panList = Arrays.asList("AKZY133GD", "SDFG991JH", "GHMM78HG", "ASDR321BB", "AQER111YT");

		List<String> pan = panList.stream().filter((temp) -> temp.startsWith("A")).sorted().collect(Collectors.toList());
		System.out.println(pan.size());
		pan.forEach((a) -> System.out.println("pan starting with a:" + a));

		
		System.out.println("**********************");
		
		Collection<String> usnList = Arrays.asList("1SJ16EC036", "1SJ16CS060", "1SJ16CV065", "1SJ16CS090",
				"1SJ16CS046");
		Collection<String> usn = usnList.stream().filter((d) -> d.contains("CS")).sorted().collect(Collectors.toList());
		
		System.out.println(usn.size());
		usn.forEach((g) -> System.out.println("usn matching cs:" + g));
	}
}
