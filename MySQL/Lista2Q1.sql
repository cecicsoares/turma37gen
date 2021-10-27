CREATE DATABASE db_generation_game_online ;

USE db_generation_game_online;
CREATE TABLE tb_classe (
	id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    codigo VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_personagem (
	id_personagem INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    poder_defesa INT, 
    poder_ataque INT, 
    agilidade INT,
    fk_id INT,
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (fk_id) REFERENCES tb_classe(id)
);
INSERT INTO tb_classe (nome, codigo) VALUES
("Arqueiro", "Xsd-1"),
("Cavaleiro", "Xsd-2"),
("Mago", "Xsd-3"),
("Assassino", "Xsd-4"),
("Curandeiro", "Xsd-5") ;
SELECT * FROM tb_classe ;

INSERT INTO tb_personagem (nome, poder_defesa, poder_ataque, agilidade, fk_id) VALUES
("Alysinho", 5000, 10000, 10, 2),
("Fada", 89, 25, 99, 2),
("Super DEV", 300, 600, 69, 3),
("Demogorgo",10.000, 800,70, 5),
("Gnomo Voador", 4000, 5500, 100, 5),
("Amancio",1010, 3500, 2000, 1);
SELECT * FROM tb_personagem WHERE poder_ataque > 2000 ;

SELECT * FROM tb_personagem WHERE poder_defesa > 1000 AND poder_defesa < 2000 ;

INSERT INTO tb_personagem (nome, poder_defesa, poder_ataque, agilidade, fk_id) VALUES
("Cavaleiro Fantasma", 1000, 1000, 10000, 4);
SELECT * FROM tb_personagem WHERE nome LIKE 'c%' ;

SELECT * FROM tb_classe
INNER JOIN tb_personagem
ON tb_personagem.fk_id = tb_classe.id ;

SELECT * FROM tb_classe
INNER JOIN tb_personagem
ON tb_personagem.fk_id = tb_classe.id
WHERE id = 2 ;