-- Creating Database
create database Employee_Details;

-- Select the Database
use Employee_Details;

-- Creating table Emp
create table Emp (empcode int, empname varchar(20), empage int, esalary int, primary key(empcode));

select * from Emp;