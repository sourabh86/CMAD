package com.cisco.cmad.madblog.data;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.cisco.cmad.madblog.api.Post;
import com.cisco.cmad.madblog.api.User;
import com.mongodb.MongoClient;

public class DAOHelper {
	
	private static DAOHelper instance;
	private PostDAO postDao;
	private UserDAO userDao;

	private DAOHelper() {
		
		MongoClient mongoClient = new MongoClient("localhost:27017");
		String databaseName = "learningmongo";
		Morphia morphia = new Morphia(); 
		Datastore ds = morphia.createDatastore(mongoClient,databaseName);
		postDao = new MorphiaPostDAO(Post.class, ds);
		userDao = new MorphiaUserDAO(User.class,ds);
		
	}
	
	public static DAOHelper getInstance() {
		if (instance == null) {
			instance = new DAOHelper();
		}
		return instance;
	}

	public PostDAO getPostDao() {
		return postDao;
	}

	public UserDAO getUserDao() {
		return userDao;
	}

}
