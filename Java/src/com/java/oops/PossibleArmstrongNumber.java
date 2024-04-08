package com.java.oops;

import com.java.exception.InvalidNumberException;

public class PossibleArmstrongNumber {
	private int limit;

	public PossibleArmstrongNumber(int limit) {
		this.limit = limit;
	}

	public void possibleArmstrong() throws InvalidNumberException {
		if (limit < 0) {
			throw new InvalidNumberException("Please enter the number which is greater than 0");
		}
		System.out.println("The possible armstrong number are as follows :");
		for (int i = 1; i <= limit; i++) {
			ArmstrongNumber am = new ArmstrongNumber(i);
			boolean result = am.isArmstrong();
			if (result == true) {
				System.out.print(i + " ");
			}
		}

	}
}
