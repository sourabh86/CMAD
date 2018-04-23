package com.cisco.cmad.madblog.business;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.cisco.cmad.madblog.api.AuthorizationException;
import com.cisco.cmad.madblog.api.BlogException;
import com.cisco.cmad.madblog.api.BlogManager;
import com.cisco.cmad.madblog.api.Post;
import com.cisco.cmad.madblog.data.DAOHelper;
import com.cisco.cmad.madblog.data.MorphiaPostDAO;
import com.cisco.cmad.madblog.data.PostDAO;
import com.mongodb.MongoClient;

public class MADBlogManager implements BlogManager {
	//MongoClient mongoClient = new MongoClient("10.0.2.211:27017");
//	MongoClient mongoClient = new MongoClient("localhost:27017");
//	String databaseName = "learningmongo";
//	Morphia morphia = new Morphia(); 
//	Datastore ds = morphia.createDatastore(mongoClient,databaseName);
//	MorphiaPostDAO morphiaPostDao = new MorphiaPostDAO(Post.class, ds);
	PostDAO morphiaPostDao = DAOHelper.getInstance().getPostDao();
	
	@Override
	public void createPost(Post post) {
		System.out.println(post);
		if (post != null) {
			if (!(post.getTitle().trim().length() == 0)) {
				morphiaPostDao.createPost(post);
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
	public Post getPostById(ObjectId postId) {
		return morphiaPostDao.getPost(postId);
	}

	@Override
	public List<Post> getUserPosts(ObjectId userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getAllPosts(int pageSize) {
		return morphiaPostDao.getAllPosts();
	}

}
