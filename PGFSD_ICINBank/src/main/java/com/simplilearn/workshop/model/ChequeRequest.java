package com.simplilearn.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chequerequest")
public class ChequeRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer chequerequestid;
	
	//@Column(name = "accountid")
	//private Integer accountid;
	
	@Column(name = "chequetype")
	private String chequetype;
	
	@Column(name = "chequerequeststatus")
	private String chequerequeststatus;
	
	@ManyToOne
	//relationship (many cheque requests are associated with one customer account)
	private CustomerAccount customeraccount;

	public ChequeRequest() {
		super();
	}

	public ChequeRequest(Integer chequerequestid, Integer accountid, String chequetype, String chequerequeststatus) {
		super();
		this.chequerequestid = chequerequestid;
		//this.accountid = accountid;
		this.chequetype = chequetype;
		this.chequerequeststatus = chequerequeststatus;
	}

	public Integer getChequerequestid() {
		return chequerequestid;
	}

	public void setChequerequestid(Integer chequerequestid) {
		this.chequerequestid = chequerequestid;
	}

	//public Integer getAccountid() {
		//return accountid;
	//}

	//public void setAccountid(Integer accountid) {
		//this.accountid = accountid;
	//}

	public String getChequetype() {
		return chequetype;
	}

	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}

	public String getChequerequeststatus() {
		return chequerequeststatus;
	}

	public void setChequerequeststatus(String chequerequeststatus) {
		this.chequerequeststatus = chequerequeststatus;
	}

	public CustomerAccount getCustomeraccount() {
		return customeraccount;
	}

	public void setCustomeraccount(CustomerAccount customeraccount) {
		this.customeraccount = customeraccount;
	}

	@Override
	public String toString() {
		return "ChequeRequest [chequerequestid=" + chequerequestid + ", chequetype="
				+ chequetype + ", chequerequeststatus=" + chequerequeststatus + "]";
	}
		

}
