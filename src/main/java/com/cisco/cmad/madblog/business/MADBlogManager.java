package com.cisco.cmad.madblog.business;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.cisco.cmad.madblog.api.AuthorizationException;
import com.cisco.cmad.madblog.api.BlogException;
import com.cisco.cmad.madblog.api.BlogManager;
import com.cisco.cmad.madblog.api.Post;
import com.cisco.cmad.madblog.data.MorphiaPostDAO;
import com.mongodb.MongoClient;

public class MADBlogManager implements BlogManager {
	MongoClient mongoClient = new MongoClient("127.0.0.1:27017");
	String databaseName = "learningmongo";
	Morphia morphia = new Morphia(); 
	Datastore ds = morphia.createDatastore(mongoClient,databaseName);
	MorphiaPostDAO temp = new MorphiaPostDAO(Post.class, ds);
	
	@Override
	public void createPost(Post post) {
		System.out.println(post);
		if (post != null) {
			System.out.println(("test3"));
			if (!(post.getTitle().trim().length() == 0)) {
				System.out.println("test4");
				temp.createPost(post);
			} else {
				throw new BlogException();
			}
		} else{
			throw new AuthorizationException();
		}
	}

	@Override
	public void editPost(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Post> searchPost(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getUserPosts(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
