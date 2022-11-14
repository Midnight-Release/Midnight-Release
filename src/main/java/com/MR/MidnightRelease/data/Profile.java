package com.MR.MidnightRelease.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("profile")
public class Profile {

    @Id
    private String username;

    private String nickName;
    private Date dateCreated;
    private int followingCount;
    private int followerCount;
    private boolean artist;


    public Profile(String nickName, Date dateCreated, int followingCount, int followerCount, boolean artist) {
        this.nickName = nickName;
        this.dateCreated = dateCreated;
        this.followingCount = followingCount;
        this.followerCount = followerCount;
        this.artist = artist;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public boolean isArtist() {
        return artist;
    }

    public void setArtist(boolean artist) {
        this.artist = artist;
    }
}
