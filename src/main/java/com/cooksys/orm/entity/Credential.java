package com.cooksys.orm.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Credential {

	private String userName;
	private String passWord;

	public Credential() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
