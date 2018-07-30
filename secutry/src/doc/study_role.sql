CREATE TABLE study.role
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(255)
);
INSERT INTO study.role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO study.role (id, name) VALUES (2, 'ROLE_USER');