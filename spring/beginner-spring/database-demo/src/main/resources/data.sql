-- CREATE TABLE person (
--   id         INTEGER      NOT NULL,
--   name       VARCHAR(255) NOT NULL,
--   location   VARCHAR(255),
--   birth_date TIMESTAMP,
--   PRIMARY KEY (id)
-- );
INSERT INTO person (id, name, location, birth_date) VALUES (1001, 'John Doe', 'Loc 1', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES (1002, 'Jane Doe', 'Loc 2', sysdate());

