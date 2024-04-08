package com.java.oops;

import com.java.exception.InvalidNumberException;

public class Factorial {
	private int num;

	public Factorial(int num) {
		this.num = num;
	}

	public int factorial() throws InvalidNumberException {
		if (num < 0)
			throw new InvalidNumberException("Please enter greater than zero");
		int fac = 1;
		for (int i = num; i > 0; i--) {
			fac = fac * i;
		}
		return fac;
	}
}
