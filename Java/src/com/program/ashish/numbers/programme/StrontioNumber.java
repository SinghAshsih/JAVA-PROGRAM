package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class StrontioNumber {
public static void main(String[] args) {
	System.out.println("Enter the 4 digit number ");
	Scanner sc=new Scanner(System.in);
	try {
		int num=sc.nextInt();
		Utility07.isStrontioNumber(num);
	}
	finally {
		sc.close();
	}
}
}
