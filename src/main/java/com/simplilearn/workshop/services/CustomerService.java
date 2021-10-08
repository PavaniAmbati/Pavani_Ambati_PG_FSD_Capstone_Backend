package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public Customer saveCustomer(Customer theCustomer);
	public Customer getCustomer(Integer theId);
	public List<Customer> getCustomersbystatus(String theStatus);
	public void deleteCustomer(Integer theid);
	public Customer updateCustomer(Customer customer, Integer Id);

}
