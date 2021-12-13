package com.example.twitterserver.whoToFollow;

import com.example.twitterserver.likes.Like;
import com.example.twitterserver.tweets.Tweet;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "whoToFollow")
public class WhoToFollow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String avatarIcon;
    private String handle;
    private String username;
    private String whoId;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getAvatarIcon() {
        return avatarIcon;
    }

    public void setAvatarIcon(String avatarIcon) {
        this.avatarIcon = avatarIcon;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWhoId() {
        return whoId;
    }

    public void setWhoId(String whoId) {
        this.whoId = whoId;
    }
}
