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
    private String who_id;
    private String avatar_icon;
    private String handle;
    private String user_name;


    public String getWho_id() {
        return who_id;
    }

    public void setWho_id(String who_id) {
        this.who_id = who_id;
    }

    public String getAvatar_icon() {
        return avatar_icon;
    }

    public void setAvatar_icon(String avatar_icon) {
        this.avatar_icon = avatar_icon;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
