package com.crs.main.service;

import java.util.List;

import com.crs.main.model.Customers;

public interface CustomerService {

	List <Customers> fetchAllCustomers();
	void saveCustomer(Customers customer);
	Customers findCustomerById(String email);
	void deleteCustomer(Customers customer);
	Boolean validateCustomer(String customerEmail, String customerPassword);
}
