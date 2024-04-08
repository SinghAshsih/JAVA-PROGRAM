package program.int007.java;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitStringInManyWays {
	// Approaches 1
	public static void split1(String input) {
		String[] arr = input.split(" ");
		for (String name : arr) {
			System.out.println(name);
		}
	}

	// Approaches2
	public static void split2(String input) {
		List<String> list = Pattern.compile(" ").splitAsStream(input).collect(Collectors.toList());
		for (String name : list) {
			System.out.println(name);
		}
	}

// Approaches 3
	public static void split3(String input) {
		StringTokenizer st = new StringTokenizer(input, " ");
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);

		}
	}
	// Approaches4

	public static void main(String[] args) {
		System.out.println("Enter the input : ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			split3(input);
		} finally {
			sc.close();
		}
	}
}
