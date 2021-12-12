package com.example.twitterserver.users;

import com.example.twitterserver.likes.Like;
import com.example.twitterserver.tweets.Tweet;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    //go back to camelcase
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String username;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //    private String firstName;
//    private String lastName;
//    private String profilePicture;
//    private String bannerPicture;
//    private String bio;
//    private String website;
//    private String location;
//    private String dateOfBirth;
//    private String dateJoined;
//    private String followerCount;
//    private String followingCount;
//
//
    @OneToMany(mappedBy = "tweetedBy")
    @JsonIgnore
    private List<Tweet> tweets;
//
    @OneToMany(mappedBy = "likedBy")
    @JsonIgnore
    private List<Like> likes;

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    //
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getProfilePicture() {
//        return profilePicture;
//    }
//
//    public void setProfilePicture(String profilePicture) {
//        this.profilePicture = profilePicture;
//    }
//
//    public String getBannerPicture() {
//        return bannerPicture;
//    }
//
//    public void setBannerPicture(String bannerPicture) {
//        this.bannerPicture = bannerPicture;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(String website) {
//        this.website = website;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public String getDateJoined() {
//        return dateJoined;
//    }
//
//    public void setDateJoined(String dateJoined) {
//        this.dateJoined = dateJoined;
//    }
//
//    public String getFollowerCount() {
//        return followerCount;
//    }
//
//    public void setFollowerCount(String followerCount) {
//        this.followerCount = followerCount;
//    }
//
//    public String getFollowingCount() {
//        return followingCount;
//    }
//
//    public void setFollowingCount(String followingCount) {
//        this.followingCount = followingCount;
//    }
//
//    public List<Tweet> getTweets() {
//        return tweets;
//    }
//
//    public void setTweets(List<Tweet> tweets) {
//        this.tweets = tweets;
//    }
//
//    public List<Like> getLikes() {
//        return likes;
//    }
//
//    public void setLikes(List<Like> likes) {
//        this.likes = likes;
//    }
}
