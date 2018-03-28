package com.cisco.cmad.madblog.api;

import java.util.Date;

import javax.persistence.CascadeType;
import org.mongodb.morphia.annotations.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Comment {

	@Id @GeneratedValue
	private long id;
	
	private String content;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private User user;
	
	private Date creationDate;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}