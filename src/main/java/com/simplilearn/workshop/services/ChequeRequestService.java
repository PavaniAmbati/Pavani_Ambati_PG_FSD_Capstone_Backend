package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.ChequeRequest;
import com.simplilearn.workshop.model.Customer;

public interface ChequeRequestService {

	public List<ChequeRequest> getChequeRequests();
	public ChequeRequest saveChequeRequest(ChequeRequest theChequeRequest);
	public ChequeRequest getChequeRequest(Integer theId);
	public List<ChequeRequest> getChequeRequestsbystatus(String theStatus);
	public void deleteChequeRequest(Integer theid);
	public ChequeRequest updateChequeRequest(ChequeRequest chequeRequest, Integer Id);
}
