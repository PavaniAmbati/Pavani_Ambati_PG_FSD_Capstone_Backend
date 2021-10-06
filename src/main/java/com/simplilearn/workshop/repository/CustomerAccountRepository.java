package com.simplilearn.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.CustomerAccount;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Integer>{

}
