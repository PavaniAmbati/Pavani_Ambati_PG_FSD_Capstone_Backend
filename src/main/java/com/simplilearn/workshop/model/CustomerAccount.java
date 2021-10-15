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
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="customeraccount")
@Table(name = "customeraccount")
public class CustomerAccount {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer accountid;
		
		@Column(name = "custid")
		private Integer custid;
		
		@Column(name = "accounttype")
		private String accounttype;
		
		@Column(name = "accountnumber")
		private String accountnumber;
		
		@Column(name = "pinnumber")
		private String pinnumber;
		
		@Column(name = "totalamount")
		private Float totalamount;
				
		@JsonBackReference (value = "custaccount")
		//@JsonIgnoreProperties("customer")
		@ManyToOne
		//relationship (many accounts is associated with one customer)
		private Customer customer;
		
		//one to many
		//@JsonIgnoreProperties("custtransactiontab")
		@JsonManagedReference (value = "custaccounttrans")
		//@JsonIgnore
		@OneToMany (mappedBy = 	"customeraccount")
		private List<CustomerTransaction> custtransactiontab = new ArrayList<CustomerTransaction>();
		
		//one to many
		//@JsonIgnoreProperties("chequerequesttab")
		@JsonManagedReference (value = "custaccountchq")
		//@JsonIgnore
		@OneToMany (mappedBy = 	"customeraccount")
		private List<ChequeRequest> chequerequesttab = new ArrayList<ChequeRequest>();

		public CustomerAccount() {
			super();
	
		}

		
		public CustomerAccount(Integer accountid, Integer custid, String accounttype, String accountnumber,
				String pinnumber, Float totalamount) {
			super();
			this.accountid = accountid;
			this.custid = custid;
			this.accounttype = accounttype;
			this.accountnumber = accountnumber;
			this.pinnumber = pinnumber;
			this.totalamount = totalamount;
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

		public String getAccounttype() {
			return accounttype;
		}

		public void setAccounttype(String accounttype) {
			this.accounttype = accounttype;
		}

		public String getAccountnumber() {
			return accountnumber;
		}

		public void setAccountnumber(String accountnumber) {
			this.accountnumber = accountnumber;
		}

		public String getPinnumber() {
			return pinnumber;
		}

		public void setPinnumber(String pinnumber) {
			this.pinnumber = pinnumber;
		}
		
		public Float getTotalamount() {
			return totalamount;
		}

		public void setTotalamount(Float totalamount) {
			this.totalamount = totalamount;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public List<CustomerTransaction> getCusttransactiontab() {
			return custtransactiontab;
		}

		public void setCusttransactiontab(List<CustomerTransaction> custtransactiontab) {
			this.custtransactiontab = custtransactiontab;
		}

		public List<ChequeRequest> getChequerequesttab() {
			return chequerequesttab;
		}

		public void setChequerequesttab(List<ChequeRequest> chequerequesttab) {
			this.chequerequesttab = chequerequesttab;
		}

		
		
		@Override
		public String toString() {
			return "CustomerAccount [accountid=" + accountid + ", custid=" + custid + ", accounttype=" + accounttype
					+ ", accountnumber=" + accountnumber + ", pinnumber=" + pinnumber + ", totalamount=" + totalamount
					+ "]";
		}

		public void addCustomerTransaction(CustomerTransaction customertransactionTab) {
			customertransactionTab.setCustomeraccount(this);
			custtransactiontab.add(customertransactionTab);

		}
		
		public void addChequeRequest(ChequeRequest chequerequestTab) {
			chequerequestTab.setCustomeraccount(this);
			chequerequesttab.add(chequerequestTab);

		}

		

}
