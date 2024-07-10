show databases;
use athuldb;
show tables;

create table phnbook(pname varchar(20),mobno varchar(12));
insert into phnbook values('athul','9605186740');
insert into phnbook values('anu','9895892998');
insert into phnbook values('achu','8921388087');
insert into phnbook values('vishnu','8547302632');
insert into phnbook values('gokul','9847193712');

select * from phnbook;

-- create another table for update & delete
create table del_phn(pname varchar(20),mobno varchar(12),modify_date date);

select * from del_phn;

-- ceate trigger for delete
DELIMITER //
CREATE TRIGGER del_phn_trigger AFTER DELETE ON phnbook FOR EACH ROW
BEGIN
	INSERT INTO del_phn(pname,mobno,modify_date)
    VALUES(OLD.pname,OLD.mobno,now());
END;
//

-- ceate trigger for update
DELIMITER //
CREATE TRIGGER phn_trig AFTER UPDATE ON phnbook FOR EACH ROW
BEGIN
	INSERT INTO del_phn(pname,mobno,modify_date)
    VALUES(NEW.pname,NEW.mobno,now());
END;
//

DELETE FROM phnbook WHERE pname="vishnu";
select * from phnbook;

UPDATE phnbook set pname="aishwarya" where pname="achu";
