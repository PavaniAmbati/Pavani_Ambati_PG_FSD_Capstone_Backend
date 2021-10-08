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

import com.simplilearn.workshop.model.ChequeRequest;
import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.services.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	public CustomerResource(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}


		//get all customers
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping()
		public List<Customer> retrieveAllCustomers(){
			return customerService.getCustomers();
		}
		
		//get customer by id
		//http://localhost:8000/api/customers/1
		//@CrossOrigin(origins = "http://localhost:4200")
		//@GetMapping("{id}")
		//public ResponseEntity<Customer> getCustomerbyId(@PathVariable ("id") int custid){
			///Customer getCustomerbyId = customerService.getCustomer(custid);
			//return new ResponseEntity<Customer>(getCustomerbyId, HttpStatus.OK);
		//}
		
		//get customer by status
		//http://localhost:8000/api/customers/active
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("{status}")
		public List<Customer> getCustomersbyStatus(@PathVariable ("status") String onlinestatus){
			//List<Customer> getCustomersbyStatus = customerService.getCustomersbystatus(onlinestatus);
			return customerService.getCustomersbystatus(onlinestatus);
		}
	
		//create new customer 
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping()
		public ResponseEntity<Customer> createCustomer(@RequestBody Customer theCustomer) {
			Customer savedCustomer = customerService.saveCustomer(theCustomer);
					
			return new ResponseEntity<Customer>(savedCustomer,HttpStatus.CREATED);
		}
		
		//update admin password by id
		//response : 204
		//http://localhost:8000/api/chequerequests/1
		@CrossOrigin(origins = "http://localhost:4200")
		@PutMapping("{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public ResponseEntity<Customer> updateCustomer(@PathVariable("id") Integer id
		    											,@RequestBody Customer customer){
				
			Customer updateCust = customerService.updateCustomer(customer, id);
			return new ResponseEntity<Customer>(updateCust, HttpStatus.OK);
			
		}

}
