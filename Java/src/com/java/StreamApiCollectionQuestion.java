package com.java;

import java.util.ArrayList;
import java.util.List;

public class StreamApiCollectionQuestion {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("a");
		list.add(null);
		list.add("d");
		// Removing null from list
		list.stream().filter(x -> x != null).forEach((x) -> {
			System.out.print(x + " ");
		});
		System.out.println("\n" + "------------------------");
		// removing duplicate from the list
		list.stream().distinct().forEach((x) -> {
			System.out.print(x + " ");
		});
		// Remove duplicate & null value from the array list
		System.out.println("\n" + "------------------------");
		list.stream().filter(x -> x != null).distinct().forEach((x) -> {
			System.out.print(x + " ");
		});

		// How to sort data in array list
		System.out.println("\n" + "------------------------");
		list.stream().filter(x -> x != null).distinct().sorted().forEach((x) -> {
			System.out.print(x + " ");
		});
		// Converting element to uppercase
		System.out.println("\n" + "------------------------");
		list.stream().filter(x -> x != null).map(y -> y.toUpperCase()).distinct().sorted().forEach((x) -> {
			System.out.print(x + " ");
		});

		// use of skip and limit
		System.out.println("\n" + "------------------------");
		list.stream().filter(x -> x != null).limit(2).forEach((x) -> {
			System.out.print(x + " ");
		});
		System.out.println("\n" + "------------------------");
		list.stream().filter(x -> x != null).skip(3).forEach((x) -> {
			System.out.print(x + " ");
		});
	}

}
