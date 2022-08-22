DROP TABLE if EXISTS paciente;
CREATE TABLE if NOT EXISTS paciente (
    id int auto_increment primary key,
    nome varchar(100),
    sobrenome varchar(100),
    rg varchar(10),
    dataDeCadastro varchar(12)

);

DROP TABLE if EXISTS endereco;
CREATE TABLE if NOT EXISTS endereco (
    id int auto_increment primary key,
    rua varchar(150),
    numero int,
    bairro varchar(100),
    cidade varchar(100)
);