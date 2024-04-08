package program.int007.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DifferenceOfTwoDates {
	public static void main(String[] args) {
		difference();
	}

	private static void difference() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the  1st year :");
			int year = sc.nextInt();
			System.out.println("Enter the  month :");
			int month = sc.nextInt();
			System.out.println("Enter the  date :");
			int date = sc.nextInt();
			LocalDate d1 = LocalDate.of(year, month, date);

			System.out.println("Enter the  2nd year :");
			int year2 = sc.nextInt();
			System.out.println("Enter the  month :");
			int month2 = sc.nextInt();
			System.out.println("Enter the  date :");
			int date2 = sc.nextInt();
			LocalDate d2 = LocalDate.of(year2, month2, date2);
			Period p = Period.between(d1, d2);
			System.out.println("Number of days " + p.getDays());
			System.out.println("Number of month " + p.getMonths());
			System.out.println("Number of year " + p.getYears());
		} finally {
			sc.close();
		}
	}
}
