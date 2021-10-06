package com.simplilearn.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reftransactiontypes")
public class RefTransactionTypes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transtypeid;

	@Column(name = "transtype")
	private String transtype;

	public RefTransactionTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RefTransactionTypes(Integer transtypeid, String transtype) {
		super();
		this.transtypeid = transtypeid;
		this.transtype = transtype;
	}

	public Integer getTranstypeid() {
		return transtypeid;
	}

	public void setTranstypeid(Integer transtypeid) {
		this.transtypeid = transtypeid;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	@Override
	public String toString() {
		return "RefTransactionTypes [transtypeid=" + transtypeid + ", transtype=" + transtype + "]";
	}
	
	

}
