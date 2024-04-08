package com.program.ashish.conversion;

import java.util.Scanner;

public class DecimalToHexaDecimal {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			decimalToHexa(num);
		} finally {
			sc.close();
		}
	}

	private static void decimalToHexa(int num) {
		// TODO Auto-generated method stub
		int temp = num;
		String str = "";
		while (num > 0) {
			int lastDigit = num % 16;
			str = lastDigit + str;
			num /= 16;
		}
		System.out.println("Hexadecimal number " + str);
		System.out.println("---------------------------------");
		String hexString = Integer.toHexString(temp);
		System.out.println("Hexadecimal number " + hexString);
	}

}

class HexaToDecimal {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			hexaToDecimal(num);
		} finally {
			sc.close();
		}
	}

	private static void hexaToDecimal(int num) {
		// TODO Auto-generated method stub
		int pow = 0;
		int desimal = 0;
		while (num > 0) {
			int last = num % 10;
			desimal = (int) (desimal + (last * Math.pow(16, pow)));
			pow++;
			num /= 10;
		}
		System.out.println("Decimal number is " + desimal);

	}

}