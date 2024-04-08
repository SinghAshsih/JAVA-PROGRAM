package com.java.oops;

public class PrimeNumber {
	private int num;

	public PrimeNumber(int num) {
		this.num = num;
	}

	public boolean isPrimeNumber() {
		boolean flag = false;
		if (num < 0) {
			num = num * -1;
		}
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;

		}
		if (count == 2) {
			flag = true;
		}
		return flag;
	}
}
