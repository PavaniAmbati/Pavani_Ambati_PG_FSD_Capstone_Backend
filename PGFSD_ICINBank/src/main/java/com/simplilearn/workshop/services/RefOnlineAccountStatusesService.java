package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.RefOnlineAccountStatuses;


public interface RefOnlineAccountStatusesService {
	
	public List<RefOnlineAccountStatuses> getRefOnlineAccountStatusess();
	public RefOnlineAccountStatuses saveRefOnlineAccountStatuses(RefOnlineAccountStatuses theRefOnlineAccountStatuses);
	public RefOnlineAccountStatuses getRefOnlineAccountStatuses(Integer theId);
	public void deleteRefOnlineAccountStatuses(Integer theid);

}
