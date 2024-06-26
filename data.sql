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
    `view_count` INT DEFAULT 0,
    PRIMARY KEY (`id`));

CREATE TABLE `my_movie`.`member` (
    `primaryId` INT NOT NULL AUTO_INCREMENT,
    `loginId` VARCHAR(20) NOT NULL,
    `password` VARCHAR(20) NOT NULL,
    `name` VARCHAR(15) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `phone` VARCHAR(25) NULL,
    `address_no` VARCHAR(25) NOT NULL,
    `address1` VARCHAR(100) NOT NULL,
    `address2` VARCHAR(200) NOT NULL,
    `birthday` DATE NOT NULL,
    `gender` INT NOT NULL,
    PRIMARY KEY (`primaryId`));


ALTER TABLE `my_movie`.`community`
    CHANGE COLUMN `created_at` `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ,
    CHANGE COLUMN `updated_at` `updated_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ;

ALTER TABLE `my_movie`.`member`
    ADD COLUMN `profile` LONGBLOB NULL DEFAULT NULL AFTER `gender`;
