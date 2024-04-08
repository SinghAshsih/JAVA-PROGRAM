package com.program.ashish.string.program;

import java.util.Scanner;

public class MostRepeatedWordInAFile {
	public static void main(String[] args) {
		System.out.println("Enter the input ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			mostRepeated(input);
		} finally {
			sc.close();
		}
	}

	private static void mostRepeated(String input) {
		// TODO Auto-generated method stub
		
	}
}
