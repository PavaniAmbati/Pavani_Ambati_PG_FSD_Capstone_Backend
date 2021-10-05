package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.workshop.model.AdminUser;
import com.simplilearn.workshop.repository.AdminUserRepository;

@Service(value = "adminUserService")
public class AdminUserServiceImpl implements AdminUserService{
	
	@Autowired
	private AdminUserRepository adminUserRepository;
	@Override
	public List<AdminUser> getAdminUsers() {
		return adminUserRepository.findAll();
	}

	@Override
	public AdminUser saveAdminUser(AdminUser theAdminUser) {
		return adminUserRepository.save(theAdminUser);
	}

	@Override
	public AdminUser getAdminUser(Integer theId) {
		return adminUserRepository.findById(theId).get();
	}

	@Override
	public void deleteAdminUser(Integer theid) {
		adminUserRepository.deleteById(theid);

	}

}
