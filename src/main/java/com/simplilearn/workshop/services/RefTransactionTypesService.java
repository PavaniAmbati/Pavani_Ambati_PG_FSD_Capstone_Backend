package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.RefTransactionTypes;

public interface RefTransactionTypesService {
	
	public List<RefTransactionTypes> getRefTransactionTypess();
	public RefTransactionTypes saveRefTransactionTypes(RefTransactionTypes theRefTransactionTypes);
	public RefTransactionTypes getRefTransactionTypes(Integer theId);
	public void deleteRefTransactionTypes(Integer theid);

}
