package com.cisco.cmad.madblog.business;

import java.util.List;

import com.cisco.cmad.madblog.api.BlogManager;
import com.cisco.cmad.madblog.api.Post;

public class MADBlogManager implements BlogManager {

	@Override
	public void createPost(Post post) {
	}

	@Override
	public void editPost(Post post) {
	}

	@Override
	public List<Post> searchPost(String key) {
		return null;
	}

	@Override
	public Post getPostById(int postId) {
		return null;
	}

	@Override
	public List<Post> getUserPosts(int userId) {
		return null;
	}

}
