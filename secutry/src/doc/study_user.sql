CREATE TABLE study.user
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    password varchar(255),
    username varchar(255)
);
INSERT INTO study.user (id, password, username) VALUES (1, 'admin', 'admin');
INSERT INTO study.user (id, password, username) VALUES (2, 'abel', 'abel');