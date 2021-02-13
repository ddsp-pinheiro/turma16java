create database db_escola;

use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(30) not null,
nota decimal(2,1) not null,
data_de_nascimento date not null,
sexo enum('M','F','O') not null,
turma varchar(2) not null,
primary key(id)
);

insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Dani",8.8,"2002-04-08",'F',"b2");
insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Daniele",9.8,"2002-04-08",'F',"a1");
insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Daniel",8.9,"2002-04-08",'M',"c3");
insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Dan",9.9,"2002-04-08",'O',"d4");
insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Daniela",7.7,"2002-04-08",'F',"e5");
insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Danielly",7.8,"2002-04-08",'F',"f6");
insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Danele",8.7,"2002-04-08",'O',"g7");
insert into tb_alunos (nome,nota,data_de_nascimento,sexo,turma) values ("Danilo",7.9,"2002-04-08",'M',"h8");

select * from  tb_alunos where nota <7;

select * from  tb_alunos where nota >7;

update tb_alunos set nota=5.0 where id=6; 
