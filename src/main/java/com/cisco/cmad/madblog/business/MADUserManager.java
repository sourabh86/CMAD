package com.cisco.cmad.madblog.business;

import com.cisco.cmad.madblog.api.BlogException;
import com.cisco.cmad.madblog.api.User;
import com.cisco.cmad.madblog.api.UserManager;
import com.cisco.cmad.madblog.data.JPAUserDAO;
import com.cisco.cmad.madblog.data.UserDAO;

public class MADUserManager implements UserManager {
	
	UserDAO userDao = new JPAUserDAO();

	@Override
	public User getUserProfile(int userId) {
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
