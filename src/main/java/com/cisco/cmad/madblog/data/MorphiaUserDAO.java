package com.cisco.cmad.madblog.data;

import com.cisco.cmad.madblog.api.User;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

public class MorphiaUserDAO extends BasicDAO<User, ObjectId> implements UserDAO {
	
	public MorphiaUserDAO(Class<User> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	@Override
	public void createUser(User user) {
		save(user);
	}

	@Override
	public void editUser(User user) {
	}

	@Override
	public User getUserProfile(ObjectId userId) {
		Query<User> query = createQuery().field("id").equal(userId);
		return query.get();
	}
}

