package program.int007.java;

import java.util.Scanner;

public class LeapYearProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the year ");
			int year = sc.nextInt();
			isLeapYear(year);
			leapYear(year);
		} finally {
			sc.close();
		}

	}

	private static void leapYear(int year) {
		// TODO Auto-generated method stu
		
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap year");
		}

	}

	private static void isLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0 && year % 4 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not Leap year");
			}

		} else {
			if (year % 4 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not Leap Year");
			}
		}

	}
}
