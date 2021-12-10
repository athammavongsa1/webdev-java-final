package com.example.twitterserver.tweets;

import com.example.twitterserver.likes.Like;
import com.example.twitterserver.replies.Reply;
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

    @OneToMany(mappedBy = "liked")
    @JsonIgnore
    private List<Like> likes;

    @Transient
    public Integer getLikesCount() {
        return likes.size();
    }

    @OneToMany(mappedBy = "repliedTo")
    @JsonIgnore
    private List<Reply> replies;
    @OneToMany(mappedBy = "reply")
    @JsonIgnore
    private List<Reply> repliedTo;

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public List<Reply> getRepliedTo() {
        return repliedTo;
    }

    public void setRepliedTo(List<Reply> repliedTo) {
        this.repliedTo = repliedTo;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

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
