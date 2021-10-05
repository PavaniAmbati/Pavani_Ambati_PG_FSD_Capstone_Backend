package com.simplilearn.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.workshop.model.AdminUser;

public interface AdminUserRepository extends JpaRepository<AdminUser, Integer>{

}
