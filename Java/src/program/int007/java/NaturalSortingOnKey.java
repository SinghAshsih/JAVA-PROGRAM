package program.int007.java;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class NaturalSortingOnKey {
	public static void main(String[] args) {
		//Student s1 = new Student(2, "ashish");
		TreeMap<String, String> map = new TreeMap<>();
		map.put("B", "Ashish");
		map.put("Z", "Ajay");
		map.put("H", "Aman");
		map.put("A", "Sachin");
		map.put("J", "Abhay");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int get() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ID =  " + id + " , Name =  " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
}