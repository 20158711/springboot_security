CREATE TABLE study.user_roles
(
    user_id int(11) NOT NULL,
    roles_id int(11) NOT NULL
);
CREATE UNIQUE INDEX UK_amwlmdeik2qdnksxgd566knop ON study.user_roles (roles_id);
CREATE INDEX FK55itppkw3i07do3h7qoclqd4k ON study.user_roles (user_id);
INSERT INTO study.user_roles (user_id, roles_id) VALUES (1, 1);
INSERT INTO study.user_roles (user_id, roles_id) VALUES (2, 2);