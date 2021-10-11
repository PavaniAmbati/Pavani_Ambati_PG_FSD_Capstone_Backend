package com.simplilearn.workshop.model;

public class ChequeRequestAccounts {

	private CustomerAccount customeraccount;
	private ChequeRequest chequerequest;
	
	public ChequeRequestAccounts() {}

	public ChequeRequestAccounts(CustomerAccount customeraccount, ChequeRequest chequerequest) {
		super();
		this.customeraccount = customeraccount;
		this.chequerequest = chequerequest;
	}

	public CustomerAccount getCustomeraccount() {
		return customeraccount;
	}

	public void setCustomeraccount(CustomerAccount customeraccount) {
		this.customeraccount = customeraccount;
	}

	public ChequeRequest getChequerequest() {
		return chequerequest;
	}

	public void setChequerequest(ChequeRequest chequerequest) {
		this.chequerequest = chequerequest;
	}
		
	
}
