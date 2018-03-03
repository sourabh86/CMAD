package com.cisco.cmad.madblog.api;

public interface UserManager {
	User getUserProfile(int userId);
	void createUser(User user);
	void editUser(User user);
	void signIn(User user);
}
