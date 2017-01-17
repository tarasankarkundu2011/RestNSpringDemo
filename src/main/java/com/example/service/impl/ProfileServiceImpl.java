package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.ProfileDao;
import com.example.model.Profile;
import com.example.service.ProfileService;

@Component
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileDao profileDao;
	
	@Override
	public List<Profile> getAllProfiles() {
		List profileList = profileDao.getAllProfiles();
		return profileList;
	}

	@Override
	public void addProfile(Profile profile) {
		profileDao.addProfile(profile);
		
	}

	@Override
	public Profile getProfileById(int id) {
		return profileDao.getProfileById(id);
	}

	@Override
	public Profile updateProfileById(Profile updatedProfile) {
		profileDao.updateProfileById(updatedProfile);
		return updatedProfile;
	}

	@Override
	public void deleteProfileById(int id) {
		profileDao.deleteProfileById(id);
	}

}
