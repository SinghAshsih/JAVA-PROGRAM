package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmpClient {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(1, "Ashish", 70000));
		list.add(new Emp(4, "Abhay", 80000));
		list.add(new Emp(23, "Amit", 90000));
		list.add(new Emp(76, "Sachin", 50000));
		list.add(new Emp(12, "Deepak", 70000));
		list.add(new Emp(12, "Nayan", 30000));
		list.add(new Emp(15, "Jitesh", 100000));
		list.add(new Emp(10, "Atul", 10000));
		list.add(new Emp(11, "Amit", 20000));
		// Second Maximum salary
		list.stream().sorted(Comparator.comparing(Emp::getEsalary).reversed()).skip(1).findFirst()
				.ifPresent(x -> System.out.println("Second maximum salary is  " + x.getEsalary()));
		;

		// getting employee whose salary greater than 50000 or less than 50000
		list.stream().filter(x -> x.getEsalary() > 50000).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("--------------------");
		// counting the number of employee
		long count = list.stream().count();
		System.out.println("No of employee " + count);

		System.out.println("-------------------------------");

		// finding employee name whose salary is highest
		Optional<Emp> max = list.stream().max(Comparator.comparing(Emp::getEsalary));
		System.out.println(max.get());

	}
}
