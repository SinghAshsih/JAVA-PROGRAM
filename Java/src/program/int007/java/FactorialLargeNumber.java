package program.int007.java;

import java.math.BigInteger;

public class FactorialLargeNumber {
	public static void main(String[] args) {
		int number = 56;
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i < number; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}
}
