package com.cisco.cmad.madblog.api;

import java.util.List;

import org.bson.types.ObjectId;

public interface BlogManager {
	void createPost(Post post);
	void editPost(Post post);
	List<Post> searchPost(String key);
	Post getPostById(ObjectId postId);
	List<Post> getUserPosts(ObjectId userId);
	List<Post> getAllPosts(int pageSize);
}
