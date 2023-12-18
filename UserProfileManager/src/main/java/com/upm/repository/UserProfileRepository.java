package com.upm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upm.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
