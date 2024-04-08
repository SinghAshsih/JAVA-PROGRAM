package program.int007.java;

import java.util.HashMap;
import java.util.Map;

public class RepeatingElementInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 5, 6, 3, 6, 8, 3, 1 };
		repating(arr);
		repating2(arr);
	}

	private static void repating(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			Integer value = map.get(i);
			if (value == null) {
				map.put(i, 1);
			} else {
				map.put(i, value + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Repeated element is = " + entry.getKey() + " " + entry.getValue());
			}
		}

	}
	// Approaches 2

	private static void repating2(int[] arr) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			if (temp[arr[i]] == 1) {
				System.out.println(arr[i]);
			} else {
				temp[arr[i]]++;
			}
		}
	}

}
