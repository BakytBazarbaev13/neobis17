create database phone_shop;

use phone_shop;

create table Phone(
    phone_id int unsigned primary key auto_increment,
    name varchar(40) not null,
    color varchar(20) not null,
    memory int not null,
    ram int not null,
    year_of_issue DATE,
    prise DOUBLE not null,
    brand_id int unsigned
);

create table Brand(
    brand_id int unsigned primary key auto_increment,
    name varchar(40) not null 
);

create table Operation(
	operation_id int unsigned primary key auto_increment,
    date_sale date,
    cash double not null,
    change_ double not null,
    phone_id int unsigned,
    customers_id int unsigned,
    client_id int unsigned
    
);

create table Customers(
	customers_id int unsigned primary key auto_increment,
    name varchar(40) not null,
    address varchar(40) not null,
    email varchar(20) not null,
    phone_number varchar(15) not null
);

create table Client(
	client_id int unsigned primary key auto_increment,
    name varchar(40) not null,
    address varchar(40) not null,
    phone_number varchar(15) not null
);
