package com.java;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {

		// Get the customer information
		List<Customer> customerList = CustomerClient.getCustomerData();

		// Converting collections object into stream object
		Stream<Customer> customerStream = customerList.stream();

		// wanted to display customer information
		Consumer<Customer> customerConsumer = (cust) -> System.out.println(cust);

	}
}
