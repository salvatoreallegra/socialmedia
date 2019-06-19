package com.cooksys.orm.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class TwitterUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int Id;
	
	@Column(nullable=false)	
	private String userName;
	
	@Embedded
	private Profile profile;
	
	
	private Timestamp joinDate;
	
	public TwitterUser() {
		
		
		
	}
		
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Profile getProfile() {
		return profile;
	}



	public void setProfile(Profile profile) {
		this.profile = profile;
	}



	public Timestamp getJoinDate() {
		return joinDate;
	}



	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}





}
