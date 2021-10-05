package com.simplilearn.workshop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer custid;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "phonenumber")
	private String phonenumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "housenumber")
	private String housenumber;
	
	@Column(name = "streetname")
	private String streetname;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "postalcode")
	private String postalcode;
	
	@Column(name = "dateofbirth")
	private String dateofbirth;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "onlineaccountstatus")
	private String onlineaccountstatus;
		
	//one to many
	@OneToMany (mappedBy = 	"customer")
	private List<CustomerAccount> custaccounttab = new ArrayList<CustomerAccount>();
	
	//one to many
	@OneToMany (mappedBy = 	"customer")
	private List<CustomerTransaction> custtransactiontab = new ArrayList<CustomerTransaction>();
			
	public Customer(Integer custid, String firstname, String lastname, String phonenumber, String email,
			String housenumber, String streetname, String city, String state, String country, String postalcode,
			String dateofbirth, String bankcardnumber, String username, String password, String onlineaccountstatus) {
		super();
		this.custid = custid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.housenumber = housenumber;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalcode = postalcode;
		this.dateofbirth = dateofbirth;
		this.username = username;
		this.password = password;
		this.onlineaccountstatus = onlineaccountstatus;
	}

	public Customer() {
		super();
	}

	public Integer getCustid() {
		return custid;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOnlineaccountstatus() {
		return onlineaccountstatus;
	}

	public void setOnlineaccountstatus(String onlineaccountstatus) {
		this.onlineaccountstatus = onlineaccountstatus;
	}
	
	public List<CustomerAccount> getCustaccounttab() {
		return custaccounttab;
	}

	public void setCustaccounttab(List<CustomerAccount> custaccounttab) {
		this.custaccounttab = custaccounttab;
	}

	public List<CustomerTransaction> getCusttransactiontab() {
		return custtransactiontab;
	}

	public void setCusttransactiontab(List<CustomerTransaction> custtransactiontab) {
		this.custtransactiontab = custtransactiontab;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber="
				+ phonenumber + ", email=" + email + ", housenumber=" + housenumber + ", streetname=" + streetname
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", postalcode=" + postalcode
				+ ", dateofbirth=" + dateofbirth + ", username=" + username + ", password=" + password
				+ ", onlineaccountstatus=" + onlineaccountstatus + "]";
	}

	public void addCustomerAccount(CustomerAccount customeraccountTab) {
		customeraccountTab.setCustomer(this);
		custaccounttab.add(customeraccountTab);

	}
	
	public void addCustomerTransaction(CustomerTransaction customertransactionTab) {
		customertransactionTab.setCustomer(this);
		custtransactiontab.add(customertransactionTab);

	}
	

}
