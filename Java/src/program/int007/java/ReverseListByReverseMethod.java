package program.int007.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListByReverseMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before reverse " + list);
		Collections.reverse(list);
		System.out.println("After reverse  " + list);
	}
}
