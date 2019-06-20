package com.cooksys.orm.dto;

import java.sql.Timestamp;
import java.util.List;

import com.cooksys.orm.entity.Credential;
import com.cooksys.orm.entity.Profile;

public class UserResponseDto {
	
//	private int Id;
	private Profile profile;
	private Credential credential;
//	private Timestamp joinDate;
	private List<TweetResponseDto> tweets;	
	
//	public int getId() {
//		return Id;
//	}
//	public void setId(int id) {
//		Id = id;
//	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Credential getCredential() {
		return credential;
	}
	public void setCredential(Credential credential) {
		this.credential = credential;
	}
//	public Timestamp getJoinDate() {
//		return joinDate;
//	}
//	public void setJoinDate(Timestamp joinDate) {
//		this.joinDate = joinDate;
//	}
    public List<TweetResponseDto> getTweets() {
		return tweets;
	}
	public void setTweets(List<TweetResponseDto> tweets) {
		this.tweets = tweets;
	}
	

}
