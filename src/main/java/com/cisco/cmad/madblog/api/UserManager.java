package com.cisco.cmad.madblog.api;

import org.bson.types.ObjectId;

public interface UserManager {
	User getUserProfile(ObjectId userId);
	void createUser(User user);
	void editUser(User user);
	void signIn(User user);
}
