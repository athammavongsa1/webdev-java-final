-- CREATE TABLE users (
--     user_id int NOT NULL AUTO_INCREMENT,
--     username varchar(255) DEFAULT NULL,
--     password varchar(255) DEFAULT NULL,
--     first_name varchar(255) DEFAULT NULL,
--     last_name varchar(255) DEFAULT NULL,
--     email varchar(255) DEFAULT NULL,
--     joined timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
--     verified bit(1) DEFAULT NULL,
--     PRIMARY KEY (user_id)
-- );

-- INSERT INTO users VALUES (null, 'alice', 'alice123', 'Alice', 'Wonderland', 'alice@wonderland.com', CURRENT_TIMESTAMP, 1);
-- INSERT INTO users VALUES (null, 'bob', 'bob234', 'Bob', 'Hope', 'bob@hope.com', CURRENT_TIMESTAMP, 0);
-- INSERT INTO users VALUES (null, 'charlie', 'brown345', 'Charlie', 'Brown', 'charlie@peanuts.com', CURRENT_TIMESTAMP, 1);
-- INSERT INTO users VALUES (null, 'dan', 'dan456', 'Dan', 'Aykroyd', 'dan@007.com', CURRENT_TIMESTAMP, 0);
-- INSERT INTO users VALUES (null, 'edward', 'ed567', 'Edward', 'Scizorhands', 'ed@scizors.com', CURRENT_TIMESTAMP, 1);
-- -- INSERT INTO `tuiter`.`users` (`email`, `first_name`, `last_name`, `password`, `username`, `verified`) VALUES ('alice@wonderland.com', 'Alice', 'Wonderland', 'alice123', 'alice', b'1');
-- INSERT INTO `db_tuiter`.`users` (`email`, `first_name`, `last_name`, `password`, `username`, `verified`) VALUES ('alice@wonderland.com', 'Alice', 'Wonderland', 'alice123', 'alice', b'1');
--
-- private Integer userId;
--
--     private String website;
--     private String location;
--     private String dateOfBirth;
--     private String dateJoined;
--     private String followerCount;
--     private String followingCount;



--
--
-- select * from tuiter.users;


-- INSERT INTO `tuiter_db`.`users`
-- (`user_id`,
--  `user_name`,
--  `bio`,
--  `profile_picture`,
--  `banner_picture`,
--  `website`,
--  `location`,
--  `date_of_birth`,
--  `date_joined`,
--  `follower_count`,
--  `following_count`)  values (null, 'kathainoi', 'NEU Student', '/imgs/jose.png', '/public/imgs/banner.jpg', 'google.com', 'Houston,TX', '1996-02-16', '4/2009', 312, 180);