create database db_funcionarios_rh;

use db_funcionarios_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(30) not null,
cargo varchar(30) not null,
salario decimal(7,2)not null,
data_contrataçao date not null,
ativo boolean not null,
primary key(id)
);

insert into tb_funcionarios (nome,cargo,salario,data_contrataçao,ativo) values ("Daniele","CEO",15000.00,"2009-02-18", true);
insert into tb_funcionarios (nome,cargo,salario,data_contrataçao,ativo) values ("Dani","Dev pleno",7545.90,"2017-01-28", true);
insert into tb_funcionarios (nome,cargo,salario,data_contrataçao,ativo) values ("Dan","Gestor de finças",4545.90,"2019-06-05", true);
insert into tb_funcionarios (nome,cargo,salario,data_contrataçao,ativo) values ("Danele","Auxiliar de rh",2350,"2020-11-19", true);
insert into tb_funcionarios (nome,cargo,salario,data_contrataçao,ativo) values ("Daniel","Auxiliar de limpeza",1999.99,"2021-08-23", true);

select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 7745.90 where id = 2;
