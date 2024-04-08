package program.int007.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateArrayInDifferentWays {
	public static void main(String[] args) {
		String[] arr = { "Ashish", "Amit", "Ajay", "Abhay" };

		// 1st Approach
		List<String> list = Arrays.asList(arr);

		// 2nd Approach
		List<String> list2 = new ArrayList<>();
		Collections.addAll(list2, arr);

		// 3rd Approach
		List<String> list3 = new ArrayList<>();
		for (String name : arr) {
			list3.add(name);
		}
	}
}
