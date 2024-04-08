package program.int007.java;

import java.util.Arrays;
import java.util.List;

public class SquareQuestion {

	public void square() {
		List<Integer> list = Arrays.asList(-4, -1, 0, 11, 5, 3, 12);
		System.out.println("Your Input");
		for (int num : list) {
			System.out.print(num + " ");
		}
		System.out.println("\n" + "Your Output ");
		list.stream().map(x -> x * x).sorted().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SquareQuestion sq = new SquareQuestion();
		sq.square();
	}
}
