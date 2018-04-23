package com.cisco.cmad.madblog.data;

import java.util.List;


import com.cisco.cmad.madblog.api.Post;

import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;
 
public interface PostDAO extends DAO<Post, ObjectId> {
	
	void createPost(Post post);
	void editPost(Post post);
	List<Post> search(String key);
	Post getPost(ObjectId postId);
	List<Post> getUserPosts(ObjectId userId);
	List<Post> getAllPosts();

}
