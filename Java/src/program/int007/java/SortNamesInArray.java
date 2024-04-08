package program.int007.java;

import java.util.Arrays;

public class SortNamesInArray {
	public static void main(String[] args) {
		String[] names = { "Amit", "Ajay", "Abhay", "Ashish", "Aman", "Abhishek", "Atul", "Ashmita" };
		sort(names);
		System.out.println();
		sort2(names);
	}

	private static void sort2(String[] names) {
		String temp;
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}

		}
		for (String name : names) {
			System.out.print(name + "  ");
		}

	}

	private static void sort(String[] names) {
		// TODO Auto-generated method stub
		Arrays.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
