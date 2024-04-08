package com.java.oops.client;

import java.util.Scanner;

import com.java.oops.StringReverse;

public class StringReverseClient {
	public static void main(String[] args) {
		System.out.println("Enter the input :");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			StringReverse sr = new StringReverse(input);
			sr.reverse();
		} finally {
			sc.close();
		}
	}
}
