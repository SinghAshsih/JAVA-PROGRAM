package program.int007.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfElement {
// Approaches 1
	public static void m1(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
		}
		System.out.println("Approaches 1->  " + sum);
	}

	public static void m2(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		System.out.println("Approach 2->  " + sum);
	}

	public static void m3(int[] arr) {
		int sum = IntStream.of(arr).sum();
		System.out.println(sum);
	}

	public static void m4(int[] arr) {
		int sum = Arrays.stream(arr).reduce((x, y) -> x + y).getAsInt();
		System.out.println(sum);
	}

	public static void m5(int[] arr) {
		int sum = Arrays.stream(arr).reduce(Integer::sum).getAsInt();
		System.out.println(sum);
	}

	public static void m6(int[] arr) {
		long sum = Arrays.stream(arr).summaryStatistics().getSum();
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		m5(arr);
	}
}
