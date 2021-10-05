package com.simplilearn.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.ChequeRequest;

public interface ChequeRequestRepository extends JpaRepository<ChequeRequest, Integer>{

}
