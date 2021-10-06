insert into customer(firstname,lastname,phonenumber,email,housenumber,streetname,city,state,country,postalcode,dateofbirth,username,password,onlineaccountstatus) 
values ('pavani','ambati','888-888-8888','pavani@test.com','10','test drive','Aroura','Ontario','Canada','L8Y7Y7','09/26/1986','pavani','password','active');
insert into customer(firstname,lastname,phonenumber,email,housenumber,streetname,city,state,country,postalcode,dateofbirth,username,password,onlineaccountstatus) 
values ('jackie','king','455-454-5666','jackie.king@test.com','244','honeycomb drive','Jackson','Alberta','Canada','M7Y6T6','08/25/1990','','','');


insert into customeraccount(customer_custid,accounttype,bankcardnumber,pinnumber)
values (1,'savings','S45554445444','2344');
insert into customeraccount(customer_custid,accounttype,bankcardnumber,pinnumber)
values (1,'checking','C44554455765','2344');
insert into customeraccount(customer_custid,accounttype,bankcardnumber,pinnumber)
values (2,'checking','C788777676666','4533');


insert into customertransaction(customeraccount_accountid,customer_custid,transdate,transtype,transamount,balanceamount)
values (1,1,'09/05/2021','withdrawal','100','2000');
insert into customertransaction(customeraccount_accountid,customer_custid,transdate,transtype,transamount,balanceamount)
values (1,1,'09/06/2021','deposit','200','2200');
insert into customertransaction(customeraccount_accountid,customer_custid,transdate,transtype,transamount,balanceamount)
values (1,2,'09/07/2021','deposit','1000','10000');

insert into chequerequest(customeraccount_accountid,chequetype,chequerequeststatus)
values (1,'50 cheques','approved');

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







