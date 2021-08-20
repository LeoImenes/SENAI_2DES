-- SQL (--DDL --DML --DCL)

-- DDL - desenvolvimento (create, drop, alter, show)



-- Criamos o cabeçalho do script de criação

drop database if exists gym; -- Apaga a ultima versão do BD se existir

create database gym; -- Cria a nova versão BD

show databases; -- Mostra todos os BDs criados

use gym; -- Acessa o BD criados



-- Criação das tabelas

create table clientes(

    id_cliente int auto_increment,

   nome varchar(50) not null,

    nascimento data not null,

    sexo char not null,

    peso decimal not null

    constraint pk_cliente primary key (id_cliente)

);

create table telefones(
    id_cliente int not null,
    num_telefone varchar(14) not null

    

);

create table fichas(
    id_cliente int not null,
    id_exercicio int not null,
    dia_semana varchar(15) not null,
    serie  varchar(20) not null


);

create table exercicios(
    id_exercicio int not null,
    descricao varchar(40) not null,
    grupo_muscular varchar(15)
    aparelho varchar(15)

);

--Relacionamentos
alter table telefones

add constraint fk_telefone_cliente

foreign key (id_cliente) references telefones(id_cliente)

on delete cascade

on update cascade;


alter table fichas

add constraint fk_cliente_ficha

foreign key (id_cliente) references fichas(id_cliente)

add constraint fk_cliente_ficha

foreign key (id_exercicio) references fichas(id_exercicio)

on delete cascade

on update cascade;






-- Visualizando os resultados 

show databases;

show tables;

describe motoristas;

describe esclalas;

describe linhas;

describe pontos;

describe horarios;