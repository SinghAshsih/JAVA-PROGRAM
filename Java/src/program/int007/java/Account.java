package program.int007.java;

import java.util.Objects;

public class Account {
	private int id;
	private String name;

	public Account(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
		Account other = (Account) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "ID =  " + id + " Name =  " + name;
	}
}