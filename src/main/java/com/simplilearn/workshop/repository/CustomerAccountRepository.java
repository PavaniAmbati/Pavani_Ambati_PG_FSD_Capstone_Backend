package com.simplilearn.workshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.model.CustomerAccount;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Integer>{

	List<CustomerAccount> findBycustid(Integer custId);
	List<CustomerAccount> findByaccountnumber(String accNum);

	
	

}
