show databases;
use athuldb;

drop table customer;

create table customer(id varchar(5),name varchar(20),country varchar(30),address varchar(50),city varchar(30));
insert into customer values('ABC1','Athul','INDIA','KERALA','CALICUT');
insert into customer values('ABC2','ANANYA','INDIA','KERALA','KOCHI');
insert into customer values('ABC3','VIDYA','INDIA','KARNATAKA','HSR');
insert into customer values('ABC4','VIVEK','INDIA','ANDRA','THELANGANA');
insert into customer values('ABC5','KARTHIK','INDIA','TAMIL NADU','SALEM');
insert into customer values('ABC6','DILEEP','ITALY','GREECE','ROME');

select * from customer;

-- create a function 
DELIMITER $$
CREATE FUNCTION GetTotalCustomers()
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE GetTotalCustomers INT;
    SELECT COUNT(*) INTO GetTotalCustomers FROM customer;
    RETURN GetTotalCustomers;
END $$
select GetTotalCustomers();
