CREATE TABLE users (
    user_id int NOT NULL AUTO_INCREMENT,
    username varchar(255) DEFAULT NULL,
    password varchar(255) DEFAULT NULL,
    first_name varchar(255) DEFAULT NULL,
    last_name varchar(255) DEFAULT NULL,
    email varchar(255) DEFAULT NULL,
    joined timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    verified bit(1) DEFAULT NULL,
    PRIMARY KEY (user_id)
);

INSERT INTO users VALUES (null, 'alice', 'alice123', 'Alice', 'Wonderland', 'alice@wonderland.com', CURRENT_TIMESTAMP, 1);
INSERT INTO users VALUES (null, 'bob', 'bob234', 'Bob', 'Hope', 'bob@hope.com', CURRENT_TIMESTAMP, 0);
INSERT INTO users VALUES (null, 'charlie', 'brown345', 'Charlie', 'Brown', 'charlie@peanuts.com', CURRENT_TIMESTAMP, 1);
INSERT INTO users VALUES (null, 'dan', 'dan456', 'Dan', 'Aykroyd', 'dan@007.com', CURRENT_TIMESTAMP, 0);
INSERT INTO users VALUES (null, 'edward', 'ed567', 'Edward', 'Scizorhands', 'ed@scizors.com', CURRENT_TIMESTAMP, 1);
