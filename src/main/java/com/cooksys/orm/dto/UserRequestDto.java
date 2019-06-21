package com.cooksys.orm.dto;

import java.sql.Timestamp;

import com.cooksys.orm.entity.Credential;
import com.cooksys.orm.entity.Profile;

public class UserRequestDto {

	private Credential credential;
	private Profile profile;
	// private Timestamp dateJoined;

	public UserRequestDto() {
	}

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

}
