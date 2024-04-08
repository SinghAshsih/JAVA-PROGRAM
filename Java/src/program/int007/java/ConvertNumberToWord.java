package program.int007.java;

import java.util.Scanner;

public class ConvertNumberToWord {
	public static void convert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int num = sc.nextInt();
		if (num < 0 || num > 999) {
			System.out.println("Invalid number ");
		} else if (num <= 9) {
			String[] oneDigit = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
			System.out.println(oneDigit[num]);
		} else if (num == 10 || num == 20) {

		}
	}

	public static void main(String[] args) {
		convert();
	}
}
