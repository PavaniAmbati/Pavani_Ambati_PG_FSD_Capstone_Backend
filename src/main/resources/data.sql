insert into customer(firstname,lastname,phonenumber,email,housenumber,streetname,city,state,country,postalcode,dateofbirth,username,password,onlineaccountstatus) 
values ('pavani','ambati','888-888-8888','pavani@test.com','10','test drive','Aroura','Ontario','Canada','L8Y7Y7','09/26/1986','pavani','password','active');
insert into customer(firstname,lastname,phonenumber,email,housenumber,streetname,city,state,country,postalcode,dateofbirth,username,password,onlineaccountstatus) 
values ('jackie','king','455-454-5666','jackie.king@test.com','244','honeycomb drive','Jackson','Alberta','Canada','M7Y6T6','08/25/1990','','','');


insert into customeraccount(custid,accounttype,accountnumber,pinnumber,totalamount,customer_custid)
values (1,'savings','S45554445444','2344',2200,1);
insert into customeraccount(custid,accounttype,accountnumber,pinnumber,totalamount,customer_custid)
values (1,'checking','C44554455765','2344',5000,1);
insert into customeraccount(custid,accounttype,accountnumber,pinnumber,totalamount,customer_custid)
values (2,'checking','C788777676666','4533',10000,2);


insert into customertransaction(accountid,custid,transdate,transtype,transamount,balanceamount,customer_custid,customeraccount_accountid)
values (1,1,'09/05/2021','withdrawal','100','2000',1,1);
insert into customertransaction(accountid,custid,transdate,transtype,transamount,balanceamount,customer_custid,customeraccount_accountid)
values (1,1,'09/06/2021','deposit','200','2200',1,1);
insert into customertransaction(accountid,custid,transdate,transtype,transamount,balanceamount,customer_custid,customeraccount_accountid)
values (1,2,'09/07/2021','deposit','1000','10000',2,1);

insert into chequerequest(accountid,accountnumber,chequetype,chequerequeststatus,customeraccount_accountid)
values (1,'S45554445444','50 cheques','approved',1);
insert into chequerequest(accountid,accountnumber,chequetype,chequerequeststatus,customeraccount_accountid)
values (2,'C44554455765','50 cheques','approved',2);

insert into adminusers(userid,username,password)
values (1,'admin','admin1');
insert into adminusers(userid,username,password)
values (2,'userkim','password');


insert into refaccounttypes(accounttypeid,accounttype)
values (1,'savings');
insert into refaccounttypes(accounttypeid,accounttype)
values (2,'checking');

insert into refonlineaccountstatuses(onlinestatusid,onlinestatustype)
values (1,'WaitingForApproval');
insert into refonlineaccountstatuses(onlinestatusid,onlinestatustype)
values (2,'Active');
insert into refonlineaccountstatuses(onlinestatusid,onlinestatustype)
values (3,'Blocked');

insert into reftransactiontypes(transtypeid,transtype)
values (1,'Deposit');
insert into reftransactiontypes(transtypeid,transtype)
values (2,'Withdrawal');
insert into reftransactiontypes(transtypeid,transtype)
values (3,'Money Transfer');







