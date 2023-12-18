package com.upm.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;



@Entity
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String username;
	private String email;
	
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;

	@PrePersist
	protected void onCreate() {
	    createdAt = LocalDateTime.now();
	}


	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfile(long id, String username, String email, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	

}
