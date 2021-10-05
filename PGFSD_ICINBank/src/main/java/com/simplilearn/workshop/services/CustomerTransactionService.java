package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.CustomerTransaction;

public interface CustomerTransactionService {
	
	public List<CustomerTransaction> getCustomerTransactions();
	public CustomerTransaction saveCustomerTransaction(CustomerTransaction theCustomerTransaction);
	public CustomerTransaction getCustomerTransaction(Integer theId);
	public void deleteCustomerTransaction(Integer theid);

}
