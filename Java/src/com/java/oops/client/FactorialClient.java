package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.exception.InvalidNumberException;
import com.java.oops.Factorial;

public class FactorialClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial number ");
		try {
			int num = sc.nextInt();
			Factorial fac = new Factorial(num);
			int result = fac.factorial();
			System.out.println("Factorial of " + num + " is " + result);

		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please enter only numbers which is greater than 0");
		}

		finally {

			sc.close();
			System.out.println("Stream Closed");
		}
	}
}
