package com.program.ashish.arrayprogram;

import java.util.Arrays;

public class CopyElementOneArrayToAnother {
	public static void main(String[] args) {
		int[] num = { 12, 13, 14, 15, 16 };
		Approach1(num);
		Approach2(num);
		Approach3(num);
		Approach4(num);
		Approach5(num);

	}

	private static void Approach5(int[] num) {
		// TODO Auto-generated method stub
		int[] clonedArray = Arrays.copyOfRange(num, 1, 4); // Copies elements 1, 2, and 3
		for (int i : clonedArray) {
			System.out.print(i + " ");
		}

	}

	private static void Approach4(int[] num) {
		// TODO Auto-generated method stub
		int[] num2 = Arrays.copyOf(num, num.length);
		for (int i : num2) {
			System.out.print(i + " ");
		}
	}

	private static void Approach3(int[] num) {
		// TODO Auto-generated method stub
		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);
		for (int i : num2) {
			System.out.print(i + " ");
		}

	}

	private static void Approach2(int[] num) {
		// TODO Auto-generated method stub
		int[] newArray = num.clone();
		for (int i : newArray) {
			System.out.print(i + " ");
		}

	}

	private static void Approach1(int[] num) {
		// TODO Auto-generated method stub
		int length = num.length;
		int[] copy = new int[length];
		int index = 0;
		for (int i : num) {
			copy[index] = i;
			index++;
		}
		for (int i : copy) {
			System.out.print(i + " ");
		}

	}
}
