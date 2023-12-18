package com.upm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upm.model.UserProfile;
import com.upm.service.UserProfileService;

@RestController
@RequestMapping("/user-profiles")
public class UserProfileController {

	@Autowired
	private UserProfileService userProfileService;
	
	@PostMapping
	public UserProfile createUserProfile(@RequestBody UserProfile userProfile) {
		return userProfileService.createUserProfile(userProfile);
	}
	
	@GetMapping
	public List<UserProfile> getAllUserProfiles(){
		return userProfileService.getAllUserProfiles();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserProfile> getUserProfileById(@PathVariable Long id) {
	    return userProfileService.getUserProfileById(id)
	            .map(ResponseEntity::ok)
	            .orElseGet(() -> ResponseEntity.notFound().build());
	}

	
	@PutMapping("/{id}")
	public UserProfile updateUserProfile(@PathVariable Long id, @RequestBody UserProfile userProfileDetails) {
		
		return userProfileService.updateUserProfile(id, userProfileDetails);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserProfile(@PathVariable Long id) {
		userProfileService.deleteUserProfile(id);
	}
	
}
