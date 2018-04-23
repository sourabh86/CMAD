package com.cisco.cmad.madblog.data;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

import com.cisco.cmad.madblog.api.Post;
import com.cisco.cmad.madblog.api.User;


public class MorphiaPostDAO extends BasicDAO<Post, ObjectId> implements PostDAO {
	
	public MorphiaPostDAO(Class<Post> entityClass, Datastore ds) {
		super(entityClass, ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPost(Post post) {
		save(post);
		
	}

	@Override
	public void editPost(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Post> search(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPost(ObjectId postId) {
		Query<Post> query = createQuery().field("id").equal(postId);
		return query.get();
	}

	@Override
	public List<Post> getUserPosts(ObjectId userId) {
//		Query<Post> query = createQuery().field("id").equal(postId);
//		return query.get;
		return null;
	}

	@Override
	public List<Post> getAllPosts() {
		return find().asList();
	}



}
