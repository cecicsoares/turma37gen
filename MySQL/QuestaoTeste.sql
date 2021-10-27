CREATE DATABASE `db_loja`;

USE db_loja;

CREATE TABLE tb_usuarios (
id_usuario INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
email VARCHAR(255),
senha VARCHAR(255),
carteira FLOAT NULL
);
