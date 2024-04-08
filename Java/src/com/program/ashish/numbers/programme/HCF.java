package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class HCF {
	public static void main(String[] args) {
		System.out.println("How many numbers you wanna take to find the HCF");
		Scanner sc = new Scanner(System.in);
		try {
			int limit = sc.nextInt();
			int num[] = new int[limit];
			System.out.println("Enter the numbers ");
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}
			for (int i : num) {
				System.out.print(i + " ");
			}
			int hcf = Utility07.hcf(num);
			System.out.println("HCF of numbers is " + hcf);
		} finally {
			sc.close();
		}
	}
}
