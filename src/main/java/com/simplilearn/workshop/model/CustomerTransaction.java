package com.simplilearn.workshop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customertransaction")
public class CustomerTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transid;
	
	@Column(name = "accountid")
	private Integer accountid;
	
	@Column(name = "custid")
	private Integer custid;
	
	@Column(name = "transdate")
	private String transdate;
	
	@Column(name = "transtype")
	private String transtype;
	
	@Column(name = "transamount")
	private Float transamount;
	
	@Column(name = "balanceamount")
	private Float balanceamount;
	
	@Column(name = "transaccountnumber")
	private String transaccountnumber;
	
	@JsonBackReference (value = "custaccounttrans")
	//@JsonIgnoreProperties("CustomerAccount")
	@ManyToOne
	//relationship (many transactions is associated with one account)
	private CustomerAccount customeraccount;

	@JsonBackReference (value = "custtrans")
	//@JsonIgnoreProperties("Customer")
	@ManyToOne
	//relationship (many transactions is associated with one customer)
	private Customer customer;
	
	public CustomerTransaction() {
		super();
	}
	
	public CustomerTransaction(Integer transid, Integer accountid, Integer custid, String transdate, String transtype,
			Float transamount, Float balanceamount, String transaccountnumber) {
		super();
		this.transid = transid;
		this.accountid = accountid;
		this.custid = custid;
		this.transdate = transdate;
		this.transtype = transtype;
		this.transamount = transamount;
		this.balanceamount = balanceamount;
		this.transaccountnumber = transaccountnumber;
	}


	public Integer getTransid() {
		return transid;
	}

	public void setTransid(Integer transid) {
		this.transid = transid;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getCustid() {
		return custid;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}


	public String getTransdate() {
		return transdate;
	}

	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	public Float getTransamount() {
		return transamount;
	}

	public void setTransamount(Float transamount) {
		this.transamount = transamount;
	}

	public Float getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount(Float balanceamount) {
		this.balanceamount = balanceamount;
		
	}

	public String getTransaccountnumber() {
		return transaccountnumber;
	}

	public void setTransaccountnumber(String transaccountnumber) {
		this.transaccountnumber = transaccountnumber;
	}

	public CustomerAccount getCustomeraccount() {
		return customeraccount;
	}

	public void setCustomeraccount(CustomerAccount customeraccount) {
		this.customeraccount = customeraccount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerTransaction [transid=" + transid + ", accountid=" + accountid + ", custid=" + custid
				+ ", transdate=" + transdate + ", transtype=" + transtype + ", transamount=" + transamount
				+ ", balanceamount=" + balanceamount + ", transaccountnumber=" + transaccountnumber + "]";
	}

	
	

	
}
