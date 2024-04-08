package program.int007.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before swapping " + list);
		Collections.swap(list, 0, 1);
		System.out.println("After swapping " + list);
	}
}
