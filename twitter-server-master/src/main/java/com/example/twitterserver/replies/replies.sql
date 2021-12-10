CREATE TABLE replies (
    reply_id int NOT NULL AUTO_INCREMENT,
    replied_to_tweet_id int DEFAULT NULL,
    reply_tweet_id int DEFAULT NULL,
    PRIMARY KEY (reply_id),
    CONSTRAINT FKbis68tp21idxnqnt2s3afy5tk
        FOREIGN KEY (reply_tweet_id)
        REFERENCES tweets (tweet_id),
    CONSTRAINT FKopw0fovxbd809bbdhirq3gvqc
        FOREIGN KEY (replied_to_tweet_id)
        REFERENCES tweets (tweet_id)
);

-- create new tweets that reply to other tweets
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Bob replies to Alice 1st Tweet', '2');
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Charlie replies to Alice 1st Tweet', '3');
INSERT INTO tweets (tweet, tweeted_by_user_id) VALUES ('Dan replies to Bob 1st Tweet', '4');

-- create reply relation which tweet replies to which tweet
INSERT INTO replies (replied_to_tweet_id, reply_tweet_id) VALUES ('1', '7');
INSERT INTO replies (replied_to_tweet_id, reply_tweet_id) VALUES ('1', '8');
INSERT INTO replies (replied_to_tweet_id, reply_tweet_id) VALUES ('2', '9');
