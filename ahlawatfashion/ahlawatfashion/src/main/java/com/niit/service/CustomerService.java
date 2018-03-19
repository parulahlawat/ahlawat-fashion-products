package com.niit.service;

import java.util.List;

import com.niit.model.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();
	
	
	void addCustomer(Customer customer);

	Customer getCustomerByUsername(String username);
}
