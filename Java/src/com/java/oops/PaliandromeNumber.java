package com.java.oops;

import com.java.exception.InvalidNumberException;

public class PaliandromeNumber {
	private int num;

	public PaliandromeNumber(int num) {
		this.num = num;
	}

	public void paliandrome() throws InvalidNumberException {
		if (num <= 0) {
			throw new InvalidNumberException("Please enter the number greater than 0 ");
		}
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum * 10 + digit;
			num /= 10;
		}
		// System.out.println(sum);
		if (sum == temp) {
			System.out.println("It is a paliandrome number ");
		} else {
			System.out.println("It is not paliandrome number ");
		}
	}

}
