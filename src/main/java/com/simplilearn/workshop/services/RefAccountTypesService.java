package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.RefAccountTypes;

public interface RefAccountTypesService {
	
	public List<RefAccountTypes> getRefAccountTypess();
	public RefAccountTypes saveRefAccountTypes(RefAccountTypes theRefAccountTypes);
	public RefAccountTypes getRefAccountTypes(Integer theId);
	public void deleteRefAccountTypes(Integer theid);

}
