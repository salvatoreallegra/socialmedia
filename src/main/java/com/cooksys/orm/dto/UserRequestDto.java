package com.cooksys.orm.dto;

import java.sql.Timestamp;

import com.cooksys.orm.entity.Profile;

public class UserRequestDto {
	
	 private String userName;
	 private Profile profile;
	 private Timestamp dateJoined;

	    public UserRequestDto() {
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

		public Timestamp getDateJoined() {
			return dateJoined;
		}

		public void setDateJoined(Timestamp dateJoined) {
			this.dateJoined = dateJoined;
		}

	   
}
