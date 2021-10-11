package com.simplilearn.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="chequerequest")
@Table(name = "chequerequest")
public class ChequeRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer chequerequestid;
	
	@Column(name = "accountid")
	private Integer accountid;
	
	@Column(name = "accountnumber")
	private String accountnumber;
	
	@Column(name = "chequetype")
	private String chequetype;
	
	@Column(name = "chequerequeststatus")
	private String chequerequeststatus;
	
	@JsonBackReference (value = "custaccountchq")
	@ManyToOne
	//relationship (many cheque requests are associated with one customer account)
	private CustomerAccount customeraccount;

	public ChequeRequest() {
		super();
	}

	
	public ChequeRequest(Integer chequerequestid, Integer accountid, String accountnumber, String chequetype,
			String chequerequeststatus) {
		super();
		this.chequerequestid = chequerequestid;
		this.accountid = accountid;
		this.accountnumber = accountnumber;
		this.chequetype = chequetype;
		this.chequerequeststatus = chequerequeststatus;
	}


	public Integer getChequerequestid() {
		return chequerequestid;
	}

	public void setChequerequestid(Integer chequerequestid) {
		this.chequerequestid = chequerequestid;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}
	

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

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
		return "ChequeRequest [chequerequestid=" + chequerequestid + ", accountid=" + accountid + ", accountnumber="
				+ accountnumber + ", chequetype=" + chequetype + ", chequerequeststatus=" + chequerequeststatus + "]";
	}	
		

}
