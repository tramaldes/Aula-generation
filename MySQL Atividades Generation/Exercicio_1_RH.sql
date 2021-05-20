CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcs (
id BIGINT AUTO_INCREMENT NOT NULL,
nome VARCHAR(255),
email VARCHAR(255),
endereco VARCHAR(255),
telefone INT,
salario DECIMAL(10,2),

PRIMARY KEY(id)
);

INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Marcelo Santos",11-99999-9999,"marcelo.santos@teste.com","Rua curta numero 7", 10000);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Denilson Santos",11-99999-9999,"denilson.santos2@teste.com","Rua cumprida numero 17", 1000);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Gustavo Ribeiro",11-99999-9999,"gustavo.ribeiro@teste.com","Rua direita numero 25", 1000);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Sandra Regina",11-99999-9999,"sandra.regina@teste.com","Rua esquerda numero 6", 2000);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Claudia Cunha",11-99999-9999,"claudia.cunha@teste.com","Rua central numero 15", 5000);

SELECT nome, salario FROM tb_funcs WHERE salario > 2000; -- selecionando nome e salario dos funcionarios com salario maior que 2000

SELECT nome, salario FROM tb_funcs WHERE salario < 2000; -- selecionando nome e salario dos funcionarios com salario maior que 2000

UPDATE tb_funcs SET salario = 10000 WHERE id = 4; -- atualizando um dado da tabela

SELECT * FROM tb_funcs;