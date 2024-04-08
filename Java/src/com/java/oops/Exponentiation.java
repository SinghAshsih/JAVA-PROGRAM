package com.java.oops;

public class Exponentiation {
	private int num;
	private int exponent;

	public Exponentiation(int num, int exponent) {
		this.num = num;
		this.exponent = exponent;
	}

	public void exponent() {
		double result = Math.pow(num, exponent);
		System.out.println("Result is " + result);
	}
}
