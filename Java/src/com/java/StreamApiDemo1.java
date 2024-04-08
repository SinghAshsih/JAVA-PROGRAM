package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamApiDemo1 {
	public static void main(String[] args) {

		// Without using stream api
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list.add("Ashish");
		list.add("Abhay");
		list.add("Amit");
		list.add("Ajay");
		list.add("Ashish");
		list.add("Amit");
		list.add("Deepak");
//
//		for (String name : list) {
//			System.out.print(name + " ");
//			if (!list2.contains(name)) {
//				list2.add(name);
//			}
//		}
//		System.out.println();
//		for (String unique : list2) {
//			System.out.print(unique + " ");
//		}

		// Using java 8
		list.stream().distinct().forEach((x) -> {
			System.out.println(x);
		});
	}
}

class StreamApiDemo2 {
	public static void main(String[] args) {
		// Finding array length without using java 8
		int[] arr = { 10, 20, 30 };
		int len = arr.length;
		System.out.println("Lengtht : " + len);
		// Iterating array without using stream api
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------" + "\n" + "After using stream api");
		// Convert array to stream
		long count = Arrays.stream(arr).count();
		System.out.println("Length" + count);
		Arrays.stream(arr).forEach((x -> {
			System.out.println(x);
		}));
	}
}

class StreamApiDemo2B {
	public static void main(String[] args) {
		// sorting array without using stream api
		int[] arr = { 12, 4, 8, 1, 0 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("---------" + "\n" + "After using stream api");
		Arrays.stream(arr).sorted().forEach((x -> {
			System.out.print(x + " ");
		}));
	}
}

class StreamApiDemo3 {
	public static void main(String[] args) {
		// removing duplicate from array
		int[] arr = { 60, 70, 80, 60, 60, 90, 80, 10, 20, 20, 10, 30, 40, 40, 50 };
		Arrays.stream(arr).distinct().sorted().forEach((x -> {
			System.out.print(x + " ");
		}));
		// array sum
		int[] arrr = { 1, 5, 6, 2, 1, 3, 4 };
		int sum = 0;
		for (int i = 0; i < arrr.length; i++) {
			sum = sum + arrr[i];

		}
		System.out.println();
		System.out.println(sum);

		int sumByStream = Arrays.stream(arrr).sum();
		System.out.println("sum using stream api " + sumByStream);

		// Average by using stream api
		OptionalDouble average = Arrays.stream(arrr).average();
		System.out.println("Average = " + average.getAsDouble());
	}

}

class StreamApiDemo4 {
	public static void main(String[] args) {
		// Even and odd by using java 8
		int[] arr = { 10, 11, 13, 12, 14, 15, 16 };
		Arrays.stream(arr).filter(x -> x % 2 == 0).forEach((x -> {
			System.out.println(x);
		}));
	}
}

class StreamApiDemo5 {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 76, 3, 45 };
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("Minimum value " + min);
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Maximum value " + max);
	}
}