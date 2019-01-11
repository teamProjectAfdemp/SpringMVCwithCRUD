

DROP DATABASE IF EXISTS `chatapp`;
CREATE DATABASE IF NOT EXISTS `chatapp`;

USE `chatapp`;

CREATE TABLE IF NOT EXISTS `roles` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `role` VARCHAR(30) NOT NULL UNIQUE,
	`can_create_user` TINYINT(4) NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
);


CREATE TABLE IF NOT EXISTS `users` (
    `id` INT NOT NULL AUTO_INCREMENT,
	`role_id` INT NOT NULL,
    `username` VARCHAR(10) NOT NULL UNIQUE,
    `pass` VARCHAR(10) NOT NULL,
	`fname` VARCHAR(30) NOT NULL,
	`lname` VARCHAR(30) NOT NULL,
    `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`active` TINYINT(4) NOT NULL DEFAULT 1,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`role_id`) REFERENCES `roles`(`id`)
);


INSERT INTO `roles` (`role`,`can_create_user`)
VALUES 	('admin'  ,1),
		('manager',1),
		('editor' ,0),
		('viewer' ,0);

INSERT INTO `users` (`role_id`,`username`,`pass`,`fname`,`lname`)
    VALUES 
    (1,'admin','admin','admin','admin'),
	(3,'takis','123','Takis','trigkis'),
	(3,'mitsos','xxx','Mitsos','Xristou'),
	(3,'christi','aaa','Xristina','Papadopoulou'),
	(2,'tasia','999','Tasoula','Pavlou'),
	(4,'loulis','123','Leopardalos','Kamilopardalos'),
	(2,'maria','xxx','Maria','Kirou');


