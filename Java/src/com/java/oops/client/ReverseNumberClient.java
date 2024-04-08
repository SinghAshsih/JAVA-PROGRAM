package com.java.oops.client;

import java.util.Scanner;

import com.java.exception.InvalidNumberException;
import com.java.oops.ReverseNumber;

public class ReverseNumberClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		try {
			int num = sc.nextInt();
			ReverseNumber rn = new ReverseNumber(num);
			rn.reverse();
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			System.out.println("Stream Closed");
		}
	}
}
