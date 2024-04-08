package com.comprator.comprable;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private String std;
	private Address address;

	public Student(int id, String name, int age, String std, Address address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.std = std;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "[ Id = " + id + "  ,Name = " + name + "  , age =  " + age + " ,std = " + std + "  , address = "
				+ address + "  ]";
	}

	@Override
	public int compareTo(Student o) {
		return this.id - o.id;

	}
}
