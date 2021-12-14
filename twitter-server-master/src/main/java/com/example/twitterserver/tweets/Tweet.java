package com.example.twitterserver.tweets;

import com.example.twitterserver.likes.Like;
import com.example.twitterserver.replies.Reply;
import com.example.twitterserver.users.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

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
    private String handle;
    private String username;
    private String title;
    private String topic;
    private Boolean verified;
    private String time;
    private String logoImage;
    private String avatarImage;

    @ManyToOne
    private User tweetedBy;

    @OneToMany(mappedBy = "liked")
    @JsonIgnore
    private List<Like> likes;


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

    @Transient
    public Integer getRepliesCount(){
        return replies.size();
    }

    @Transient
    public Integer getLikesCount() {
        return likes.size();
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


    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    public String getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(String avatarImage) {
        this.avatarImage = avatarImage;
    }
}
