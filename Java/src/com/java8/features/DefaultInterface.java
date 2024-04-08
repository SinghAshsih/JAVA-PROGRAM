package com.java8.features;

public interface DefaultInterface {
	// public void m1();

	default void add(int a, int b) {
		System.out.println("sum is " + (a + b));
	}
}
