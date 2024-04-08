package com.java.externalisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeClient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee ems = new Employee();
		ems.setId(1);
		ems.setName("Ashish Singh");

		FileOutputStream fo = new FileOutputStream("C:\\Users\\ashis\\OneDrive\\Documents\\codedecodefile.ser");
		ObjectOutputStream ous = new ObjectOutputStream(fo);
		ous.writeObject(ems);
		fo.close();
		ous.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\ashis\\OneDrive\\Documents\\codedecodefile.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee em = (Employee) ois.readObject();
		System.out.println(em.getId() + "  " + em.getName());
		fis.close();
		ois.close();

	}
}

