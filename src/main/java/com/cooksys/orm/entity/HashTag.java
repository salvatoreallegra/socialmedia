package com.cooksys.orm.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HashTag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(unique = true)
	private String label;
	private Timestamp firstUsed;
	private Timestamp lastUsed;

	public HashTag() {

	}

//	public HashTag(String label, Timestamp firstUsed, Timestamp lastUsed) {
//		this.label = label;
//		this.firstUsed = firstUsed;
//		this.lastUsed = lastUsed;
//	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Timestamp getFirstUsed() {
		return firstUsed;
	}

	public void setFirstUsed(Timestamp firstUsed) {
		this.firstUsed = firstUsed;
	}

	public Timestamp getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Timestamp lastUsed) {
		this.lastUsed = lastUsed;
	}

}
