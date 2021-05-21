CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
id_classe BIGINT AUTO_INCREMENT,
nome_classe VARCHAR (255) NOT NULL,
funcao VARCHAR (255) NOT NULL,
armas VARCHAR (255),

PRIMARY KEY (id_classe)
);

-- criação da tb_personagem
CREATE TABLE tb_personagem(
id_personagem BIGINT AUTO_INCREMENT,
nome_personagem VARCHAR (255) NOT NULL,
forca_defesa INT,
forca_ataque INT,
agilidade INT,
magia INT,
id_classe BIGINT,

FOREIGN KEY (id_classe) REFERENCES tb_classe (id_classe),
PRIMARY KEY (id_personagem)
);

INSERT INTO tb_classe (nome_classe, funcao, armas)
VALUES 
("Guerreiro","Espada e Escudo"),
("Sacerdote", "Curador", "Cajado"),
("Aqueiro", "Arco"),
("Caçador", "Machado"),
("Mago","Magia");

-- inserindo 8 valores na tb_personagem
INSERT INTO tb_personagem (nome_personagem, ataque, defesa, agilidade, magia, id_classe)
VALUES
("Luiz", 500, 2500, 3000, 50, 4),
("Marcos", 2300, 520, 3200, 70, 3),
("Thiago", 500, 3000, 50, 30, 1),
("Marcelo", 50, 1300, 40, 2100, 2),
("Diego", 1300, 300, 500, 2900, 5),
("Weslley", 2600, 480, 2800, 50, 4),
("Marta", 140, 1400, 30, 30, 1),
("Cristiane", 500, 800, 50, 1800, 2);

SELECT * FROM tb_personagem 
WHERE ataque > 2000; 

SELECT * FROM tb_personagem 
WHERE defesa > 1000 AND defesa < 2000; 

SELECT * FROM tb_personagem 
WHERE nome_personagem LIKE "%c%"; 

SELECT * FROM tb_personagem INNER JOIN tb_classe on tb_personagem.id_classe = tb_classe.id_classe; 

SELECT * FROM tb_personagem 
INNER JOIN tb_classe on tb_personagem.id_classe = tb_classe.id_classe AND tb_classe.nome_classe = "Sacerdote"; 