package com.cisco.cmad.madblog.api;

import java.util.List;

public interface BlogManager {
	void createPost(Post post);
	void editPost(Post post);
	List<Post> searchPost(String key);
	Post getPostById(int postId);
	List<Post> getUserPosts(int userId);

}
