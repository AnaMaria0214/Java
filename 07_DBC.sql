create DATABASE 01_JDBC;

use 01_JDBC;

create table coder(
id int auto_increment primary key,
name varchar(40) not null,
age int not null,
clan varchar(40) not null
);

insert into coder (name,age,clan) values("Juan Manuel Tellez",25,"Meta"),
("Carlos Alberto Villamizar",22,"Lovelace");

SELECT * FROM coder;