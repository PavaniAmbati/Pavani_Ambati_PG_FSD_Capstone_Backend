package com.simplilearn.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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

	@Override
	public AdminUser updateAdminUser(AdminUser adminUser, Integer Id) {
		
		AdminUser adminuser = adminUserRepository.findById(Id).orElseThrow(
				  () -> new ResourceNotFoundException());
		
		adminuser.setUsername(adminUser.getUsername());
		adminuser.setPassword(adminUser.getPassword());
		adminUserRepository.save(adminuser);
		return adminuser;
	}

	@Override
	public AdminUser updateAdminUserbyUsername(AdminUser adminUser, String username) {
		
		AdminUser adminuser = adminUserRepository.findByUsername(username)			
				.orElseThrow(
				  () -> new ResourceNotFoundException());
		
		adminuser.setPassword(adminUser.getPassword());
		adminUserRepository.save(adminuser);
		return adminuser;
	}

	
	

}
