package com.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiMap {
	public static void main(String[] args) {
		// when we want to store the data in term of key value pair then we use map
		// entry=key+ value
		/*
		 * keySet() is used to find key value() is used to find the value entrySet() is
		 * used for both key value pair
		 * 
		 * ------------------------------------------------------
		 * 
		 * 
		 */
		// Getting key using stream api
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "C");
		map.put(3, "D");
		map.put(4, "B");
		map.put(1, "A");
		// Getting only keys
		map.keySet().stream().forEach((x) -> {
			System.out.print(x + " ");
		});
		System.out.println("\n" + "----------------");
		// Getting only values;
		map.values().stream().forEach((x) -> {
			System.out.print(x + " ");
		});
		System.out.println("\n" + "----------------");
		map.entrySet().stream().forEach((x) -> {
			System.out.print(x + " ");
		});
		System.out.println("\n" + "----------------");
		// store the data based on key
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach((x) -> {
			System.out.println(x + " ");
		});
		System.out.println("\n" + "----------------");
		// store the data based value in ascending order
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((x) -> {
			System.out.println(x + " ");
		});
	}
}

class MapDemo {
	public static void main(String[] args) {
		// construct the list based on key (map to list)
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "C");
		map.put(3, "D");
		map.put(4, "B");
		map.put(1, "A");
		List<Integer> key = map.keySet().stream().collect(Collectors.toList());
		System.out.println(key);

		// Construct the list based on value
		List<String> value = map.values().stream().collect(Collectors.toList());
		System.out.println(value);
	}
}
