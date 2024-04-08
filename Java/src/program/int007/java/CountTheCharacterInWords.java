package program.int007.java;

import java.util.Scanner;

public class CountTheCharacterInWords {
	public static void count(String input) {
		String[] arr = input.split(" ");
		System.out.println("Words " + '\t' + "No. of letters");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + '\t' + arr[i].length());
		}

	}

	// Apporaches 2
	public static void count2(String input) {
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String temp = "";
			while (i < ch.length && ch[i] != ' ') {
				temp = temp + ch[i];
				i++;
			}
			if (temp.length() > 0) {
				System.out.println(temp + "  ->  " + temp.length());
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		try {
			String input = sc.nextLine();
			count2(input);
		} finally {
			sc.close();
		}
	}
}
