package program.int007.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 30, 40, 50, 50 };
		duplicate(arr);
	}

	private static void duplicate(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			if (!set.contains(num)) {
				set.add(num);

			} else {
				System.out.println("Duplicate is : " + num);
			}
		}

	}
}
