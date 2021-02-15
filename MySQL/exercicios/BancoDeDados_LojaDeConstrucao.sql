create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
material varchar(50) not null,
ativo boolean,
primary key(id)
);

insert into tb_categoria (material,ativo) values ("Ferro",true);
insert into tb_categoria (material,ativo) values ("Madeira",true);
insert into tb_categoria (material,ativo) values ("Plastico",true);
insert into tb_categoria (material,ativo) values ("Aluminio",true);
insert into tb_categoria (material,ativo) values ("Outros",true);

create table tb_produto(
id bigint auto_increment,
nome varchar(50) not null,
preco decimal(5,2) not null,
qnt int not null,
categoria_id bigint not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto (nome,preco,qnt,categoria_id) values ("Martelo",13.67,99,1);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Macaneta",27.99,99,4);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Calha",114.90,99,4);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Porta",237.61,99,2);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Tijolo",0.99,99,5);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Porta Sanfonada PVC",76.15,99,3);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Cano Marrom PVC",17.49,99,3);
insert into tb_produto (nome,preco,qnt,categoria_id) values ("Tinta Acrílica Coral",129.90,99,5);

select * from tb_produto where preco >50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where  nome like  "%C%" ;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.categoria_id 
	where material like "%Aluminio%";