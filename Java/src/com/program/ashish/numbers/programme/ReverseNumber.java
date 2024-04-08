package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number you want to reverse : ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			int reverse = Utility07.reverse(num);
			System.out.println("Reverse number is " + reverse);
		} finally {
			sc.close();
		}
	}

}
