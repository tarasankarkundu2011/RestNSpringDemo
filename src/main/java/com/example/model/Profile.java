package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
	
	@Id
	private int profileId;
	private String profileName;
	private String address;
	
	public Profile() {
	
	}
	
	public Profile(int profileId, String profileName, String address) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.address = address;
	}
	
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
