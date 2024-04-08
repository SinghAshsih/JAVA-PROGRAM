package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiTerminalOperation {
	public static void main(String[] args) {
		// Example of reduce method
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(5);
		Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
		System.out.print(reduce.get());

		// Count method
		long count = list.stream().count();
		System.out.println("\n" + count);

		// forEach method
		list.stream().forEach((x) -> {
			System.out.print(x + " ");
		});
		System.out.println();
		// toArray method
		// stream to array
		Object[] obj = list.stream().toArray();
		for (Object o : obj) {
			System.out.print(o + " ");
		}
		System.out.println();
		// Maximum element in arrayList
		Optional<Integer> max = list.stream().max((a, b) -> a.compareTo(b));
		System.out.println(max.get() + " mix");
		// Minimum element in arrayList
		Optional<Integer> min = list.stream().min((a, b) -> a.compareTo(b));
		System.out.println(min.get() + " min");

		// Collect is a terminal operator which is used to convert stream into
		// set/list/map back
		List<Integer> lit = list.stream().distinct().collect(Collectors.toList());
		System.out.println(lit);

		// findFirst(),findAny() ,anyMatch ,allMatch ,nonMatch
		System.out.println();
		Optional<Integer> findFirst = list.stream().findFirst();
		System.out.println(findFirst.get());

		List<String> list2 = new ArrayList<>();
		list2.add("Ashish");
		list2.add("is a ");
		list2.add("good boy");
		list2.add("lives in");
		list2.add("orai");
		list2.add("jalaun");
		boolean anyMatch = list2.stream().anyMatch(x->x.startsWith("good"));
		System.out.println(anyMatch);

	}
}
