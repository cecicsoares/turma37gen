CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
	id_categoria  INT auto_increment,
    tamanho ENUM ('Pequena', 'Média', 'Grande'),
    tipo_massa ENUM('Tradicional', 'Fina'),
    PRIMARY KEY (id_categoria)
    );
    
CREATE TABLE tb_pizza (
	id_pizza INT AUTO_INCREMENT,
    sabor VARCHAR(255) NOT NULL,
    borda ENUM('Catupiry', 'Cheddar', 'Sem borda'),
    recheio BOOLEAN NOT NULL,
    valor DOUBLE NOT NULL,
    combo BOOLEAN NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria(id_categoria)
    );
    
    INSERT INTO tb_categoria (tamanho, tipo_massa) VALUES
    ("Pequena", "Fina"),
    ("Média", "Tradicional"),
    ("Grande", "Fina");
    
    SELECT * FROM tb_categoria;
    
    INSERT INTO tb_pizza (sabor, borda, recheio, valor, fk_id_categoria) VALUES
    ("Calabresa", "Catupiry", 1, 10.50, 1),
	("Nordestina","Cheddar", 0, 12.50, 2),
	("Frango e Bacon","Cheddar", 1, 12.50, 3),
	("Peperoni","Catupiry", 0, 12.50, 3),
	("Cuz cuz", "Cheddar", 1, 12.50, 2),
	("Cartola", "Catupiry", 0, 20.50, 1);
    
    SELECT * FROM tb_pizza ;

	SELECT * FROM tb_pizza WHERE valor > 45.00 ;

	SELECT * FROM tb_pizza WHERE valor > 29.00 AND valor < 60.00 ;

	SELECT * FROM tb_pizza WHERE sabor LIKE 'c%' ;
    
    SELECT * FROM tb_categoria
	INNER JOIN tb_pizza
	ON tb_pizza.fk_id_categoria = tb_categoria.id_categoria
	WHERE id_categoria = 2

    
    

    