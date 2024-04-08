package com.java.oops.client;

import java.util.Scanner;

import com.java.oops.PaliandromeString;

public class PaliandromeStringClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		try {
			String input = sc.nextLine();
			PaliandromeString ps = new PaliandromeString(input);
			ps.checker();
		} finally {
			sc.close();
			System.out.println("Stream Closed ");
		}
	}
}
