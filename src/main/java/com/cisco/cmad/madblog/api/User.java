package com.cisco.cmad.madblog.api;

import javax.persistence.GeneratedValue;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Entity;


@Entity
public class User {
	@Id @GeneratedValue
	private long id;
	
	private String email;
	
	private String name;
	
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
