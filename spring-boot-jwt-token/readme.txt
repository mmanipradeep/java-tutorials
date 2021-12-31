https://www.devglan.com/spring-security/spring-boot-jwt-auth

https://github.com/only2dhir/spring-boot-jwt/blob/master/pom.xml

https://rajat-me.medium.com/installing-mysql-community-server-on-windows-using-a-zip-file-in-5-steps-ed967703af1e

https://www.bezkoder.com/spring-boot-jwt-authentication/

https://www.bezkoder.com/spring-boot-jwt-authentication/

https://github.com/bezkoder/spring-boot-spring-security-jwt-authentication/tree/e037bf6824b6250dc2a1c09a7cd7793cc41607e3/src/main/java/com/bezkoder/springjwt




Hibernate: drop table if exists roles
Hibernate: drop table if exists user
Hibernate: drop table if exists user_roles
Hibernate: drop table if exists users
Hibernate: create table roles (id integer not null auto_increment, name varchar(20), primary key (id)) engine=InnoDB
Hibernate: create table user (id integer not null auto_increment, age integer, firstName varchar(255), lastName varchar(255), password varchar(255), salary bigint, username varchar(255), primary key (id)) engine=InnoDB
Hibernate: create table user_roles (user_id bigint not null, role_id integer not null, primary key (user_id, role_id)) engine=InnoDB
Hibernate: create table users (id bigint not null auto_increment, email varchar(255), password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
Hibernate: alter table users add constraint UKr43af9ap4edm43mmtq01oddj6 unique (username)
Hibernate: alter table users add constraint UK6dotkott2kjsp8vw4d0m25fb7 unique (email)
Hibernate: alter table user_roles add constraint FKh8ciramu9cc9q3qcqiv4ue8a6 foreign key (role_id) references roles (id)
Hibernate: alter table user_roles add constraint FKhfh9dx7w3ubf1co1vdev94g3f foreign key (user_id) references users (id)

create table roles (id integer not null auto_increment, name varchar(20), primary key (id)) engine=InnoDB;
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
commit ;
select * from roles;