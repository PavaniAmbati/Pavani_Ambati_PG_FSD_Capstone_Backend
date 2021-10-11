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
import com.simplilearn.workshop.services.ChequeRequestService;

@RestController
@RequestMapping("/api/chequerequests")
public class ChequeRequestResource {

	@Autowired
	private ChequeRequestService chequeRequestService;

	public ChequeRequestResource(ChequeRequestService chequeRequestService) {
		super();
		this.chequeRequestService = chequeRequestService;
	}
	
	//get all cheque requests
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public List<ChequeRequest> retrieveAllChequeRequests(){
		return chequeRequestService.getChequeRequests();
	}
	
	//get all cheque requests by join
	//@CrossOrigin(origins = "http://localhost:4200")
	//@GetMapping()
	//public List<ChequeRequest> retrieveAllChequeRequestsbyjoin(){
		//return chequeRequestService.findAllbyJoin();
	//}
	
	//get cheque requests by id
	//http://localhost:8000/api/chequerequests/1
	//@CrossOrigin(origins = "http://localhost:4200")
	//@GetMapping("{id}")
	//public ResponseEntity<ChequeRequest> getChequeRequestbyId(@PathVariable ("id") int chequerequestid){
		//ChequeRequest getChequeRequestbyId = chequeRequestService.getChequeRequest(chequerequestid);
		//return new ResponseEntity<ChequeRequest>(getChequeRequestbyId, HttpStatus.OK);
	//}
	
	//get cheque requests by approval status
	//http://localhost:8000/api/chequerequests/approved
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("{status}")
	public List<ChequeRequest> getChequeRequestbyStatus(@PathVariable ("status") String chequerequeststatus){
		//ChequeRequest getChequeRequestbyStatus = chequeRequestService.getChequeRequest(chequerequeststatus);
		return chequeRequestService.getChequeRequestsbystatus(chequerequeststatus);
	}


	//create new cheque request 
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping()
	public ResponseEntity<ChequeRequest> createChequeRequest(@RequestBody ChequeRequest theChequeRequest) {
		ChequeRequest savedChequeRequest = chequeRequestService.saveChequeRequest(theChequeRequest);
				
		return new ResponseEntity<ChequeRequest>(savedChequeRequest,HttpStatus.CREATED);
	}
	
	//update admin password by id
	//response : 204
	//http://localhost:8000/api/chequerequests/1
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("{id}")
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	 public ResponseEntity<ChequeRequest> updateChequeRequest(@PathVariable("id") Integer id
	    											,@RequestBody ChequeRequest chequeRequest){
			
		ChequeRequest updateRequest = chequeRequestService.updateChequeRequest(chequeRequest, id);
		return new ResponseEntity<ChequeRequest>(updateRequest, HttpStatus.OK);
		
		}
	
	
}
