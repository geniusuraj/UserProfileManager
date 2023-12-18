package com.upm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.upm.model.UserProfile;
import com.upm.repository.UserProfileRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepository;
	
	public UserProfile createUserProfile(UserProfile userProfile) {
		return userProfileRepository.save(userProfile);
	}
	
	public List<UserProfile> getAllUserProfiles(){
		
		return userProfileRepository.findAll();
	}
	
	public Optional<UserProfile> getUserProfileById(Long id){
		return userProfileRepository.findById(id);
	}
	
	public UserProfile updateUserProfile(Long id, UserProfile userProfileDetails) {
	    UserProfile userProfile = userProfileRepository.findById(id)
	        .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
	    userProfile.setUsername(userProfileDetails.getUsername());
	    userProfile.setEmail(userProfileDetails.getEmail());
	    return userProfileRepository.save(userProfile);
	}

	public void deleteUserProfile(Long id) {
		userProfileRepository.deleteById(id);
	}
}
