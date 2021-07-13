CREATE TABLE pessoa(
	id numeric(9) NOT NULL,
	nome varchar(80) NOT NULL,
	cpf varchar(11) NOT NULL,
	email varchar(50) NOT NULL,
	dtNasc date NOT NULL,
	
	constraint pes_pk primary key (id),
	constraint pes_uk unique (cpf, email)
)