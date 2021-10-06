package com.simplilearn.workshop.services;

import java.util.List;

import com.simplilearn.workshop.model.AdminUser;

public interface AdminUserService {
	
	public List<AdminUser> getAdminUsers();
	public AdminUser saveAdminUser(AdminUser theAdminUser);
	public AdminUser getAdminUser(Integer theId);
	public void deleteAdminUser(Integer theid);
	public AdminUser updateAdminUser(AdminUser adminUser, Integer Id);
	public AdminUser updateAdminUserbyUsername(AdminUser adminUser, String username);
}
