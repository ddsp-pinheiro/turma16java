create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(30) not null,
qualidade enum ('P','S','-') default '-',
-- P= Carne de primeira / S= Canner de segunda / '-'= Não se apica ao produto --
ativo boolean not null,
primary key(id)
);

insert into tb_categoria (descricao,qualidade, ativo ) values ("Bolvina",'P',true);
insert into tb_categoria (descricao,qualidade, ativo ) values ("Ave",'S',true);
insert into tb_categoria (descricao,qualidade, ativo ) values ("Suina",'S',false);
insert into tb_categoria (descricao, ativo ) values ("Utensilio de churrasco",true);
insert into tb_categoria (descricao, ativo ) values ("Descartavel",true);

create table tb_produto(
id bigint auto_increment,
nome varchar(50) not null,
preco decimal(6,2) not null,
qnt int not null,
validade date default '0000-00-00',
fornecedor varchar(30) default'Não se apica ao produto',
categoria_id bigint not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto (nome,preco,qnt,validade,fornecedor,categoria_id) values ("Picanha", 69.99,99,"2021-02-27","MATURATTA",1);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Churrasqueira Bafo Portátil", 85.99,99,4);
insert into tb_produto (nome,preco,qnt,validade,fornecedor,categoria_id) values ("Costela Suína com Molho Barbecue", 44.93,99,"2021-02-25","Seára",3);
insert into tb_produto (nome,preco,qnt,validade,fornecedor,categoria_id) values ("Asa de Frango Congelado Com Osso", 19.70,99,"2021-03-18","Sadia",2);
insert into tb_produto (nome,preco,qnt,fornecedor,categoria_id) values ("Copo Descartável 300ml",13.30,99,"COPOBRAS",5);
insert into tb_produto (nome,preco,qnt,validade,fornecedor,categoria_id) values ("Pedaço De Acém Bovino Resfriado",42.50,99,"2021-02-27","Carrefur",1);
insert into tb_produto (nome,preco,qnt,validade,fornecedor,categoria_id) values ("Linguiça Resfriada", 15.59,99,"2021-02-25","Perdigão",3);
insert into tb_produto (nome,preco,qnt,fornecedor,categoria_id) values ("Prato Raso Plástico Descartável",12,90,"SuperPlástico",5);

select * from tb_produto where preco >50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where  nome like  "%C%" ;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.categoria_id 
	where descricao like "%Bolvina%";
