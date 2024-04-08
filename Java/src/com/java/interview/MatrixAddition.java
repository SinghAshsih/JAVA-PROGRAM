package com.java.interview;

public class MatrixAddition {
	public static void main(String[] args) {
		int[][] arr1 = { { 12, 23, 23 }, 
				         { 22, 67, 36 } };
		
		int[][] arr2 = { { 11, 12, 13 }, 
				         { 23, 5, 23 } };
		Utility.matrixAddition(arr1, arr2);
	}
}
