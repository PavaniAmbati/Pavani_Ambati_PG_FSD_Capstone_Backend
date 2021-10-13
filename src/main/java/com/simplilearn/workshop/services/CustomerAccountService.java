package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.CustomerAccount;

public interface CustomerAccountService {
	
	public List<CustomerAccount> getCustomerAccounts();
	public CustomerAccount saveCustomerAccount(CustomerAccount theCustomerAccount);
	public CustomerAccount getCustomerAccount(Integer theId);
	public void deleteCustomerAccount(Integer theid);
	public List<CustomerAccount> getCustomerAccountsbyCustId(Integer theCustId);

}
