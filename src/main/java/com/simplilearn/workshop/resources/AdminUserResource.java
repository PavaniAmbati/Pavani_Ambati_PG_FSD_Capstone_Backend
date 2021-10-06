package com.simplilearn.workshop.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.workshop.model.AdminUser;
import com.simplilearn.workshop.services.AdminUserService;

@RestController
@RequestMapping("/api/adminusers")
public class AdminUserResource {
	
	@Autowired
	private AdminUserService adminUserService;
	
	
	public AdminUserResource(AdminUserService adminUserService) {
		super();
		this.adminUserService = adminUserService;
	}

	//get all users
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public List<AdminUser> retrieveAllAdminUsers(){
		return adminUserService.getAdminUsers();
	}
	
	//get user by id
	//http://localhost:8000/api/adminusers/1
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("{id}")
	public ResponseEntity<AdminUser> getAdminUserbyId(@PathVariable ("id") int userid){
		AdminUser getAdminUserbyId = adminUserService.getAdminUser(userid);
		return new ResponseEntity<AdminUser>(getAdminUserbyId, HttpStatus.OK);
	}

	//create new admin user 
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping()
	public ResponseEntity<AdminUser> createAdminUser(@RequestBody AdminUser theAdminUser) {
		AdminUser savedAdminUser = adminUserService.saveAdminUser(theAdminUser);
			
			return new ResponseEntity<AdminUser>(savedAdminUser,HttpStatus.CREATED);
		}
	
	/*
	//update admin password by id
	//response : 204
	//http://localhost:8000/api/adminusers/1
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<AdminUser> updateAdminUser(@PathVariable("id") Integer id
    											,@RequestBody AdminUser adminUser){
		
		AdminUser updateUser = adminUserService.updateAdminUser(adminUser, id);
		return new ResponseEntity<AdminUser>(updateUser, HttpStatus.OK);
	
	}*/
	
	
	//update admin password by username
	//response : 204
	//http://localhost:8000/api/adminusers/admin
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("{username}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<AdminUser> updateAdminUser(@PathVariable("username") String username,
	    											@RequestBody AdminUser adminUser){
			
		AdminUser updateUser = adminUserService.updateAdminUserbyUsername(adminUser, username);
		return new ResponseEntity<AdminUser>(updateUser, HttpStatus.OK);
		
	}
	
	//delete admin user by id
	//http://localhost:8000/api/adminusers/1
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAdminUser(@PathVariable("id") Integer id){
		
		adminUserService.deleteAdminUser(id);
		return new ResponseEntity<String>("AdminUser deleted successfully!", HttpStatus.OK);
	}
	


}
