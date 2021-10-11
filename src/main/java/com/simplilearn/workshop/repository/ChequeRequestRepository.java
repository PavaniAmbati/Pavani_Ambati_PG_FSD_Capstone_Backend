package com.simplilearn.workshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simplilearn.workshop.model.ChequeRequest;
import com.simplilearn.workshop.model.ChequeRequestAccounts;

public interface ChequeRequestRepository extends JpaRepository<ChequeRequest, Integer>{

	List<ChequeRequest> findBychequerequeststatus(String status);

	//@Query("select new ChequeRequestAccounts(a,b) from ChequeRequest as a inner join CustomerAccount as b on a.custid=b.custid")
	//public List<ChequeRequestAccounts> findAllbyJoin();
	
	//@Query("SELECT b.accountnumber,"
			//+ " a.chequetype, a.chequerequeststatus FROM ChequeRequest a inner join CustomerAccount b on a.accountid = b.accountid")
	
	//@Query("SELECT b.accountnumber, a.chequetype, a.chequerequeststatus  FROM chequerequest a inner join customeraccount b on a.accountid=b.accountid")
	//public List<ChequeRequest> findAllbyJoin();
	//
}
