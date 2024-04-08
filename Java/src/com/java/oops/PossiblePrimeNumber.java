package com.java.oops;

public class PossiblePrimeNumber {
	private int num;

	public PossiblePrimeNumber(int num) {
		this.num = num;
	}

	public void primeNumeber() {
		int count = 0;
		int i;
		System.out.println("The possible prime numbers are as follows :");
		for (i = 1; i <= num; i++) {
			PrimeNumber pm = new PrimeNumber(i);
			boolean result = pm.isPrimeNumber();
			if (result == true) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + "Total prime numbers between 1 and  " + num + " is " + count);
	}
}