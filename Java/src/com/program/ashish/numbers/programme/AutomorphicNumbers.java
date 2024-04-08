package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class AutomorphicNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check it is automorphic or not  : ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			boolean result = Utility07.isAutomorphic(num);
			System.out.println("It is automorphic :->  " + result);
		} finally {
			sc.close();
		}
	}
}