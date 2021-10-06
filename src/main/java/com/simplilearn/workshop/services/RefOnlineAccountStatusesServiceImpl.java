package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.RefOnlineAccountStatuses;
import com.simplilearn.workshop.repository.RefOnlineAccountStatusesRepository;

@Service(value = "refOnlineAccountStatusesService")
public class RefOnlineAccountStatusesServiceImpl implements RefOnlineAccountStatusesService {
	
	@Autowired
	private RefOnlineAccountStatusesRepository refOnlineAccountStatusesRepository;
	@Override
	public List<RefOnlineAccountStatuses> getRefOnlineAccountStatusess() {
		return refOnlineAccountStatusesRepository.findAll();
	}

	@Override
	public RefOnlineAccountStatuses saveRefOnlineAccountStatuses(RefOnlineAccountStatuses theRefOnlineAccountStatuses) {
		return refOnlineAccountStatusesRepository.save(theRefOnlineAccountStatuses);
	}

	@Override
	public RefOnlineAccountStatuses getRefOnlineAccountStatuses(Integer theId) {
		return refOnlineAccountStatusesRepository.findById(theId).get();
	}

	@Override
	public void deleteRefOnlineAccountStatuses(Integer theid) {
		refOnlineAccountStatusesRepository.deleteById(theid);

	}


}
