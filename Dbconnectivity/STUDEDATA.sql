create database db;
use db;
create table student(id int NOT NULL PRIMARY KEY ,name varchar(100),dept varchar(200),course varchar(500));
insert into student values(100,"John","CSE","Data Science");
insert into student values(101,"Emma","CSE","Artificial Intelligence");
insert into student values(102,"Anu","IT","Cryptography");
insert into student values(103,"Pallavi","IT","Data Science");
select id,name,dept,course from student;
