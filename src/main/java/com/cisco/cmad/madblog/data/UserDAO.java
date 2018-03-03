package com.cisco.cmad.madblog.data;

import com.cisco.cmad.madblog.api.User;

public interface UserDAO {
	
	void createUser(User user);
	void editUser(User user);
	User getUserProfile(int userId);

}
