package com.simplilearn.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "refonlineaccountstatuses")
public class RefOnlineAccountStatuses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer onlinestatusid;

	@Column(name = "onlinestatustype")
	private String onlinestatustype;

	public RefOnlineAccountStatuses() {
		super();
	}

	public RefOnlineAccountStatuses(Integer onlinestatusid, String onlinestatustype) {
		super();
		this.onlinestatusid = onlinestatusid;
		this.onlinestatustype = onlinestatustype;
	}

	public Integer getOnlinestatusid() {
		return onlinestatusid;
	}

	public void setOnlinestatusid(Integer onlinestatusid) {
		this.onlinestatusid = onlinestatusid;
	}

	public String getOnlinestatustype() {
		return onlinestatustype;
	}

	public void setOnlinestatustype(String onlinestatustype) {
		this.onlinestatustype = onlinestatustype;
	}

	@Override
	public String toString() {
		return "RefOnlineAccountStatuses [onlinestatusid=" + onlinestatusid + ", onlinestatustype=" + onlinestatustype
				+ "]";
	}
	
	
}
