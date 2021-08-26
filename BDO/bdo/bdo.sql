drop database if exists gym;
create database gym;
use gym;

create table clientes(
    id_cliente integer primary key auto_increment,
    nome varchar(50) not null,
    nascimento Date not null,
    sexo char(1) not null,
    peso decimal not null
);

create table fichas(
    id_cliente integer not null,
    id_exercicio integer not null,
    dia_semana varchar(15) not null,
    objetivo varchar(15) not null,
    serie varchar(20) not null
);

create table telefones(
    id_cliente integer not null,
    num_telefone varchar(14) not null
);

create table exercicios(
    id_exercicio integer not null primary key,
    descricao varchar(40) not null,
    grupo_muscular varchar(15),
    aparelho varchar(20)
);

alter table fichas
add constraint fk_fichas_clientes
foreign key(id_cliente) references clientes(id_cliente);

alter table fichas 
add constraint fk_fichas_exercicios
foreign key (id_exercicio) references exercicios(id_exercicio);

alter table telefones
add constraint fk_telefone_clientes
foreign key (id_cliente) references clientes(id_cliente);

