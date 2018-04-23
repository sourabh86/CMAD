package com.cisco.cmad.madblog.business;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.cisco.cmad.madblog.api.BlogException;
import com.cisco.cmad.madblog.api.User;
import com.cisco.cmad.madblog.api.UserManager;
import com.cisco.cmad.madblog.data.DAOHelper;
import com.cisco.cmad.madblog.data.JPAUserDAO;
import com.cisco.cmad.madblog.data.MorphiaUserDAO;
import com.cisco.cmad.madblog.data.UserDAO;
import com.mongodb.MongoClient;

public class MADUserManager implements UserManager {
	
	//UserDAO userDao = new JPAUserDAO();
//	MongoClient mongoClient = new MongoClient("localhost:27017");
//	String databaseName = "learningmongo";
//	Morphia morphia = new Morphia(); 
//	Datastore ds = morphia.createDatastore(mongoClient,databaseName);
	UserDAO userDao = DAOHelper.getInstance().getUserDao();

	@Override
	public User getUserProfile(ObjectId userId) {
		return userDao.getUserProfile(userId);
	}

	@Override
	public void createUser(User user) {
		if (user.getEmail().isEmpty()
				|| user.getPassword().isEmpty()
				|| user.getName().isEmpty()) {
			throw new BlogException();
		} else {
			userDao.createUser(user);
		}
	}

	@Override
	public void editUser(User user) {
	}

	@Override
	public void signIn(User user) {
	}

}
