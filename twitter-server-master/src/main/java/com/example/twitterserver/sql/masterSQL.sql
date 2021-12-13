-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
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
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- TWEETS
-- Creating a table in tweets table in mySQL:
CREATE TABLE tweets (
                        tweet_id int NOT NULL AUTO_INCREMENT,
                        tweet varchar(255) DEFAULT NULL,
                        tweeted_by_user_id int DEFAULT NULL,
                        topic varchar(255) DEFAULT NULL,
                        userName varchar(255) DEFAULT NULL,
                        topic varchar(255) DEFAULT NULL,
                        verified  tinyint DEFAULT NULL,
                        string varchar(255) DEFAULT NULL,
                        tweeted_on timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                        handle varchar(255) DEFAULT NULL,
                        time varchar(255) DEFAULT NULL,
                        title varchar(255) DEFAULT NULL,
                        logoImage varchar(255) DEFAULT NULL,
                        avatarImage varchar(255) DEFAULT NULL,
                        PRIMARY KEY (tweet_id),
                        CONSTRAINT FK7ojmh249vw0dvxpswmb61mbtn
                            FOREIGN KEY (tweeted_by_user_id)
                                REFERENCES users (user_id)
);


-- SAMPLE INSERT STATEMENTS GIVEN FROM THE PROFESSOR
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alice 1st Tweet', '1');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Bob 1st Tweet', '2');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alice 2nd Tweet', '1');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 1st Tweet', '3');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 2nd Tweet', '3');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 3rd Tweet', '3');


-- SAMPLE INSERT STATEMENT WE WERE PRACTICING
INSERT INTO tweets (topic, userName, verified, handle, time, title, tweet, logo_image, avatar_image,tweeted_by_user_id )
VALUES ('Web Development', 'ReactJs', 1, 'ReactJS', '2h', 'React.js is a component based front end library that makes it very easy to build Single Page Applications or SPAs',
        'Lorem Lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit', '../../../images/react-blue.png','../../../images/react-blue.png','1')


-- ABOUT FK AND PK FOR tweets TABLE IN MYSQL:
-- WHEN INSERTING INTO tweets TABLE and setting the proper fk:
--  --  tweets table has a fk, field is called 'tweeted_by_user_id" in mySQL
--  --  fk 'tweeted_by_user_id' -----pointining to----> pk 'user_id in the users table in mySQL
-- WHEN INSERTING INTO tweets TABLE and setting the proper pk:
--  --  tweets table has a pk, field is called 'tweet_id" in mySQL
--  --  pk 'tweet_id'is managed by mySQL, so you don't have to set it when inserting into mySQL

-- OUR INSERT STATEMENTS
-- When you insert a Tweet, the user_id field MUST be a user_id field currently in the mySQL
-- database.  This user_id is from the users table in mySQL and it is the primary key, which mySQL
-- will set and manage on it's own.  So keep in mind when inserting a tweet that you must include
-- a user_id that is INSIDE of your local mySQL database -- otherwise your insert statement will
-- fail.

-- INSERT INTO `db_tuiter2`.`tweets` (`tweet_id`, `avatar_image`, `handle`, `logo_image`, `time`, `title`, `topic`, `tweet`, `tweeted_on`, `username`, `verified`, `tweeted_by_user_id`)
-- VALUES(<{tweet_id: }>, <{avatar_image: }>, <{handle: }>, <{logo_image: }>, <{time: }>,<{title: }>, <{topic: }>, <{tweet: }>,<{tweeted_on: }>, <{username: }>, <{verified: }>, <{tweeted_by_user_id: }>);
-- ALUES ('Web Development', 'ReactJs', 1, 'ReactJS', '2h', 'React.js is a component based front end library that makes it very easy to build Single Page Applications or SPAs',
--         'Lorem Lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit', '../../../images/react-blue.png','../../../images/react-blue.png','1')

-- in Alvin's DB:
-- FROM THE users TABLE:
-- -- person alex has (pk) user_id 1 and username is alex8080,
-- -- person alvin has (pk) user_id 2, and username is alvin2021

-- Alex 3 Tweet1:
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alex 1st Tweet', '1');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alex 2nd Tweet', '1');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alex 3rd Tweet', '1');


-- Alvin 1 Tweet1:
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alvin 1st Tweet', '2');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alvin 2nd Tweet', '2');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alvin 3rd Tweet', '2');
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
