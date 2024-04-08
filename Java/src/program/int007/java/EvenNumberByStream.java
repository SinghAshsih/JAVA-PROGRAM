package program.int007.java;

import java.util.Arrays;

public class EvenNumberByStream {
	public static void main(String[] args) {
		Integer[] num = new Integer[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		Arrays.stream(num).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
	}
}