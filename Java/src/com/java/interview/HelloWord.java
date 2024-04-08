package com.java.interview;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		System.out.println("Enter the message : ");
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		Utility.message(message);
		sc.close();
	}
}
