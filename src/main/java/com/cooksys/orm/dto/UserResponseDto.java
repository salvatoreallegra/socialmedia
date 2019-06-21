package com.cooksys.orm.dto;

import java.sql.Timestamp;
import java.util.List;

import com.cooksys.orm.entity.Credential;
import com.cooksys.orm.entity.Profile;

public class UserResponseDto {

	private Profile profile;
	private Credential credential;
	private List<TweetResponseDto> tweets;

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

	public List<TweetResponseDto> getTweets() {
		return tweets;
	}

	public void setTweets(List<TweetResponseDto> tweets) {
		this.tweets = tweets;
	}

}
