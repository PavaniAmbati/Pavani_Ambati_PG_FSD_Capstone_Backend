package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.AdminUser;
import com.simplilearn.workshop.model.ChequeRequest;
import com.simplilearn.workshop.model.Customer;
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

	@Override
	public ChequeRequest updateChequeRequest(ChequeRequest chequeRequest, Integer Id) {
		ChequeRequest chequerequest = chequeRequestRepository.findById(Id).orElseThrow(
				  () -> new ResourceNotFoundException());
		
		chequerequest.setChequerequeststatus(chequeRequest.getChequerequeststatus());
		chequeRequestRepository.save(chequerequest);
		return chequerequest;
	}

	@Override
	public List<ChequeRequest> getChequeRequestsbystatus(String theStatus) {
		return chequeRequestRepository.findBychequerequeststatus(theStatus);
	}

	//@Override
	//public List<ChequeRequest> findAllbyJoin() {
		//return chequeRequestRepository.findAllbyJoin();
	//}
	
		
}
