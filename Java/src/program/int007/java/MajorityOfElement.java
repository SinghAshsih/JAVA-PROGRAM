package program.int007.java;

import java.util.HashMap;
import java.util.Map;

public class MajorityOfElement {
	public static void majority(int[] array, int size) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			Integer value = map.get(i);
			if (value == null) {
				map.put(i, 1);
			} else {
				map.put(i, value + 1);
			}
		}

		// Set<Entry<Integer, Integer>> entry = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 2, 3, 3, 3, 3, 3, 2, 2, 4, 5, 5, 6, 7, 3, 2, 4, 6 };
		int size = array.length;
		// System.out.println("Hi");
		majority(array, size);
	}
}
