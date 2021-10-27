-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_blog_Pessoal
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_blog_Pessoal
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_blog_Pessoal` ;
USE `db_blog_Pessoal` ;

-- -----------------------------------------------------
-- Table `db_blog_Pessoal`.`temas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_blog_Pessoal`.`temas` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_blog_Pessoal`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_blog_Pessoal`.`Usuario` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `usuario` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_blog_Pessoal`.`Postagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_blog_Pessoal`.`Postagens` (
  `id_postagem` BIGINT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NOT NULL,
  `texto` VARCHAR(1000) NOT NULL,
  `data` TIMESTAMP NOT NULL,
  `Usuario_id` BIGINT NOT NULL,
  `temas_id` BIGINT NOT NULL,
  PRIMARY KEY (`id_postagem`, `Usuario_id`, `temas_id`),
  INDEX `fk_temas_has_Usuario_Usuario1_idx` (`Usuario_id` ASC) VISIBLE,
  INDEX `fk_temas_has_Usuario_temas_idx` (`temas_id` ASC) VISIBLE,
  CONSTRAINT `fk_temas_has_Usuario_temas`
    FOREIGN KEY (`temas_id`)
    REFERENCES `db_blog_Pessoal`.`temas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_temas_has_Usuario_Usuario1`
    FOREIGN KEY (`Usuario_id`)
    REFERENCES `db_blog_Pessoal`.`Usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
