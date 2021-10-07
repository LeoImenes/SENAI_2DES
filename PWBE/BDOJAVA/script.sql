Drop database if exists loja;
create database loja;

use loja;


create table clientes (

    id  integer not null auto_increment primary key,

    nome varchar(153) not null,

    endereco varchar(200) not null

);


insert into clientes (nome, endereco) values ("Roberval dos Santos", "Rua dos Pé Junto, 123");

insert into clientes (nome, endereco) values ("Fulano da Silva", "Rua das Curva, 321");