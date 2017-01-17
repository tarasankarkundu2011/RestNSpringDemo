package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Profile;
import com.example.service.ProfileService;

/**
* This REST Controller is used for exposing the CRUD operation 
* on profile resource
* 
* @author  Tarasankar Kundu
* @version 1.0
* @since   2017-01-05 
*/
@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	/**
	 * This API is for getting all the Profile Resources
	 * Could be accessible by HTTP GET : http://localhost:7070/socialWeb/profiles/
	 * @return List<Profile>
	 */
	@RequestMapping(value="/profiles", method=RequestMethod.GET)
	public List<Profile> getAllProfiles(){
		List<Profile> profileList = profileService.getAllProfiles();
		return profileList;
	}
	
	/**
	 * This API is for Creating a new Profile
	 * Could be accessible by HTTP POST : http://localhost:7070/socialWeb/profiles/
	 * Sample Request Body contains 
	 * {
 	 * "profileId":1,
 	 * "profileName":"Tarasankar Kundu",
     * "address":"Oradell"
     * }
	 *
	 */
	@RequestMapping(value="/profiles", method=RequestMethod.POST)
	public void createProfile(@RequestBody Profile profile){
		profileService.addProfile(profile);
	}
	
	/**
	 * This API is for getting Profile based on ID 
	 * Could be accessible by HTTP GET : http://localhost:7070/socialWeb/profiles/1
	 * 
	 * @return Profile
	 */
	@RequestMapping(value="/profiles/{profileId}", method=RequestMethod.GET)
	public Profile getProfileById(@PathVariable("profileId") int id){
		Profile profile = profileService.getProfileById(id);
		return profile;
	}
	
	/**
	 * This API is for Updating Profile based on ID 
	 * Could be accessible by HTTP PUT : http://localhost:7070/socialWeb/profiles/1
	 * 
	 * Sample Request Body contains 
	 * {
 	 * "profileId":1,
 	 * "profileName":"Tarasankar Kundu",
     * "address":"Updated Address Oradell"
     * }
	 *
	 * @return Profile
	 */
	@RequestMapping(value="/profiles/{profileId}", method=RequestMethod.PUT)
	public Profile updateProfileById(@PathVariable("profileId") int id, @RequestBody Profile updatedProfile){
		Profile profile = profileService.updateProfileById(updatedProfile);
		return profile;
	}
	
	/**
	 * This API is for Deleting Profile based on ID 
	 * Could be accessible by HTTP DELETE : http://localhost:7070/socialWeb/profiles/1
	 * 
	 */
	@RequestMapping(value="/profiles/{profileId}", method=RequestMethod.DELETE)
	public void deleteProfileById(@PathVariable("profileId") int id){
		profileService.deleteProfileById(id);
	}
	
//	@RequestMapping(value="/profiles/{profileName}", method=RequestMethod.GET)
//	public Profile getProfileByName(@PathVariable("profileName") String name){
//		Profile profile = profileService.getProfileByName(name);
//		return profile;
//	}
	
}
