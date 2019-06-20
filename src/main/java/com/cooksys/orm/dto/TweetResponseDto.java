package com.cooksys.orm.dto;

import java.sql.Timestamp;

import com.cooksys.orm.entity.Tweet;
import com.cooksys.orm.entity.TwitterUser;

public class TweetResponseDto {
	
	private int id;
	private TwitterUser author;

	private Timestamp posted;
	private String content;

	private Tweet inReplyTo;

	private Tweet repostOf;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TwitterUser getAuthor() {
		return author;
	}

	public void setAuthor(TwitterUser author) {
		this.author = author;
	}

	public Timestamp getPosted() {
		return posted;
	}

	public void setPosted(Timestamp posted) {
		this.posted = posted;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Tweet getInReplyTo() {
		return inReplyTo;
	}

	public void setInReplyTo(Tweet inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	public Tweet getRepostOf() {
		return repostOf;
	}

	public void setRepostOf(Tweet repostOf) {
		this.repostOf = repostOf;
	}

	public TweetResponseDto() {
		
		
	}
	

}
