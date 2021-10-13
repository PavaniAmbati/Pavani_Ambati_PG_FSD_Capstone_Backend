package com.simplilearn.workshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.model.CustomerAccount;
import com.simplilearn.workshop.model.CustomerTransaction;

public interface CustomerTransactionRepository extends JpaRepository<CustomerTransaction, Integer>{
	
	List<CustomerTransaction> findByaccountid(Integer accId);
	List<CustomerTransaction> findBytranstype(String transtype);

}
