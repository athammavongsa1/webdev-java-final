CREATE TABLE likes (
    like_id int NOT NULL AUTO_INCREMENT,
    liked_tweet_id int DEFAULT NULL,
    liked_by_user_id int DEFAULT NULL,
    PRIMARY KEY (like_id),
    CONSTRAINT FKjngtpw5j9cq1khmmhbvtjepfv
        FOREIGN KEY (liked_tweet_id)
        REFERENCES tweets (tweet_id),
    CONSTRAINT FKt3ebk1y9gaq3xsrj4sdecyr36
        FOREIGN KEY (liked_by_user_id)
        REFERENCES users (user_id)
);

INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('1', '1');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('1', '2');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('1', '3');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('1', '4');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('2', '2');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('2', '3');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('3', '3');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('3', '4');
INSERT INTO likes (liked_tweet_id, liked_by_user_id) VALUES ('3', '5');
