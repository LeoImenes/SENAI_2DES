drop database if exists gym; 

create database  gym;

use gym;



create table Clientes(

   cliente int,

   nome varchar(50) not null,

    nascimento data not null,

    sexo char not null,

    peso decimal not null

);

create table telefones(
    cliente int not null,
    telefone varchar(14) not null

);

create table fichas(
    cliente int not null,
    exercicio int not null,
    semana varchar(15) not null,
    serie  varchar(20) not null


);

create table exercicios(
    exercicio int not null,
    descricao varchar(40) not null,
    grupo_muscular varchar(15),
    aparelho varchar(15)

);


--RELACINONAMENTO ENTRE TABELAS

alter table Clientes

add constraint cliente

primary key (cliente) references Clientes(cliente)

on delete cascade

on update cascade;


alter table telefones

add constraint fk_cliente

foreign key (cliente) references telefones(cliente)

on delete cascade

on update cascade;


alter table fichas

add constraint fk_cliente

foreign key (cliente) references fichas(cliente)

on delete cascade

on update cascade;



alter table fichas

add constraint fk_exercicio

foreign key (cliente) references fichas(exercicio)

on delete cascade

on update cascade;


alter table exercicios

add constraint fk_exercicio

foreign key (cliente) references exercicios(exercicio)

on delete cascade

on update cascade;


