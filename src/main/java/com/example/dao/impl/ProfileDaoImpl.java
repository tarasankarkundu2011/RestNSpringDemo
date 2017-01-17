package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.ProfileDao;
import com.example.dao.ProfileRepository;
import com.example.model.Profile;

@Component
public class ProfileDaoImpl implements ProfileDao{
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public List getAllProfiles() {
		List<Profile> profileList = new ArrayList<>();

		for(Profile singleProfilr :profileRepository.findAll()){
			profileList.add(singleProfilr);
		}
		
		return profileList;
	}

	@Override
	public void addProfile(Profile profile) {
		profileRepository.save(profile);
		
	}

	@Override
	public Profile getProfileById(int id) {
		return profileRepository.findOne(id);
	}

	@Override
	public void updateProfileById(Profile updatedProfile) {
		profileRepository.save(updatedProfile);
	}

	@Override
	public void deleteProfileById(int id) {
		profileRepository.delete(id);
		
	}

	@Override
	public Profile getProfileByName(String name) {
		return profileRepository.findByProfileName(name);
	}
	
	

}
