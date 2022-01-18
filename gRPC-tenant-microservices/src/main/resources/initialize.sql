drop table orders if exists;
drop table tenant if exists;

CREATE TABLE tenant (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) DEFAULT NULL,
  aadhaarCard varchar(50) DEFAULT NULL,
  gender varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
);


INSERT INTO tenant
VALUES
(1,'Gunasekhar','1234','MALE'),
(2,'CarmelSecurity','5678','MALE'),
(3,'Dinesh','98089','MALE');


CREATE TABLE orders (
  order_id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) DEFAULT NULL,
  no_of_items int(11) DEFAULT NULL,
  total_amount double DEFAULT NULL,
  order_date date DEFAULT NULL,
  PRIMARY KEY (order_id),
  foreign key (user_id) references user(id)
 );


INSERT INTO orders VALUES (1,5,3,635,'2020-01-10'),(2,8,1,1045,'2020-10-13');
