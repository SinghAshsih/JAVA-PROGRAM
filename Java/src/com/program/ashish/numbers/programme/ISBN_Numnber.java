package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class ISBN_Numnber {
public static void main(String[] args) {
	System.out.println("Give me a 10-digit ISBN number ");
	Scanner sc=new Scanner(System.in);
	try {
		long num=sc.nextLong();
		Utility07.checkISBN(num);
	}
	finally {
		sc.close();
	}
}
}
