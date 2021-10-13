package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.model.CustomerAccount;
import com.simplilearn.workshop.model.CustomerTransaction;
import com.simplilearn.workshop.repository.CustomerTransactionRepository;

@Service(value = "customerTransactionService")
public class CustomerTransactionServiceImpl implements CustomerTransactionService{
	
	@Autowired
	private CustomerTransactionRepository customerTransactionRepository;
	@Override
	public List<CustomerTransaction> getCustomerTransactions() {
		return customerTransactionRepository.findAll();
	}

	@Override
	public CustomerTransaction saveCustomerTransaction(CustomerTransaction theCustomerTransaction) {
		return customerTransactionRepository.save(theCustomerTransaction);
	}

	@Override
	public CustomerTransaction getCustomerTransaction(Integer theId) {
		return customerTransactionRepository.findById(theId).get();
	}

	@Override
	public void deleteCustomerTransaction(Integer theid) {
		customerTransactionRepository.deleteById(theid);

	}

	@Override
	public List<CustomerTransaction> getCustomerTransactionsbyAccId(Integer theAccId) {
		return customerTransactionRepository.findByaccountid(theAccId);
	}

	@Override
	public List<CustomerTransaction> getCusttransactionssbytranstype(String theTranstype) {
		return customerTransactionRepository.findBytranstype(theTranstype);
	}	
	
}
