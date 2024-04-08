package program.int007.java;

import java.util.Arrays;

public class SecondHighestElementInAnArraay {
	public static void main(String[] args) {
		int[] arr = { 89, 98, 56, 33, 90, 22, 99 };
		Arrays.sort(arr);
		System.out.println("Second Highest : " + arr[(arr.length - 2)]);
	}
}
