package com.cisco.cmad.madblog.api;

import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.mongodb.morphia.annotations.Entity;


@Entity("user")
public class User {
	
	@Id
	@JsonSerialize(using = CustomObjIdSerializer.class)
	private ObjectId id;
	
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

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}
	
}
