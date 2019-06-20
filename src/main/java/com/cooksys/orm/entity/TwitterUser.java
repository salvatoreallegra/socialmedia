package com.cooksys.orm.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity
public class TwitterUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	//@Column(insertable = false, updatable = false)
	private int Id;
	
//	@Column(nullable=false)	
//	private String userName;
	
	@Embedded
	private Profile profile;
	
	@Embedded
	private Credential credential;
	
	
	private Timestamp joinDate;
	
	@OneToMany(
	        mappedBy = "TwitterUser",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	    private List<Tweet> tweet;
	
	public TwitterUser() {
		
		
	}
//	public TwitterUser(String userName, Profile profile, Timestamp joinDate) {
//		
//		
//		this.userName = userName;
//		this.profile = profile;
//		this.joinDate = joinDate;
//		
//	}
		
//	public String getUserName() {
//		return userName;
//	}
//
//
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}



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
