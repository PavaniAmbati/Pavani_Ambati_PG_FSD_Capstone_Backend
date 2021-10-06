package com.simplilearn.workshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.AdminUser;

public interface AdminUserRepository extends JpaRepository<AdminUser, Integer>{
	
	Optional<AdminUser> findByUsername(String userName);
	Optional<AdminUser> findByPassword(String password);
	//Optional<AdminUser> findByUsernamePassword(String username, String password);

}
