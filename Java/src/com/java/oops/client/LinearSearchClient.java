package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.LinearSearch;

public class LinearSearchClient {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		try {
			int limit = sc.nextInt();
			LinearSearch ls = new LinearSearch(limit);
			ls.findTheElement();
		} catch (InputMismatchException e) {
			System.out.println("Enter the  valid input :");
		} finally {
			sc.close();
		}
	}
}
