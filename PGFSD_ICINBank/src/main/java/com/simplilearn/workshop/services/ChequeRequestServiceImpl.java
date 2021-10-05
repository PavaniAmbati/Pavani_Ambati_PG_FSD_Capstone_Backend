package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.ChequeRequest;
import com.simplilearn.workshop.repository.ChequeRequestRepository;

@Service(value = "chequeRequest")
public class ChequeRequestServiceImpl implements ChequeRequestService{
	
	@Autowired
	private ChequeRequestRepository chequeRequestRepository;
	@Override
	public List<ChequeRequest> getChequeRequests() {
		return chequeRequestRepository.findAll();
	}

	@Override
	public ChequeRequest saveChequeRequest(ChequeRequest theChequeRequest) {
		return chequeRequestRepository.save(theChequeRequest);
	}

	@Override
	public ChequeRequest getChequeRequest(Integer theId) {
		return chequeRequestRepository.findById(theId).get();
	}

	@Override
	public void deleteChequeRequest(Integer theid) {
		chequeRequestRepository.deleteById(theid);

	}
	


}
