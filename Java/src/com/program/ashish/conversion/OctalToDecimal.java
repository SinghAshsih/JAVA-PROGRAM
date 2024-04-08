package com.program.ashish.conversion;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		System.out.println("Enter the octal number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			int decimal = ocatlToDecimal(num);
			System.out.println("Decimal number is " + decimal);
			decimalToOctal(decimal);
		} finally {
			sc.close();
		}

	}

	private static void decimalToOctal(int num) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------");
		String str = "";
		while (num > 0) {
			int last = num % 8;
			str = last + str;
			num /= 8;
		}
		System.out.println("Octal number is " + str);
	}

	private static int ocatlToDecimal(int num) {
		// TODO Auto-generated method stub
		int pow = 0;
		int decimal = 0;
		while (num > 0) {
			int last = num % 10;
			decimal = (int) (decimal + (last * Math.pow(8, pow)));
			num /= 10;
			pow++;
		}
		return decimal;

	}
}
