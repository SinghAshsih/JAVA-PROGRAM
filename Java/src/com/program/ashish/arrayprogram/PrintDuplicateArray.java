package com.program.ashish.arrayprogram;

public class PrintDuplicateArray {
	public static void main(String[] args) {
		int[] num = { 23, 56, 23, 76, 87, 45, 56 };
		duplicate(num);
	}

	private static void duplicate(int[] num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("Duplicate Element is found at the indexs of  " + i + " , " + j + " is " + num[i]);
				}
			}
		}
	}
}
