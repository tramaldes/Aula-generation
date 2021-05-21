CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categoria(
	id BIGINT(5) AUTO_INCREMENT,
    tipo VARCHAR(255) NOT NULL,
    frutas BOOLEAN,
    PRIMARY KEY(id)
);

CREATE TABLE tb_produto(
	id BIGINT(5) AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2),
    quantidade BIGINT(5) NULL,
    categoria_id BIGINT(5)  NOT NULL,
    
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
    
);

INSERT INTO tb_categoria(tipo,graos)
VALUES
	("Verdura",false),
    ("Legumes",false),
    ("Frutas",false),
        
INSERT INTO tb_produto(nome,preco,quantidade,categoria_id)
VALUES
       ("Cebola",6.35,300,1),
    ("Beterraba",8.35,150,1),
    ("Abóbora",12.00,984,5),
    ("Laranja", 9.35,50 , 4),
    ("Banana",70.99,1001,3);
   

SELECT * FROM tb_produto WHERE preco  BETWEEN 3 AND 60;

SELECT * FROM tb_produto WHERE preco > 50;

SELECT * FROM tb_produto WHERE nome LIKE "c%";
SELECT * FROM tb_produto WHERE nome LIKE "%c%";
SELECT * FROM tb_produto WHERE nome LIKE "%c";

SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id
WHERE tb_categoria.tipo = "Frutas";

SELECT * FROM tb_categoria;    