package com.java;

import java.util.Arrays;
import java.util.List;

public class CustomerClient {
	public static List<Customer> getCustomerData() {
		Address homeAddress = new Address("Orai", "285001", "001");
		Address officeAddress = new Address("Lucknow", "0512", "0711");
		Customer customer1 = new Customer(1, "Ashish", "Orai", "ashish@gmail.com", "9554024356",
				Arrays.asList(homeAddress, officeAddress));
		Customer customer2 = new Customer(2, "Deepak", "lucknow", "deepak@gmail.com", "9936397492",
				Arrays.asList(homeAddress, officeAddress));
		Customer customer3 = new Customer(3, "Sachin", "Orai", "sachin@gmail.com", "9256768767",
				Arrays.asList(homeAddress, officeAddress));
		Customer customer4 = new Customer(4, "Abhay", "Orai", "abhay@gmail.com", "9565765656",
				Arrays.asList(homeAddress, officeAddress));
		Customer customer5 = new Customer(5, "Ajay", "Lucknow", "ajay@gmail.com", "9000023356",
				Arrays.asList(homeAddress, officeAddress));
		Customer customer6 = new Customer(6, "Amit", "Orai", "amitsingh@gmail.com", "9444043456",
				Arrays.asList(homeAddress, officeAddress));
		Customer customer7 = new Customer(7, "Nayan", "Orai", "nayan@gmail.com", "8905402456",
				Arrays.asList(homeAddress, officeAddress));
		Customer customer8 = new Customer(8, "Alok", "Lucknow", "alok@gmail.com", "9554012345",
				Arrays.asList(homeAddress, officeAddress));
		return Arrays.asList(customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8);
	}
}
