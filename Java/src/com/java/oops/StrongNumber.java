package com.java.oops;

import com.java.exception.InvalidNumberException;

public class StrongNumber {
	private int num;

	public StrongNumber(int num) {
		this.num = num;
	}

	public void strongNumber() {
		int sum = 0;
		int temp = num;
		try {
			while (temp > 0) {
				int digit = temp % 10;
				Factorial fac = new Factorial(digit);
				int local = fac.factorial();
				sum = local + sum;
				temp /= 10;
			}
			if (sum == num) {
				System.out.println("Strong number ");
			} else {
				System.out.println("Not Strong number  ");
			}
		} catch (InvalidNumberException e) {
			e.printStackTrace();
		}
	}
}
