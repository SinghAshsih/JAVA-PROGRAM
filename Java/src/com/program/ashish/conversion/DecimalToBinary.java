package com.program.ashish.conversion;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the decimal numbers ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			decimalToBinary(num);
			decimalToBinary2(num);
		} finally {
			sc.close();
		}
	}

	private static void decimalToBinary2(int num) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
		String str="";
		while(num>0) {
			int lastDigit=num%2;
			str=lastDigit+str;
			num/=2;
		}
		System.out.println("Binary Number is "+str);
		
	}

	private static void decimalToBinary(int num) {
		// TODO Auto-generated method stub
		String binaryString = Integer.toBinaryString(num);
		System.out.println("Binary number is " + binaryString);

	}

}
