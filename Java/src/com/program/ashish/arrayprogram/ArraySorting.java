package com.program.ashish.arrayprogram;

public class ArraySorting {
	public static void main(String[] args) {
		int[] num = { 2, 4, 88, 2, 44, 66, 99, 1, 0 };
		System.out.println("Before Sorting ");
		for (int i : num) {
			System.out.print(i + "  ");
		}
		sortAscending(num);
		sortDescending(num);
	}

	private static void sortDescending(int[] num) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
		System.out.println('\n' + "Descending oreder");
		for (int i : num) {
			System.out.print(i + "  ");
		}

	}

	private static void sortAscending(int[] num) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
		System.out.println('\n' + "AscendingOrder");
		for (int i : num) {
			System.out.print(i + "  ");
		}

	}
}
