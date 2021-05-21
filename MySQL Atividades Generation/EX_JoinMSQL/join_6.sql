CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
nome_categoria VARCHAR (255) NOT NULL,

PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_curso(
id_curso BIGINT AUTO_INCREMENT,
nome_curso VARCHAR (255) NOT NULL,
preco decimal(5,2),
id_categoria BIGINT,

FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria),
PRIMARY KEY (id_curso)
);
SELECT nome_curso, preco FROM tb_curso
WHERE preco > 50; -- select que retorna os Produtos com o valor com o valor maior do que 50 reais

SELECT nome_curso, preco FROM tb_curso
WHERE preco BETWEEN 3 AND 60;-- select que retorna os Produtos com valor entre 3 e 60 reais

SELECT nome_curso, preco FROM tb_curso WHERE nome_curso LIKE "%J%";-- buscando os Produtos com a letra J
SELECT * FROM tb_curso INNER JOIN tb_categoria ON tb_curso.id_categoria = tb_categoria.id_categoria; -- select com Inner join entre tabela categoria e curso
SELECT * FROM tb_curso INNER JOIN tb_categoria ON tb_curso.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.nome_categoria = "JavaScript";