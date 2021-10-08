package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.ChequeRequest;
import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.repository.CustomerRepository;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer theCustomer) {
		return customerRepository.save(theCustomer);
	}

	@Override
	public Customer getCustomer(Integer theId) {
		return customerRepository.findById(theId).get();
	}

	@Override
	public void deleteCustomer(Integer theid) {
		customerRepository.deleteById(theid);

	}

	@Override
	public Customer updateCustomer(Customer customer, Integer Id) {
		Customer cust = customerRepository.findById(Id).orElseThrow(
				  () -> new ResourceNotFoundException());
		
		cust.setFirstname(customer.getFirstname());
		cust.setLastname(customer.getLastname());
		cust.setPhonenumber(customer.getPhonenumber());
		cust.setEmail(customer.getEmail());
		cust.setHousenumber(customer.getHousenumber());
		cust.setStreetname(customer.getStreetname());
		cust.setCity(customer.getCity());
		cust.setState(customer.getState());
		cust.setPostalcode(customer.getCity());
		cust.setPassword(customer.getPassword());
		cust.setDateofbirth(customer.getDateofbirth());
		cust.setOnlineaccountstatus(customer.getOnlineaccountstatus());
		
		customerRepository.save(cust);
		return customer;
		
	}

	@Override
	public List<Customer> getCustomersbystatus(String theStatus) {
		return customerRepository.findByonlineaccountstatus(theStatus);
	}
	

}
