package program.int007.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProgramAll {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 5, 88, 56, 98, 35, 75, 75, 5, 99, 11, 1);

		// 1 - Given a list of integers, find out all the even numbers exist in the list
		// using Stream functions?
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		System.out.println("*******************************************************");

		// 2 - Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> list2 = Arrays.asList(11, 12, 15, 100, 111, 23, 534, 56, 22, 521);
		list2.stream().map(x -> x + " ").filter(s -> s.startsWith("1")).forEach(System.out::println);

		System.out.println("*******************************************************");

		// 3 - How to find duplicate elements in a given integers list in java using
		// Stream functions?
		Set<Integer> set = new HashSet<>();
		list.stream().filter(x -> !set.add(x)).sorted().forEach(System.out::println);

		System.out.println("*******************************************************");

		// 4 - Given a list of integers, find the total number of elements present in
		// the list using Stream functions?
		long count = list.stream().count();
		System.out.println(count);

		System.out.println("*******************************************************");
		// 5 - Given a list of integers, find the maximum value element present in it
		// using Stream functions?

		int max = list.stream().distinct().max(Integer::compare).get();
		System.out.println(max);

		System.out.println("*******************************************************");
		// 7 - Given a list of integers, sort all the values present in it using Stream
		// functions?
		list.stream().sorted().forEach(System.out::println);

		System.out.println("*******************************************************");
		// 8 - Given a list of integers, sort all the values present in it in descending
		// order using Stream functions?

		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		System.out.println("*******************************************************");
		// Q1)find the comman elements from two list?
		List<Integer> common = new ArrayList<>();

		System.out.println("-------------------------------------------------------------");
		// Q2)how to reverse a list
		Comparator c = Collections.reverseOrder();
		Collections.sort(list2, c);
		System.out.println(list2);
		System.out.println("-------------------------------------------------------------");
		System.out.println("print in reverse order");
		for (int i = list2.size() - 1; i >= 0; i--) {
			System.out.println(list2.get(i));
		}
		System.out.println("-------------------------------------------");
		// Q3)program to remove duplicate from array list
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(3);
		in.add(4);
		in.add(2);
		in.add(4);
		in.add(1);
		in.add(5);
		in.add(2);
		// in.stream().distinct().forEach(System.out::println);
		for (int i = 0; i < in.size(); i++) {
			for (int j = i + 1; i < in.size(); j++) {
				if (in.get(i).equals(in.get(j))) {
					in.remove(j);
					j--;
				}
			}
		}
		System.out.println(in);
	}

}

class Time {

	public int factorial(int n) {
		if (n == 0) { // Base case: factorial of 0 is 1
			return 1;
		} else { // Recursive case: factorial(n) = n * factorial(n-1)
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Time t = new Time();
		int result = t.factorial(4);
		System.out.println(result);
		int i = 010;
		int j = 07;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i + " " + j);
	}
}