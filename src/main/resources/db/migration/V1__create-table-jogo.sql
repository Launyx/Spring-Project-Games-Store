CREATE TABLE Jogo(
	id bigint not null auto_increment,
	nome varchar (100) not null,
    genero varchar (100) not null,
    preco varchar (100) not null,
    desenvolvedora varchar (100) not null,
    distribuidora varchar (100) not null,
    lancamento varchar (100) not null,

primary key (id)
);