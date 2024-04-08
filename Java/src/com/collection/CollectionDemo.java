package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		// list.add(2, 10);
		int size = list.size();
		int count = 1;
		for (int num : list) {
			if (count == 3) {
				System.out.print(num + 10);
			}
			count++;

//			if (count < size) {
//				System.out.print(" , ");
//			}
		}
		System.out.println('\n' + "New list");
		for (int num : list) {
			System.out.println(num);
		}

	}
}// remove an item from the list
