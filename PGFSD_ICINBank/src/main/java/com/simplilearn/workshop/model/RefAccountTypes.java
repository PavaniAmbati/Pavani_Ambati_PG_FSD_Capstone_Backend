package com.simplilearn.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "refaccounttypes")
public class RefAccountTypes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accounttypeid;
	
	@Column(name = "accounttype")
	private String accounttype;
	
	public RefAccountTypes() {
		super();
	}

	public RefAccountTypes(Integer accounttypeid, String accounttype) {
		super();
		this.accounttypeid = accounttypeid;
		this.accounttype = accounttype;
	}

	public Integer getAccounttypeid() {
		return accounttypeid;
	}

	public void setAccounttypeid(Integer accounttypeid) {
		this.accounttypeid = accounttypeid;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	@Override
	public String toString() {
		return "RefAccountTypes [accounttypeid=" + accounttypeid + ", accounttype=" + accounttype + "]";
	}

}
