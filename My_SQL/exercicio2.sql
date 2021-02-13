create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome_produto varchar(30) not null,
data_de_fabricacao date not null,
preco decimal(8,2) not null,
estoque int not null,
categoria varchar(20) not null,
primary key(id)
);

insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("TV LG 32 polegadas","2020-06-01",1259.99,2,"Eletronico");
insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("Galaxy s10","2021-02-01",2499.99,2,"Eletronico");
insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("Geladeira eletrolux","2021-02-15",2699.99,2,"Eletrodomestico");
insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("Aspirador de pó vertical","2019-08-15",139.99,2,"Eletrodomestico");
insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("Fone de ouvido JBL","2021-01-11",236.55,2,"Eletronico");
insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("Notebook Dell","2019-07-25",2439.99,2,"Eletronico");
insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("Case p/ Kindle","2018-08-29",84.99,2,"Acessorio");
insert into  tb_produtos (nome_produto,data_de_fabricacao,preco,estoque,categoria) values ("Case p/ Iphone7","2018-08-29",35.00,2,"Acessorio");

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set estoque =100 where id =8;
