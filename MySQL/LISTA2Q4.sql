CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;
CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    Fruta VARCHAR(255) NOT NULL,
    tipo_produto ENUM ('Nacional', 'Importada'),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
    id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    lote VARCHAR(255) NOT NULL,
    valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );

    INSERT INTO tb_categoria (Fruta, tipo_produto) VALUES 
    ("Carnosas", "Nacional"),
    ("Carnosas", "Importada"),
    ("Secas", "Nacional"),
    ("Secas", "Importada");
    INSERT INTO tb_produto (nome, quantidade, lote, valor, fk_id_categoria) VALUES
    ("Banana", 10,"B1", 3.00, 1),
    ("Maça", 10, "M1", 10.00, 1),
    ("Manga", 10, "M2", 2.00, 1),
    ("Uva", 10, "U1", 12.00, 1),
    ("Abacaxi", 10, "A1", 3.00, 1),
    ("Pera", 10, "P1", 10.00, 1),
    ("Kiwi", 10, "K1", 22.00, 1),
    ("Girassol", 10, "G1", 10.00, 2);

    SELECT * FROM tb_produto ;

    SELECT * FROM tb_produto WHERE valor > 50.00;

    SELECT * FROM tb_produto WHERE valor > 3.00 AND valor < 60.00 ;

    INSERT INTO tb_produto (nome, quantidade, lote, valor, fk_id_categoria) VALUES
    ("Carambola", 10,"C1", 3.00, 1);

    SELECT * FROM tb_produto WHERE nome LIKE 'c%';

    SELECT * FROM tb_categoria
    INNER JOIN tb_produto
    ON tb_produto.id_produto = tb_categoria.id_categoria;

    SELECT * FROM tb_categoria
    INNER JOIN tb_produto
    ON tb_produto.id_produto = tb_categoria.id_categoria
    WHERE id_categoria = 2;