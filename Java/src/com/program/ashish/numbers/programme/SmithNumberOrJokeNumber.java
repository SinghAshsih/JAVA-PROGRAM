package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class SmithNumberOrJokeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			Utility07.IsJokeNumber(num);
		} finally {
			sc.close();
		}
	}
}