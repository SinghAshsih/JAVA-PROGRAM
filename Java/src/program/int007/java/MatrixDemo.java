package program.int007.java;

import java.util.Scanner;

public class MatrixDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int r = sc.nextInt();
		System.out.println("Enter the column");
		int c = sc.nextInt();
		System.out.print("Enter the elment of matrix ");
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// Printing element of matrix
		System.out.println('\n' + "Displaying the element of matrix ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
