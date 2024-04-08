package com.program.ashish.string.program;

import java.util.Scanner;

public class SwapTwoVariableWithOutUsingThirdVariable {
	public static void main(String[] args) {
		System.out.println("Enter the first variable : ");
		Scanner sc = new Scanner(System.in);
		try {
			String m = sc.nextLine();
			System.out.println("Enter the second variable : ");
			String n = sc.nextLine();
			swap(m, n);
		} finally {
			sc.close();
		}

	}

	private static void swap(String m, String n) {
		// TODO Auto-generated method stub
		System.out.println("Before swapping ");
		System.out.println(m + "   " + n);
		System.out.println("After swapping  ");
		m = m + n;
		n = m.substring(0, m.length() - n.length());
		m = m.substring(n.length());
		System.out.println(m + "   " + n);
	}
}
