package program.int007.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityOfElementInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 3 };
		int size = arr.length;
		majority(arr, size);
		m2(arr, size);
	}

	private static void majority(int[] arr, int size) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			Integer value = map.get(arr[i]);
			// System.out.println(value);
			if (value == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], value + 1);
			}

		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > size / 2) {
				flag = true;
				System.out.println(entry.getKey() + " ->  " + entry.getValue());
			}

		}
		if (flag == false) {
			System.out.println("None in majority");
		}

	}

	// Approaches 2
	public static void m2(int[] arr, int size) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			map.put(arr[i], map.getOrDefault(arr[i], -1) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > size / 2) {
				int result = entry.getKey();
				System.out.println(result);
			}
		}
	}
}
