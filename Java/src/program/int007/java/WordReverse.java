package program.int007.java;

import java.util.Scanner;

public class WordReverse {
	public static void reverse(String input) {
		String splitArray[] = input.split(" ");
		for (int i = splitArray.length - 1; i >= 0; i--) {
			System.out.print(splitArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the input ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			reverse(input);
		} finally {
			sc.close();
		}
	}
}
