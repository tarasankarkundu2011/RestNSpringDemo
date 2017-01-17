package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Profile;

@Repository
public interface ProfileDao {

	List getAllProfiles();

	void addProfile(Profile profile);

	Profile getProfileById(int id);

	void updateProfileById(Profile updatedProfile);

	void deleteProfileById(int id);

}
