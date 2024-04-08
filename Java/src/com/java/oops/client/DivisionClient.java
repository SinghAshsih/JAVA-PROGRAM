package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.Division;

public class DivisionClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first  numbers");
		try {
			int a = sc.nextInt();
			System.out.println("Enter the 2nd number");
			int b = sc.nextInt();
			Division d = new Division(a, b);
			d.divide();
		} catch (ArithmeticException d) {
			System.out.println(d.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please insert correct numbers ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			System.out.println("Stream closed");
		}
	}
}
