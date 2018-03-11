package com.cisco.cmad.madblog.data;

import java.util.List;

import com.cisco.cmad.madblog.api.Post;

public interface PostDAO {
	
	void createPost(Post post);
	void editPost(Post post);
	List<Post> search(String key);
	Post getPost(int postId);
	List<Post> getUserPosts(int userId);

}
