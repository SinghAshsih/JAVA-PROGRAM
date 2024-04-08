package com.program.ashish.arrayprogram;

public class PrintArrayAtEvenAndOddPosition {
	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 6, 75, 32, 25, 7, 31 };
		oddPosotion(num);
		evenPosition(num);
	}

	private static void oddPosotion(int[] num) {
		// TODO Auto-generated method stub
		System.out.println("Odd Position");
		for (int i = 0; i < num.length; i++) {
			if (i % 2 != 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

	private static void evenPosition(int[] num) {
		// TODO Auto-generated method stub
		System.out.println('\n' + "Even Position");
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
