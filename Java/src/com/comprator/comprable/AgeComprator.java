package com.comprator.comprable;

import java.util.Comparator;

public class AgeComprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getAge() - o2.getAge();
	}

}

class NameComprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareToIgnoreCase(o1.getName());
	}

}

class StdComprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStd().compareToIgnoreCase(o2.getStd());
	}

}