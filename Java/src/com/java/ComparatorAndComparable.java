package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.java.oops.Test;

public class ComparatorAndComparable {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Ashish", 70000);
		Emp e2 = new Emp(5, "Abhay", 55000);
		Emp e3 = new Emp(6, "Anuj", 80000);
		Emp e4 = new Emp(33, "Amit", 60000);
		Emp e6 = new Emp(2, "Ajay", 57000);
		Emp e5 = new Emp(22, "Ashmita", 45000);
		// System.out.println(e1);
		List<Emp> list = new ArrayList<>();
		list.add(e6);
		list.add(e4);
		list.add(e3);
		list.add(e1);
		list.add(e2);
		list.add(e5);
		System.out.println(list);

	}
}
/*
 * 
 * 2 - what is clonable interface. 3 - what is serializable interface. 4 - what
 * is deep cloning and shallow cloning. 5 - what is volatile variable. 6 - what
 * ia transieent variable.
 * 
 * differ. map and ConcurrentHashMap differ. map and FlatMap
 * 
 * 
 * What is singlenton What is SOLID Principal
 * 
 * 3..HashSet and ArrayList difference 4..FailFast and FailSafe 5..what is
 * thread 6..difference between hashset and arraylist
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
