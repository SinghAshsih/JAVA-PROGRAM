package program.int007.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedKeyOnHashMap {
	public static void main(String[] args) {
		Map<String, String> unsortedMap = new HashMap<>();
		unsortedMap.put("apple", "apple");
		unsortedMap.put("pineapple", "pineapple");
		unsortedMap.put("banana", "banana");
		unsortedMap.put("orange", "orange");
		unsortedMap.put("guava", "guava");
		for (Map.Entry<String, String> entry : unsortedMap.entrySet()) {
			System.out.println("Key Value->     " + entry.getKey());
		}
		System.out.println("----------------------------------------------------");
		Map<String, String> treeMap = new TreeMap<>(unsortedMap);
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("Key Value->     " + entry.getKey());
		}
	}
}
