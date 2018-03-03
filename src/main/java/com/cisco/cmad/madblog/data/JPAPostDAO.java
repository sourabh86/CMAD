package com.cisco.cmad.madblog.data;

import java.util.ArrayList;
import java.util.List;

import com.cisco.cmad.madblog.api.Post;

public class JPAPostDAO implements PostDAO {

	@Override
	public void createPost(Post post) {
	}

	@Override
	public void editPost(Post post) {
	}

	@Override
	public List<Post> search(String key) {
		return null;
	}

	@Override
	public Post getPost(int postId) {
		return null;
	}

	@Override
	public ArrayList<Post> getUserPosts(int userId) {
		return null;
	}

}
