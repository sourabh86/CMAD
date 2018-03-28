package com.cisco.cmad.madblog.api;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("post")
public class Post {
	
	@Id @GeneratedValue
	private int id;
	
	private String title;
	
	private String content;
	
	private Date createDate;
	
	private Date lastUpdated;
	public Post(){
		
	}
	public Post(String title, String content, Date createDate,
			Date lastUpdated) {
		super();
		this.title = title;
		this.content = content;
		this.createDate = createDate;
		this.lastUpdated = lastUpdated;
	
	}
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<Comment> comments;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private User author;
	
	public int getPostId() {
		return id;
	}

	public void setPostId(int postId) {
		this.id = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

}