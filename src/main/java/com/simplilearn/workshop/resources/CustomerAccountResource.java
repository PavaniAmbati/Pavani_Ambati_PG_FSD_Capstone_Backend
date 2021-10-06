package com.simplilearn.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.model.CustomerAccount;
import com.simplilearn.workshop.services.CustomerAccountService;

@RestController
@RequestMapping("/api/customeraccounts")
public class CustomerAccountResource {
	
	@Autowired
	private CustomerAccountService customerAccountService;

	public CustomerAccountResource(CustomerAccountService customerAccountService) {
		super();
		this.customerAccountService = customerAccountService;
	}
	
	//get all customer accounts
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public List<CustomerAccount> retrieveAllCustomerAccounts(){
		return customerAccountService.getCustomerAccounts();
	}
	
	//get customer account by id
	//http://localhost:8000/api/customeraccounts/1
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("{id}")
	public ResponseEntity<CustomerAccount> getCustomerAccountbyId(@PathVariable ("id") int accountid){
		CustomerAccount getCustomerAccountbyId = customerAccountService.getCustomerAccount(accountid);
		return new ResponseEntity<CustomerAccount>(getCustomerAccountbyId, HttpStatus.OK);
	}



}