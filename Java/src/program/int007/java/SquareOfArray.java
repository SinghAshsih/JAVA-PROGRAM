package program.int007.java;

import java.util.Arrays;

public class SquareOfArray {
	public static void main(String[] args) {
		int[] arr = { -3, -5, -9, 1, 3, 6, 2, 0 };
		square(arr);
	}

//Approach 1
	private static void square(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.stream(arr).map(x -> x * x).sorted().forEach(System.out::println);

	}
}

class SquareOfArrayPart2 {
	public static void main(String[] args) {
		int[] arr = { -8, -9, 6, 4, 3 };
		int[] sortedArray = square(arr);
		for (int num : sortedArray) {
			System.out.println(num);
		}
	}

	private static int[] square(int[] arr) {
		int[] squareArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			squareArray[i] = arr[i] * arr[i];
		}
		int temp = 0;
		for (int i = 0; i < squareArray.length; i++) {
			for (int j = i + 1; j < squareArray.length; j++) {
				if (squareArray[i] > squareArray[j]) {
					temp = squareArray[i];
					squareArray[i] = squareArray[j];
					squareArray[j] = temp;
				}
			}

		}

		return squareArray;
	}

}