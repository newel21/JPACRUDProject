-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema developerdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `developerdb` ;

-- -----------------------------------------------------
-- Schema developerdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `developerdb` DEFAULT CHARACTER SET utf8 ;
USE `developerdb` ;

-- -----------------------------------------------------
-- Table `developer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `developer` ;

CREATE TABLE IF NOT EXISTS `developer` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(10) NOT NULL,
  `category` VARCHAR(45) NULL,
  `learned_by` VARCHAR(45) NULL,
  `school_attended` VARCHAR(45) NULL,
  `favorite_language` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE = '';
DROP USER IF EXISTS developeruser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'developeruser'@'localhost' IDENTIFIED BY 'developer';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'developeruser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `developer`
-- -----------------------------------------------------
START TRANSACTION;
USE `developerdb`;
INSERT INTO `developer` (`id`, `first_name`, `last_name`, `gender`, `category`, `learned_by`, `school_attended`, `favorite_language`) VALUES (1, 'Mark', 'Zuckerberg', 'Male', 'Expert', 'self-taught', 'Harvard', 'Java');
INSERT INTO `developer` (`id`, `first_name`, `last_name`, `gender`, `category`, `learned_by`, `school_attended`, `favorite_language`) VALUES (2 , 'Grace', 'Hpper', 'Female', 'Expert', 'University', 'Yale', 'COBOL');
INSERT INTO `developer` (`id`, `first_name`, `last_name`, `gender`, `category`, `learned_by`, `school_attended`, `favorite_language`) VALUES (3, 'Fred', 'Fredette', 'Male', 'Mid-level', 'Coding Bootcamp', NULL, 'JavaScript');

COMMIT;

