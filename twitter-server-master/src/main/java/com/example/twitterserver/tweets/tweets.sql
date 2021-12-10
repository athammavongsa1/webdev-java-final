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



INSERT INTO tweets (topic, userName, verified, handle, time, title, tweet, logo_image, avatar_image,tweeted_by_user_id )
VALUES ('Web Development', 'ReactJs', 1, 'ReactJS', '2h', 'React.js is a component based front end library that makes it very easy to build Single Page Applications or SPAs',
        'Lorem Lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit', '../../../images/react-blue.png','../../../images/react-blue.png','1')


-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alice 1st Tweet', '1');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Bob 1st Tweet', '2');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alice 2nd Tweet', '1');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 1st Tweet', '3');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 2nd Tweet', '3');
-- INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 3rd Tweet', '3');
