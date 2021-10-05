package com.simplilearn.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.services.CustomerService;

@RestController
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	//Get all the customers URI (/customers)
		//HTTP method GET
//		@RequestMapping(path = "/customers",method = RequestMethod.GET)
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/getcustomers")
		public List<Customer> retrieveAllCustomers(){
			return customerService.getCustomers();
		}
	
		
		// assigment  : update the customer @PutMapping
		//response : 204
		@PutMapping("/putcustomers/{theId}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void updateCustomer(@PathVariable Integer theId,@RequestBody Customer theCustomer) {
	        Customer savedCustomer = customerService.getCustomer(theId);
		
		savedCustomer.setOnlineaccountstatus(theCustomer.getOnlineaccountstatus());
		}
	

}
