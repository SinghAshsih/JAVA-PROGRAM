package com.java.oops;

import com.java.exception.DivideByZeroException;

public class Division {
	int a, b;

	public Division(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void divide() throws DivideByZeroException {
		if (b == 0) {
			throw new DivideByZeroException("Can not divide by zero .");
		}
		int divide = a / b;
		System.out.println("Result  =  " + divide);
	}
}
