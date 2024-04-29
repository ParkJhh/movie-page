CREATE SCHEMA `my_movie`;

DROP TABLE IF EXISTS `member`;
DROP TABLE IF EXISTS `community`;

CREATE TABLE `my_movie`.`community` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(100) NOT NULL,
    `note` VARCHAR(1000) NULL,
    `username` VARCHAR(50) NOT NULL,
    `created_at` DATETIME NULL,
    `updated_at` DATETIME NULL,
    `view_count` INT NULL,
    PRIMARY KEY (`id`));

CREATE TABLE `my_movie`.`member` (
    `primaryId` INT NOT NULL AUTO_INCREMENT,
    `id` VARCHAR(20) NOT NULL,
    `password` VARCHAR(20) NOT NULL,
    `name` VARCHAR(15) NOT NULL,
    `eamil` VARCHAR(100) NOT NULL,
    `phone` VARCHAR(25) NULL,
    `address_no` VARCHAR(25) NOT NULL,
    `address1` VARCHAR(100) NOT NULL,
    `address2` VARCHAR(200) NOT NULL,
    `birthday` DATE NOT NULL,
    `gender` INT NOT NULL,
    PRIMARY KEY (`primaryId`));
