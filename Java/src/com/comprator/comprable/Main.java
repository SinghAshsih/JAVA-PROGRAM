package com.comprator.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ashish", 16, "8th", new Address(12, "New Pal Nagar ", 285001));
		Student s2 = new Student(2, "Arun", 17, "9th", new Address(15, "New Ambedakar Nagar ", 285001));
		Student s3 = new Student(4, "Abhay", 18, "10th", new Address(16, "New Shyam Nagar ", 285001));
		Student s4 = new Student(3, "Ajay", 19, "11th", new Address(10, "New Ram Nagar ", 285001));
		Student s5 = new Student(5, "Amit", 20, "12th", new Address(11, "New Susheel Nagar ", 285001));
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list);
		System.out.println();
		Collections.sort(list);
		
		System.out.println(list);
		System.out.println();
		Collections.sort(list, new NameComprator());
		System.out.println(list);

	}
}
