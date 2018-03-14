package com.cisco.cmad.madblog.business;

import java.util.List;

import com.cisco.cmad.madblog.api.AuthorizationException;
import com.cisco.cmad.madblog.api.BlogException;
import com.cisco.cmad.madblog.api.BlogManager;
import com.cisco.cmad.madblog.api.Post;
import com.cisco.cmad.madblog.data.JPAPostDAO;

public class MADBlogManager implements BlogManager {
	
	JPAPostDAO postDao = new JPAPostDAO();

	@Override
	public void createPost(Post post) {
		if (post != null && post.getAuthor() != null) {
			if (!(post.getTitle().trim().length() == 0)) {
				postDao.createPost(post);
			} else {
				throw new BlogException();
			}
		} else{
			throw new AuthorizationException();
		}
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
