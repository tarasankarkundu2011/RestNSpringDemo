package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer>{

	public Profile findByProfileName(String profileName);
}
