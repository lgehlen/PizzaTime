CREATE database db_pizza;

use db_pizza;

create table tb_cliente (
id_cliente integer auto_increment primary key ,
nome_cliente varchar(50) not null,
sobrenome_cliente varchar(50) not null,
telefone_cliente varchar(20) not null,
endereco_cliente varchar(255) not null
);

create table tb_sabor(
id_sabor integer auto_increment primary key,
nome_sabor varchar(50) not null,
tipo_sabor integer
);

create table tb_pizza (
id_pizza integer auto_increment primary key,
sabor_pizza integer not null,
sabor2_pizza integer,
FOREIGN KEY (sabor_pizza) REFERENCES tb_sabor(id_sabor),
FOREIGN KEY (sabor2_pizza) REFERENCES tb_sabor(id_sabor)
);

create table tb_tipopizza( 
id_tipo integer primary key,
nome_tipo varchar(50) not null,
preco_tipo float(3,2)
);

create table tb_pedido (
id_pedido integer auto_increment primary key,
total_pedido float(5,2) not null,
status_pedido enum('ABERTO', 'CAMINHO', 'ENTREGUE'),
id_cliente integer,
FOREIGN KEY (id_cliente) REFERENCES tb_cliente(id_cliente)
);

create table tb_pedido_pizza (
id_pedido integer,
id_pizza integer,
FOREIGN KEY (id_pedido) REFERENCES tb_pedido(id_pedido ),
FOREIGN KEY (id_pizza) REFERENCES tb_pizza(id_pizza )
);

insert into tb_tipopizza (id_tipo, nome_tipo, preco_tipo)
values ('1','Simples','0.0');
insert into tb_tipopizza (id_tipo, nome_tipo, preco_tipo)
values ('2','Especial','0.0');
insert into tb_tipopizza (id_tipo, nome_tipo, preco_tipo)
values ('3','Premium','0.0');