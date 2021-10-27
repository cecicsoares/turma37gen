-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ProjetoIntegrador
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ProjetoIntegrador
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ProjetoIntegrador` ;
USE `ProjetoIntegrador` ;

-- -----------------------------------------------------
-- Table `ProjetoIntegrador`.`temas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetoIntegrador`.`temas` (
  `id_temas` BIGINT NOT NULL AUTO_INCREMENT,
  `areas` VARCHAR(255) NOT NULL,
  `tipo_vagas` VARCHAR(255) NOT NULL,
  `localizacao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_temas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProjetoIntegrador`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetoIntegrador`.`usuario` (
  `id_usuario` BIGINT NOT NULL AUTO_INCREMENT,
  `nome completo` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  `tipo` ENUM('PF', 'PJ') NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProjetoIntegrador`.`postagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetoIntegrador`.`postagem` (
  `id_postagem` BIGINT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NOT NULL,
  `descricao` VARCHAR(255) NOT NULL,
  `foto` VARCHAR(255) NULL,
  `temas_id_temas` BIGINT NOT NULL,
  `usuario_id_usuario` BIGINT NOT NULL,
  INDEX `fk_temas_has_usuario_usuario1_idx` (`usuario_id_usuario` ASC) VISIBLE,
  INDEX `fk_temas_has_usuario_temas_idx` (`temas_id_temas` ASC) VISIBLE,
  PRIMARY KEY (`id_postagem`),
  CONSTRAINT `fk_temas_has_usuario_temas`
    FOREIGN KEY (`temas_id_temas`)
    REFERENCES `ProjetoIntegrador`.`temas` (`id_temas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_temas_has_usuario_usuario1`
    FOREIGN KEY (`usuario_id_usuario`)
    REFERENCES `ProjetoIntegrador`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
