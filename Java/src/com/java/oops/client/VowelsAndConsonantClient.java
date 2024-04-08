package com.java.oops.client;

import java.util.Scanner;

import com.java.oops.VowelsAndConsonantCounter;

public class VowelsAndConsonantClient {
	public static void main(String[] args) {
		System.out.println("Enter the input :");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			VowelsAndConsonantCounter vc = new VowelsAndConsonantCounter(input);
			vc.counter();
		} finally {
			sc.close();
		}
	}
}
