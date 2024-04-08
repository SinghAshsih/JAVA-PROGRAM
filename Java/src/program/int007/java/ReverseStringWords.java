package program.int007.java;

import java.util.Stack;

public class ReverseStringWords {
	public static void main(String[] args) {
		String input = "Hello World";
		System.out.println("Original Word :  " + input);
		reverse(input);
		reverseWord(input);
		reverse2(input);
	}

	private static void reverse(String input) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			temp = input.charAt(i) + temp;
		}
		System.out.println("Reverse Word :  " + temp);
	}

	private static void reverse2(String input) {
		StringBuilder sb = new StringBuilder(input);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
	}

	private static void reverseWord(String input) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		String reverse = "";
		while (!stack.isEmpty()) {
			reverse = reverse + stack.pop();
		}
		System.out.println(reverse);
	}
}