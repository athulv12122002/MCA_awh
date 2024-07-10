show databases;
use athuldb;
create table customer(id varchar(5),name varchar(20),country varchar(30),address varchar(50),city varchar(30));
insert into customer values('ABC1','Athul','INDIA','KERALA','CALICUT');
insert into customer values('ABC2','ANANYA','INDIA','KERALA','KOCHI');
insert into customer values('ABC3','VIDYA','INDIA','KARNATAKA','HSR');
insert into customer values('ABC4','VIVEK','INDIA','ANDRA','THELANGANA');
insert into customer values('ABC5','KARTHIK','INDIA','TAMIL NADU','SALEM');
insert into customer values('ABC6','DILEEP','ITALY','GREECE','ROME');

select * from customer

-- Create Stored Procedure
DELIMITER @@
CREATE PROCEDURE GetCustomer(IN id INT, IN countryName VARCHAR(30))
BEGIN
SELECT name FROM customer WHERE country=countryName;
END;
@@
DELIMITER ;

call GetCustomer(NULL,'ITALY');

drop table customer;
drop procedure GetCustomer;
