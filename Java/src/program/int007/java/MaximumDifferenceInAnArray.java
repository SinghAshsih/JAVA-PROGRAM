package program.int007.java;

public class MaximumDifferenceInAnArray {
	public static void main(String[] args) {
		int[] arr = { 55, 2, 3, 4, 5, 6, 7 };
		maximumDifference(arr);

	}

	private static void maximumDifference(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		int max = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
		System.out.println("Maximum difference in an array = " + (max - min));

	}
}

class MinMaxFinder {
	public static void main(String[] args) {
		int[] arr = { 333, 34, 56, 78, 90 };
		finder(arr);
	}

	private static void finder(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		int max = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		System.out.println("Minimum Number = " + min);
		System.out.println("Maximum Number = " + max);

	}
}
