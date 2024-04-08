package program.int007.java;

import java.util.Scanner;

public class ArrayInsertion {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before insertion :");
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println('\n' + "Enter the location at which we want to insert ");
		int location = sc.nextInt();
		System.out.println("Enter the value at which we want to insert ");
		int value = sc.nextInt();
		for (int i = a.length - 1; i > location; i--) {
			a[i] = a[i - 1];
		}
		a[location] = value;
		System.out.println("After insertion :");
		for (int num : a) {
			System.out.print(num + " ");
		}

	}
}
