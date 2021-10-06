package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.RefAccountTypes;
import com.simplilearn.workshop.repository.RefAccountTypesRepository;

@Service(value = "refAccountTypesService")
public class RefAccountTypesServiceImpl implements RefAccountTypesService{
	
	@Autowired
	private RefAccountTypesRepository refAccountTypesRepository;
	@Override
	public List<RefAccountTypes> getRefAccountTypess() {
		return refAccountTypesRepository.findAll();
	}

	@Override
	public RefAccountTypes saveRefAccountTypes(RefAccountTypes theRefAccountTypes) {
		return refAccountTypesRepository.save(theRefAccountTypes);
	}

	@Override
	public RefAccountTypes getRefAccountTypes(Integer theId) {
		return refAccountTypesRepository.findById(theId).get();
	}

	@Override
	public void deleteRefAccountTypes(Integer theid) {
		refAccountTypesRepository.deleteById(theid);

	}

}
