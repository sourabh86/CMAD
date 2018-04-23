package com.cisco.cmad.madblog.data;

import org.bson.types.ObjectId;

import com.cisco.cmad.madblog.api.User;

public interface UserDAO {
	
	void createUser(User user);
	void editUser(User user);
	User getUserProfile(ObjectId userId);

}
