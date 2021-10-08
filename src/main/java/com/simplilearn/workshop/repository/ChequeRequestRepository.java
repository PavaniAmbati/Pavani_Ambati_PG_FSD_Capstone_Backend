package com.simplilearn.workshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.ChequeRequest;
import com.simplilearn.workshop.model.Customer;

public interface ChequeRequestRepository extends JpaRepository<ChequeRequest, Integer>{

	List<ChequeRequest> findBychequerequeststatus(String status);
}
