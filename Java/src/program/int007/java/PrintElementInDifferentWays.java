package program.int007.java;

import java.util.Arrays;

public class PrintElementInDifferentWays {
	public static void main(String[] args) {
		// toString for single dimension
		// deepToString is for multidimensional
		String[] colour = { "Bue", "Orange", "White", "Red" };
		int[][] num = { { 12, 33, 53 }, { 24, 54, 14 } };
		// 1 Approach
		System.out.println(Arrays.toString(colour));

		// 2nd Approaches
		System.out.println(Arrays.asList(colour));
		System.out.println(Arrays.deepToString(num));
		Arrays.stream(colour).forEach(System.out::println);
	}
}
