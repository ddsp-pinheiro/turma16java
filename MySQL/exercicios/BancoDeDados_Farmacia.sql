create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_classe(
id bigint not null auto_increment,
classificacao varchar(50) not null,
eficacia varchar(50) default 'Métrica não aplicada ao produto',
seguranca varchar(50) default 'Métrica não aplicada ao produto',
primary key(id)
);

insert into tb_classe (classificacao, seguranca) values ('cosmetico', 'alta');
insert into tb_classe (classificacao, eficacia, seguranca) values ("aspirina"," média", "alta");
insert into tb_classe (classificacao, eficacia, seguranca) values ("antibiotico"," alta", "alta");
insert into tb_classe (classificacao, eficacia, seguranca) values ("anti-inflamatório"," alta", "alta");
insert into tb_classe (classificacao) values ("cosmetico");

select * from tb_classe;

use db_farmacia_do_bem;

create table tb_produto(
id bigint not null auto_increment,
nome varchar(100)  not null,
preco decimal(6,2) not null,
estoque int not null,
fabricante varchar(100) not null,
generico enum ('S','N', '-') default '-',
classe_id bigint not null,
primary key(id),
foreign key (classe_id) REFERENCES tb_classe (id)
);

insert into tb_produto (nome, preco,estoque,fabricante, generico, classe_id) values ("Ampicilina",11.49,4,"Pacheco",'S',3);
insert into tb_produto (nome, preco,estoque,fabricante, classe_id) values ("Hidratante Nivea facial",22.49,4,"Nivea",1);
insert into tb_produto (nome, preco,estoque,fabricante, classe_id) values ("Make B. Eau de Parfum 30ml",179.90,4,"O.Boticario",5);
insert into tb_produto (nome, preco,estoque,fabricante, generico, classe_id) values ("AAS Infantil",3.45,4,"Pacheco",'N',2);
insert into tb_produto (nome, preco,estoque,fabricante, generico, classe_id) values ("Amoxilina",45.39,4,"Catarinence",'S',3);
insert into tb_produto (nome, preco,estoque,fabricante, generico, classe_id) values ("Zirk",11.49,4,"Drogaria São Paulo",'N',3);
insert into tb_produto (nome, preco,estoque,fabricante, generico, classe_id) values ("Aspirina Microativa",16.45,4,"Bayer",'N',2);
insert into tb_produto (nome, preco,estoque,fabricante, classe_id) values ("Shampoo de babsa Seda",12.90,4,"Seda",5);

select * from tb_produto where preco >50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where  nome like  "%B%" ;

select * from tb_produto inner join tb_classe on tb_classe.id  = tb_produto.classe_id;

select * from tb_produto inner join tb_classe on tb_classe.id  = tb_produto.classe_id 
	where classificacao like "%cosmetico%";
