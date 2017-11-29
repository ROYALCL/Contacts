use contacts;
# 关闭外键约束
SET FOREIGN_KEY_CHECKS = 0;
drop table if exists contactsinfo;
create table contactsinfo(
  id  int(10)  not null primary key auto_increment,
  contact_name  varchar(20) not null,
  sex  varchar(2),
  group_id int(10) not null,
  office_telephone varchar(20) ,
  home_telephone varchar(20),
  mobile varchar(20),
  submobile varchar(20),
  qq varchar(12),
  email varchar(30) not null,
  positions varchar(40),
  address varchar(100),
  descs varchar(200),
  create_id int(10),
  create_date datetime,
  update_id int(10),
  update_date datetime,
  KEY fk_create_id (create_id),
  key fk_update_id (update_id),
  CONSTRAINT contactsinfo FOREIGN KEY (group_id) REFERENCES groupsinfo (id),
  CONSTRAINT fk_create_id FOREIGN KEY (create_id) REFERENCES fk_adminsinfo (id),
  CONSTRAINT fk_update_id FOREIGN KEY (update_id) REFERENCES fk_adminsinfo (id)
  )
  engine=InnoDB default charset=utf8;
  insert into contactsinfo(contact_name,sex,group_id,office_telephone,home_telephone,mobile,submobile,qq,email,positions,address,descs,create_id,create_date,update_id,update_date)
  values ("root","m",0,"12100009999","13100009999","11100009999","14100009999","1234567890","123@123.com","产品部","南京市建邺区xxxxxxxx号","root",0,now(),0,now());
  insert into contactsinfo(contact_name,sex,group_id,office_telephone,home_telephone,mobile,submobile,qq,email,positions,address,descs,create_id,create_date,update_id,update_date)
  values ("orchid","f",0,"12100009999","13100009999","11100009999","14100009999","1234567890","123@123.com","产品部","南京市建邺区xxxxxxxx号","orchid",0,now(),0,now());
  
drop table if exists adminsinfo;
create table adminsinfo(
  id  int(10)  not null primary key auto_increment,
  contactsinfo_id  int(10) not null,
  login_name varchar(20) not null,
  passwd varchar(20) not null,
  email varchar(30) not null,
  copyright int(10) not null,
  descs varchar(200),
  #KEY fk_email (email),
  KEY fk_copyright (copyright),
  CONSTRAINT adminsinfo FOREIGN KEY (contactsinfo_id) REFERENCES contactsinfo (id),
  #CONSTRAINT email FOREIGN KEY (email) REFERENCES contactsinfo (email),
  CONSTRAINT fk_copyright FOREIGN KEY (copyright) REFERENCES groupsinfo (id)
  )
  engine=InnoDB default charset=utf8;
  insert into adminsinfo(contactsinfo_id,login_name,passwd,email,copyright,descs) values (0,"root","000000","123@123.com",0,"root");
  insert into adminsinfo(contactsinfo_id,login_name,passwd,email,copyright,descs) values (1,"root","000000","123@123.com",0,"root");
  
  drop table if exists groupsinfo;
  create table groupsinfo(
  id  int(10)  not null primary key auto_increment,
  parent_id  int(10) not null,
  group_name varchar(20) not null,
  boss_id int(10) not null,
  descs varchar(200),
  create_id int(10),
  create_date datetime,
  KEY fk_boss_id (boss_id),
  KEY fk_create_id (create_id),
  CONSTRAINT fk_boss_id1 FOREIGN KEY (boss_id) REFERENCES contactsinfo (id),
  CONSTRAINT fk_create_id1 FOREIGN KEY (create_id) REFERENCES adminsinfo (id)
  )
  engine=InnoDB default charset=utf8;
  insert into groupsinfo(parent_id,group_name,boss_id,descs,create_id,create_date) values (0,"总裁办",0,"总裁办公室",0,now());
  insert into groupsinfo(parent_id,group_name,boss_id,descs,create_id,create_date) values (0,"总裁助理办公室",0,"总裁助理办公室",0,now());
  SET FOREIGN_KEY_CHECKS = 1;