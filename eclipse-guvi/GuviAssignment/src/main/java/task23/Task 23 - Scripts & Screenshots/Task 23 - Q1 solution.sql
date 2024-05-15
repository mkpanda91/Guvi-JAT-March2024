-- Creating Database Employee
create database EMPLOYEE;

-- Using Database Employee
use EMPLOYEE;

-- Creating table Empl
create table Empl (empno int, ename varchar(20), job varchar(15), mgr int, hiredate date, sal DECIMAL(7,2), comm DECIMAL(7,2), deptno int, primary key(empno));

insert into Empl (empno,ename,job,mgr,hiredate,sal,comm,deptno)
values (8369, 'SMITH', 'CLERK', 8902, '1990-12-18',800.00,null,20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20',1600.00,300.00,30),
(8521, 'SETH', 'SALESMAN', 8698, '1991-02-22',1250.00,500.00,30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02',2985.00,null,20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28',1250.00,1400.00,30),
(8698, 'BINA', 'MANAGER', 8839, '1991-05-01',2850.00,null,30),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09',2450.00,null,10),
(8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09',3000.00,null,20),
(8839, 'AMIR', 'PRESIDENT', null, '1991-11-18',5000.00,null,10),
(8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08',1500.00,0.00,30);

-- Below query retrieves all the complete table as per insertion order
select * from Empl where empno in (8369,8499,8521,8566,8654,8698,8882,8888,8839,8844)
order by field(empno,8369,8499,8521,8566,8654,8698,8882,8888,8839,8844);

-- Solution for 1.A 
select ename,sal from Empl where sal>=2000;
-- Solution for 1.B 
select * from Empl where comm is null or comm = 0;
-- Solution for 1.C
select ename,sal from Empl where sal not between 2500 and 4000;
-- Solution for 1.D
select ename,job,sal from Empl where mgr is null;
-- Solution for 1.E
select ename from Empl where ename like '__A%';
-- Solution for 1.F
select ename from Empl where ename like '%T';