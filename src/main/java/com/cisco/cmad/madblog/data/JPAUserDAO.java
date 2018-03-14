package com.cisco.cmad.madblog.data;

import com.cisco.cmad.madblog.api.User;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUserDAO implements UserDAO {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("madblog");
	private EntityManager em = emf.createEntityManager();

	@Override
	public void createUser(User user) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void editUser(User user) {
	}
	
	private static final String GET_USER_BY_ID = 
			"Select user FROM User user WHERE user.id = :id" ;

	@Override
	public User getUserProfile(int userId) {
		List<User> userList = em.createQuery(GET_USER_BY_ID, User.class).setParameter("id", (long)userId).getResultList();
		return userList.get(0);
	}

}
