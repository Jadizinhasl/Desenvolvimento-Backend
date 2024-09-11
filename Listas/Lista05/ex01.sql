create database db_empresa_eventos;
use db_empresa_eventos;

create table tb_eventos(
	id int primary key,
    nome varchar(255),
    localizacao varchar(255),
    preco_ingresso decimal(6,2)
);

insert into tb_eventos values(1, 'Secullus Art', 'SP - Sao Paulo', 23.4);
insert into tb_eventos values(2, 'Secullus Art e Buffet', 'Minas Gerais', 24.4);

select * from tb_eventos;