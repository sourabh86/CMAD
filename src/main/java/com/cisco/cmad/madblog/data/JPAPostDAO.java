package com.cisco.cmad.madblog.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.cisco.cmad.madblog.api.Post;
import com.mongodb.DBCollection;
import com.mongodb.WriteConcern;
import com.mongodb.WriteResult;

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

//	@Override
//	public Post getPost(int postId) {
//		Post post = em.createQuery(GET_POST_BY_ID, Post.class)
//				.setParameter("postId", postId)
//				.getSingleResult();
//		return post;
//	}

//	@Override
//	public List<Post> getUserPosts(int userId) {
//		return em.createQuery(GET_ALL_POST_BY_USER, Post.class)
//				.setParameter("userId", userId+"").getResultList();
//	}

	@Override
	public List<Post> getAllPosts() {
		return em.createQuery(GET_ALL_POST, Post.class).getResultList();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long count(Query<Post> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long count(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Query<Post> createQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateOperations<Post> createUpdateOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WriteResult delete(Post arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WriteResult delete(Post arg0, WriteConcern arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WriteResult deleteById(ObjectId arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WriteResult deleteByQuery(Query<Post> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ensureIndexes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Query<Post> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exists(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public QueryResults<Post> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryResults<Post> find(Query<Post> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ObjectId> findIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ObjectId> findIds(Query<Post> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ObjectId> findIds(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findOne(Query<Post> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findOne(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key<Post> findOneId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key<Post> findOneId(Query<Post> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key<Post> findOneId(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post get(ObjectId arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DBCollection getCollection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Datastore getDatastore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<Post> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key<Post> save(Post arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key<Post> save(Post arg0, WriteConcern arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateResults update(Query<Post> arg0, UpdateOperations<Post> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateResults updateFirst(Query<Post> arg0, UpdateOperations<Post> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPost(ObjectId postId) {
		return null;
	}

	@Override
	public List<Post> getUserPosts(ObjectId userId) {
		return null;
	}

}
