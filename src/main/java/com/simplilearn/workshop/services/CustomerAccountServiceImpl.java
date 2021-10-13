package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.CustomerAccount;
import com.simplilearn.workshop.repository.CustomerAccountRepository;


@Service(value = "customerAccountService")
public class CustomerAccountServiceImpl implements CustomerAccountService {
	
	@Autowired
	private CustomerAccountRepository customerAccountRepository;
	@Override
	public List<CustomerAccount> getCustomerAccounts() {
		return customerAccountRepository.findAll();
	}

	@Override
	public CustomerAccount saveCustomerAccount(CustomerAccount theCustomerAccount) {
		return customerAccountRepository.save(theCustomerAccount);
	}

	@Override
	public CustomerAccount getCustomerAccount(Integer theId) {
		return customerAccountRepository.findById(theId).get();
	}

	@Override
	public void deleteCustomerAccount(Integer theid) {
		customerAccountRepository.deleteById(theid);

	}

	@Override
	public List<CustomerAccount> getCustomerAccountsbyCustId(Integer theCustId) {
		return customerAccountRepository.findBycustid(theCustId);
	}

	
	

}
