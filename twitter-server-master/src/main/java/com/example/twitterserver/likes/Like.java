package com.example.twitterserver.likes;

import com.example.twitterserver.tweets.Tweet;
import com.example.twitterserver.users.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;
    @ManyToOne
    @JsonIgnore
    private User likedBy;
    @ManyToOne
    @JsonIgnore
    private Tweet liked;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public User getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(User likedBy) {
        this.likedBy = likedBy;
    }

    public Tweet getLiked() {
        return liked;
    }

    public void setLiked(Tweet liked) {
        this.liked = liked;
    }
}
