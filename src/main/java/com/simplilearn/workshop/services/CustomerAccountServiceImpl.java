package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.Customer;
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

	@Override
	public CustomerAccount updateCustomerAccount(CustomerAccount customeraccount, Integer Id) {
		CustomerAccount custacc = customerAccountRepository.findById(Id).orElseThrow(
				  () -> new ResourceNotFoundException());
		
		custacc.setAccountnumber(customeraccount.getAccountnumber());
		custacc.setCustid(customeraccount.getCustid());
		custacc.setAccounttype(customeraccount.getAccounttype());
		custacc.setPinnumber(customeraccount.getPinnumber());
		custacc.setTotalamount(customeraccount.getTotalamount());
		
		customerAccountRepository.save(custacc);
		return customeraccount;
	}

	@Override
	public List<CustomerAccount> getCustomerAccountbyNumber(String theAccnum) {
		return customerAccountRepository.findByaccountnumber(theAccnum);
	}
	
}

	

