CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id BIGINT(5) AUTO_INCREMENT,
    tipo VARCHAR(255) NOT NULL,
    vegana boolean,
    PRIMARY KEY(id)
);

CREATE TABLE tb_pizza(
	id BIGINT(5) AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2),
    sabor VARCHAR(255) NOT NULL,
    categoria_id BIGINT(5) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo, vegana)
VALUES 
	("Pizza doce", TRUE),
    ("Pizza doce", FALSE),
    ("Pizza salgada", TRUE),
    ("Pizza salgada", FALSE),
	("Esfiha", FALSE);
    
INSERT INTO tb_pizza(nome,preco,sabor,categoria_id)
VALUES 
	("Portuguesa",38.50,"Presunto, queijo, tomate, ovo",5),
    ("Frango 2", 19.50,"Frango, catupiry, cebola",4),
	("Calabresa", 25.50,"Calabresa fatiada, cebola",4),
    ("Portuguesa 2", 45.00,"Presunto, queijo, ovo e milho",4),
    ("Doce 1", 55.30,"Banana, chocolate",1),
    ("Doce 2",60.00,"Morango e chocolate",2);
 
 -- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
 SELECT * FROM tb_pizza
 WHERE preco > 45;
 
 -- Faça um select trazendo os Produtos com valor entre 29 e 60 reais.
 SELECT * FROM tb_pizza WHERE preco BETWEEN 29 AND 60;
 
 -- Faça um select utilizando LIKE buscando os Produtos com a letra C.

SELECT * FROM tb_pizza WHERE nome LIKE "%c%";
SELECT * FROM tb_pizza WHERE nome LIKE "%c";
SELECT * FROM tb_pizza WHERE nome LIKE "c%";

SELECT * FROM tb_pizza 
INNER JOIN tb_categoria 
ON tb_categoria.id = tb_pizza.categoria_id;

SELECT * FROM tb_pizza 
INNER JOIN tb_categoria 
ON tb_categoria.id = tb_pizza.categoria_id
WHERE tb_categoria.tipo LIKE "%Pizza doce%";
    
    
    
