CREATE DATABASE mybatis;

SELECT * FROM employee;

CREATE TABLE employee (
 id int auto_increment,
 empNo int,
 eName varchar(20),
 job varchar(20),
 hireadete timestamp,
 sal int,
 comm int,
 PRIMARY KEY(id)
);

INSERT INTO employee(empNO, eName, job, hireadete, sal, comm) 
VALUES 
(7350, 'smith', 'clerk', '1980-12-17 00:00:00', 800, 100),
(7351, 'any', 'clerk', '1980-12-17 00:00:00', 800, 100),
(7352, 'jack', 'clerk', '1980-12-17 00:00:00', 800, 100);


