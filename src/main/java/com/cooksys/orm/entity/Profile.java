package com.cooksys.orm.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Profile {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int Id;

	

	private String firstName;
	private String lastName;

	@Column(nullable = false)
	private String email;

	private String phone;

	public Profile() {

	}

//	public Profile(int id, String firstName, String lastName, String email, String phone) {
//		super();
//		this.Id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.phone = phone;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	public int getId() {
//		return Id;
//	}
//
//	public void setId(int id) {
//		Id = id;
//	}

}
