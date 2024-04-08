package com.java.oops;

import com.java.exception.InvalidNumberException;

public class ReverseNumber {
	private int num;

	public ReverseNumber(int num) {
		this.num = num;
	}

	public void reverse() throws InvalidNumberException {
		if (num < 0)
			throw new InvalidNumberException("Please enter only positive numbers ");
		int reverse = 0;
		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		System.out.println("Reverse Number is " + reverse);

	}
}
