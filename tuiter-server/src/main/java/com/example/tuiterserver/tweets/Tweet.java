package com.example.tuiterserver.tweets;

import com.example.tuiterserver.users.User;
import com.example.twitterserver.users.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tweetId;
    private String tweet;
    private Timestamp tweetedOn;
    @ManyToOne
    private User tweetedBy;


    public Integer getTweetId() {
        return tweetId;
    }

    public void setTweetId(Integer tweetId) {
        this.tweetId = tweetId;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public Timestamp getTweetedOn() {
        return tweetedOn;
    }

    public void setTweetedOn(Timestamp tweetedOn) {
        this.tweetedOn = tweetedOn;
    }

    public User getTweetedBy() {
        return tweetedBy;
    }

    public void setTweetedBy(User tweetedBy) {
        this.tweetedBy = tweetedBy;
    }
}
