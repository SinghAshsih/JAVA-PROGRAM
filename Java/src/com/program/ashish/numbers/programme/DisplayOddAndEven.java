package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class DisplayOddAndEven {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		try {
			int limit = sc.nextInt();
			Utility07.odd(limit);
			System.out.println('\n'
					+ "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			Utility07.even(limit);
		} finally {
			sc.close();
		}
	}
}
