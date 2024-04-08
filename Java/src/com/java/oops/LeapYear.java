package com.java.oops;

public class LeapYear {
	private int year;

	public LeapYear(int year) {
		this.year = year;

	}

	public void checkYear() {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not leap year");
			}
		} else {
			if (year % 4 == 0) {
				System.out.println("Leap year ");
			} else {
				System.out.println("Not Leap Year");
			}
		}
	}
}
