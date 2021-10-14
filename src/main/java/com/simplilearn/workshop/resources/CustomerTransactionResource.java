package com.simplilearn.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.model.CustomerAccount;
import com.simplilearn.workshop.model.CustomerTransaction;
import com.simplilearn.workshop.services.CustomerTransactionService;

@RestController
@RequestMapping("/api/customertransactions")
public class CustomerTransactionResource {
	
	@Autowired
	private CustomerTransactionService customerTransactionService;

	public CustomerTransactionResource(CustomerTransactionService customerTransactionService) {
		super();
		this.customerTransactionService = customerTransactionService;
	}
	
	//get all customer transactions
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public List<CustomerTransaction> retrieveAllCustomerTransactions(){
		return customerTransactionService.getCustomerTransactions();
		
	}
			
	//get customer transactions by id
	//http://localhost:8000/api/customertransactions/1
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("id/{id}")
	public ResponseEntity<CustomerTransaction> getCustomerTransactionbyId(@PathVariable ("id") int transid){
		CustomerTransaction getCustomerTransactionbyId = customerTransactionService.getCustomerTransaction(transid);
		return new ResponseEntity<CustomerTransaction>(getCustomerTransactionbyId, HttpStatus.OK);
	}
	
	//get customer transactions by transtype
	//http://localhost:8000/api/customertransactions/active
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("{transtype}")
	public List<CustomerTransaction> getCusttransactionsbyTranstype(@PathVariable ("transtype") String transtype){
		//List<Customer> getCustomersbyStatus = customerService.getCustomersbystatus(onlinestatus);
		return customerTransactionService.getCusttransactionssbytranstype(transtype);
	}

	//create new customer transaction
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping()
	public ResponseEntity<CustomerTransaction> createCustomerTransaction(@RequestBody CustomerTransaction theCustomerTransaction) {
		CustomerTransaction savedCustomerTransaction = customerTransactionService.saveCustomerTransaction(theCustomerTransaction);
						
		return new ResponseEntity<CustomerTransaction>(savedCustomerTransaction,HttpStatus.CREATED);
	}
	
	//get customer accounts by cust id
	//http://localhost:8000/api/customeraccounts/custid/1
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("accountid/{id}")
	public List<CustomerTransaction> getCustomerTransactionbyAccId(@PathVariable ("id") int accid){
		return customerTransactionService.getCustomerTransactionsbyAccId(accid);
	}

	

}
