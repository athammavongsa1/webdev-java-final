-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- INSERT USERS
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
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --



-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- WHO TO FOLLOW
# SELECT * FROM tuitter.who_to_follow;
# -- drop table who_to_follow;
# --  CREATE TABLE who_to_follow (
# --      who_id int NOT NULL AUTO_INCREMENT,
# --      user_name varchar(255) DEFAULT NULL,
# --      avatar_icon varchar(255) DEFAULT NULL,
# --      handle varchar(255) DEFAULT NULL,
# --      PRIMARY KEY (who_id)
# --  );
# INSERT INTO `tuitter`.`who_to_follow`
# (`who_id`, `user_name`, `handle`,`avatar_icon`  )  values (null, 'Java', 'java', '/imgs/java.png');
#
#
# INSERT INTO `tuitter`.`who_to_follow`
# (`who_id`, `user_name`, `handle`,`avatar_icon`  )  values (null, 'Relaivity Space', 'Relativity Space', '/imgs/relativity-space.jpg');
#
# INSERT INTO `tuitter`.`who_to_follow`
# (`who_id`, `user_name`, `handle`,`avatar_icon`  )  values (null, 'Virgin Galactic', 'Virgin', '/imgs/virgin.png');
#
# INSERT INTO `tuitter`.`who_to_follow`
# (`who_id`, `user_name`, `handle`,`avatar_icon`  )  values (null, 'NASA', 'NASA', '/imgs/nasa.png');
#
# INSERT INTO `tuitter`.`who_to_follow`
# (`who_id`, `user_name`, `handle`,`avatar_icon`  )  values (null, 'Tesla', 'TSLA', '/imgs/tesla.png');
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --