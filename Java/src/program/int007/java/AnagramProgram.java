package program.int007.java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	String input1;
	String input2;

	public AnagramProgram(String input1, String input2) {
		this.input1 = input1;
		this.input2 = input2;
	}

	public boolean checkIs(String input1, String input2) {
		String s1 = input1.replaceAll("\\s", "");
		String s2 = input2.replaceAll("\\s", "");
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		System.out.println("Enter the input1  ");
		Scanner sc = new Scanner(System.in);
		try {
			String input1 = sc.nextLine();
			System.out.println("Enter the input2 ");
			String input2 = sc.nextLine();
			AnagramProgram ap = new AnagramProgram(input1, input2);
			System.out.println("Both strings are anagram :  " + ap.checkIs(input1, input2));
		} finally {
			sc.close();
		}
	}
}
