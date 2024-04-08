package com.program.ashish.arrayprogram;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 2, 4, 5, 6, 7, 8, 1, 2, 3, 1, 2, 8, 4, 5, 6 };
		frequency(num);
	}

	private static void frequency(int[] num) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : num) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}

		}
		System.out.println("Numbers" + "   " + "Frequency");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("   "+entry.getKey() + "   ->   " + entry.getValue());
		}

	}
}
