package com.java.oops;

public class SumOfDigits {
	private int num;

	public SumOfDigits(int num) {
		this.num = num;
	}

	public void sumOfDigit() {
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int digit = num % 10;
			sum = digit + sum;
			num /= 10;
		}
		System.out.println("Sum of digit of a number " + temp + " is " + sum);
	}
}
