package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.RefTransactionTypes;
import com.simplilearn.workshop.repository.RefTransactionTypesRepository;


@Service(value = "refTransactionTypesService")
public class RefTransactionTypesServiceImpl implements RefTransactionTypesService {
	
	@Autowired
	private RefTransactionTypesRepository refTransactionTypesRepository;
	
	@Override
	public List<RefTransactionTypes> getRefTransactionTypess() {
		return refTransactionTypesRepository.findAll();
	}
	
	@Override
	public RefTransactionTypes saveRefTransactionTypes(RefTransactionTypes theRefTransactionTypes) {
		return refTransactionTypesRepository.save(theRefTransactionTypes);
	}

	@Override
	public RefTransactionTypes getRefTransactionTypes(Integer theId) {
		return refTransactionTypesRepository.findById(theId).get();
	}

	@Override
	public void deleteRefTransactionTypes(Integer theid) {
		refTransactionTypesRepository.deleteById(theid);

	}


}
