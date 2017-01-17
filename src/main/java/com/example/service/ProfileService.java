package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Profile;

@Service
public interface ProfileService {

	List<Profile> getAllProfiles();

	void addProfile(Profile profile);

	Profile getProfileById(int id);

	Profile updateProfileById(Profile updatedProfile);

	void deleteProfileById(int id);

	Profile getProfileByName(String name);

	
}
