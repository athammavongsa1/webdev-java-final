CREATE TABLE tweets (
    tweet_id int NOT NULL AUTO_INCREMENT,
    tweet varchar(255) DEFAULT NULL,
    tweeted_by_user_id int DEFAULT NULL,
    tweeted_on timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (tweet_id),
    CONSTRAINT FK7ojmh249vw0dvxpswmb61mbtn
        FOREIGN KEY (tweeted_by_user_id)
        REFERENCES users (user_id)
);

INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alice 1st Tweet', '1');
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Bob 1st Tweet', '2');
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Alice 2nd Tweet', '1');
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 1st Tweet', '3');
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 2nd Tweet', '3');
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie 3rd Tweet', '3');
