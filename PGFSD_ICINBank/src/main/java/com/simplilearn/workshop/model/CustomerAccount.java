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

@Entity
@Table(name = "customeraccount")
public class CustomerAccount {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer accountid;
		
		//@Column(name = "custid")
		//private Integer custid;
		
		@Column(name = "accounttype")
		private String accounttype;
		
		@Column(name = "bankcardnumber")
		private String bankcardnumber;
		
		@Column(name = "pinnumber")
		private String pinnumber;
		
		@ManyToOne
		//relationship (many accounts is associated with one customer)
		private Customer customer;
		
		//one to many
		@OneToMany (mappedBy = 	"customeraccount")
		private List<CustomerTransaction> custtransactiontab = new ArrayList<CustomerTransaction>();
		
		//one to many
		@OneToMany (mappedBy = 	"customeraccount")
		private List<ChequeRequest> chequerequesttab = new ArrayList<ChequeRequest>();

		public CustomerAccount() {
			super();
	
		}

		public CustomerAccount(Integer accountid, Integer custid, String accounttype, String bankcardnumber,
				String pinnumber) {
			super();
			this.accountid = accountid;
			//this.custid = custid;
			this.accounttype = accounttype;
			this.bankcardnumber = bankcardnumber;
			this.pinnumber = pinnumber;
		}

		public Integer getAccountid() {
			return accountid;
		}

		public void setAccountid(Integer accountid) {
			this.accountid = accountid;
		}

		//public Integer getCustid() {
			//return custid;
		//}

		//public void setCustid(Integer custid) {
		//	this.custid = custid;
		//}

		public String getAccounttype() {
			return accounttype;
		}

		public void setAccounttype(String accounttype) {
			this.accounttype = accounttype;
		}

		public String getBankcardnumber() {
			return bankcardnumber;
		}

		public void setBankcardnumber(String bankcardnumber) {
			this.bankcardnumber = bankcardnumber;
		}

		public String getPinnumber() {
			return pinnumber;
		}

		public void setPinnumber(String pinnumber) {
			this.pinnumber = pinnumber;
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
			return "CustomerAccount [accountid=" + accountid + ", accounttype=" + accounttype
					+ ", bankcardnumber=" + bankcardnumber + ", pinnumber=" + pinnumber + "]";
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
