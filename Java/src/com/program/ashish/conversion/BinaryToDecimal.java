package com.program.ashish.conversion;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		System.out.println("Enter the binary digits");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			binaryToDecimal(num);
		} finally {
			sc.close();
		}
	}

	private static void binaryToDecimal(int num) {
		// TODO Auto-generated method stub
		int decimal = 0;
		byte pow = 0;
		while (num > 0) {
			int remainder = num % 10;
			decimal = (int) (decimal + (remainder * Math.pow(2, pow)));
			num /= 10;
			pow++;
		}
		System.out.println("Decimal no. is " + decimal);

	}
}
