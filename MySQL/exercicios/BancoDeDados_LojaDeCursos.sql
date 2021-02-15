create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
modalidade varchar(20) not null,
ativo boolean not null,
primary key(id)
);

insert into tb_categoria (modalidade,ativo) values ("Presencial",true);
insert into  tb_categoria (modalidade,ativo) values ("EAD",true);
insert into tb_categoria (modalidade,ativo) values ("Semi-Presencial",true);

create table tb_produto(
id bigint auto_increment,
nome varchar(50) not null,
preco decimal (7,2) not null,
vagas int not null,
turno varchar(10) not null,
publico varchar(20) default 'Todos os publicos',
categoria_id bigint not null,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto (nome,preco,vagas,turno,publico,categoria_id) values ("Curso Java-Básico",350.50,40,"Maturno", "+14 anos",2);
insert into tb_produto (nome,preco,vagas,turno,publico,categoria_id) values ("Curso Java-Intermediario",450.50,40,"Noturno", "+16 anos",2);
insert into tb_produto (nome,preco,vagas,turno,publico,categoria_id) values ("Curso Java-Avançado",550.50,40,"Integral", "+18 anos",2);
insert into tb_produto (nome,preco,vagas,turno,publico,categoria_id) values ("Curso C#-Básico",350.50,40,"Maturno", "+14 anos",1);
insert into tb_produto (nome,preco,vagas,turno,publico,categoria_id) values ("Curso C#-Intermediario",450.50,40,"Noturno", "+16 anos",1);
insert into tb_produto (nome,preco,vagas,turno,publico,categoria_id) values ("Curso C#-Intermediario",550.50,40,"Integral", "+18 anos",1);
insert into tb_produto (nome,preco,vagas,turno,publico,categoria_id) values ("Curso Data-science",750.50,40,"Integral", "+16 anos",3);
insert into tb_produto (nome,preco,vagas,turno,categoria_id) values ("LOgica de programação",49.9,40,"Integral",2);

select * from tb_produto where preco >50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where  nome like  "%J%" ;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.categoria_id 
	where material like "%EAD%";