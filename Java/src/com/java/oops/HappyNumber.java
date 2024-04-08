package com.java.oops;

public class HappyNumber {
	private int num;

	public HappyNumber(int num) {
		this.num = num;
	}

	public void isHappyNumber() {
		int sum = 0, x, d, i = 0;
		for (i = num; i > 9;) {
			for (x = i; x > 0; x = x / 10) {
				d = x % 10;
				sum = sum + d * d;
			}

		}
		if (i == 1) {
			System.out.println("happy nuber");
		} else {
			System.out.println("not happy number");
		}

	}
}
