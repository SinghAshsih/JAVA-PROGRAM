package program.int007.java;

import java.util.Stack;

public class ReverseElementInArray {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30 ,45,76};
		System.out.println("Original Array :  ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		revere(numbers);
		reverse(numbers);
		reversee(numbers);
	}

// Approaches 1
	private static void revere(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println('\n' + "Reverse Array ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}

	// Approaches 2
	private static void reverse(int[] numbers) {
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			st.push(numbers[i]);
		}
		System.out.println('\n' + "Reverse Array ");
//		while (!st.isEmpty()) {
//			System.out.print(st.pop() + " ");
//		}
		// Assigning in the same array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = st.pop();
			System.out.print(numbers[i] + " , ");
		}
	}

	// Approaches 3
	private static void reversee(int[] numbers) {
		int low = 0;
		int high = numbers.length - 1;
		while (low < high) {
			int temp = numbers[low];
			numbers[low] = numbers[high];
			numbers[high] = temp;
			low++;
			high--;
		}
		System.out.println('\n' + "Reverse Array ");
		for (int a : numbers) {
			System.out.print(a + " . ");
		}
	}
}
