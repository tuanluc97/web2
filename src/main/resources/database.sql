CREATE DATABASE webso2_database;
use webso2_database;

CREATE TABLE `webso2_database`.`customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);