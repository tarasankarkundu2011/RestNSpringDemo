package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Profile;
import com.example.service.ProfileService;


@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/profiles")
	public List<Profile> getAllProfiles(){
		List<Profile> profileList = profileService.getAllProfiles();
		return profileList;
	}
	
	@RequestMapping(value="/profiles", method=RequestMethod.POST)
	public void createProfile(@RequestBody Profile profile){
		profileService.addProfile(profile);
	}
	
	
	@RequestMapping("/profiles/{profileId}")
	public Profile getProfileById(@PathVariable("profileId") int id){
		Profile profile = profileService.getProfileById(id);
		return profile;
	}
	
	@RequestMapping("/profiles/{profileId}")
	public Profile updateProfileById(@PathVariable("profileId") int id, @RequestBody Profile updatedProfile){
		Profile profile = profileService.updateProfileById(updatedProfile);
		return profile;
	}
	
	@RequestMapping("/profiles/{profileId}")
	public void deleteProfileById(@PathVariable("profileId") int id){
		profileService.deleteProfileById(id);
	}
	
}
