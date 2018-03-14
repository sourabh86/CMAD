package com.cisco.cmad.madblog.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cisco.cmad.madblog.api.Post;

public class JPAPostDAO implements PostDAO {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("madblog");
	private EntityManager em = emf.createEntityManager();
	
	private static final String GET_ALL_POST_BY_USER = 
			"select post from Post post where post.author.id = :id";

	private static final String GET_POST_BY_ID = 
			"select post from Post post where post.id = :postId";
	
	private static final String GET_ALL_POST = 
			"SELECT post from Post post";

	@Override
	public void createPost(Post post) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(post);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void editPost(Post post) {
	}

	@Override
	public List<Post> search(String key) {
		return null;
	}

	@Override
	public Post getPost(int postId) {
		Post post = em.createQuery(GET_POST_BY_ID, Post.class)
				.setParameter("postId", postId)
				.getSingleResult();
		return post;
	}

	@Override
	public List<Post> getUserPosts(int userId) {
		return em.createQuery(GET_ALL_POST_BY_USER, Post.class)
				.setParameter("userId", userId+"").getResultList();
	}

	@Override
	public List<Post> getAllPosts() {
		return em.createQuery(GET_ALL_POST, Post.class).getResultList();
	}

}
