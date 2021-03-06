package com.cisco.cmad.madblog.rest;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bson.types.ObjectId;

import com.cisco.cmad.madblog.api.BlogException;
import com.cisco.cmad.madblog.api.BlogManager;
import com.cisco.cmad.madblog.api.Post;
import com.cisco.cmad.madblog.api.User;
import com.cisco.cmad.madblog.api.UserManager;
import com.cisco.cmad.madblog.business.MADBlogManager;
import com.cisco.cmad.madblog.business.MADUserManager;

@Path("/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
public class PostRootResource {
	
	BlogManager blogManager  = new MADBlogManager();
	UserManager userManager = new MADUserManager();
	
	@GET
	@Path("/posts")
	public Response getAllPosts( ) {
		try {
			List<Post> posts = blogManager.getAllPosts(10);
			return Response.ok().entity(posts).build();
		} catch (Exception e) {
			throw new BlogException();
		}

	}
	
	@GET
	@Path("/posts/{postId}")
	public Response getPost( @PathParam("postId") ObjectId postId) {
		try {
			Post specificPost = blogManager.getPostById(postId);
			return Response.ok().entity(specificPost).build();
		} catch (Exception e) {
			throw new BlogException();
		}

	}
	
	@POST
	@Path("/users/{userId}/posts")
	public Response addPost ( @PathParam("userId") ObjectId userId, Post post) {
		try {
			User author = userManager.getUserProfile(userId);
			post.setAuthor(author);
			System.out.println("test1");
			post.setCreateDate(new Date());
			post.setLastUpdated(new Date());
			blogManager.createPost(post);
			return Response.created(new URI(post.getPostId() + "")).build();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BlogException();
		}

	}
	
	@POST
	@Path("/users")
	public Response addUser( User user) {
		try {
			userManager.createUser(user);
			return Response.created(new URI(user.getId() + "")).build();
		} catch (Exception e) {
			throw new BlogException();
		}
	}
	
	@GET
	@Path("/users/{userId}")
	public Response getUser ( @PathParam("userId") ObjectId userId) {
		User user = userManager.getUserProfile(userId);
		return Response.ok().entity(user).build();
	}

}
