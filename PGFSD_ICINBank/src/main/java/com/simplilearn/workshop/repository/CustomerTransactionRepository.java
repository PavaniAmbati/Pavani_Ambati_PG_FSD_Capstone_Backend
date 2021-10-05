package com.simplilearn.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.CustomerTransaction;

public interface CustomerTransactionRepository extends JpaRepository<CustomerTransaction, Integer>{

}
