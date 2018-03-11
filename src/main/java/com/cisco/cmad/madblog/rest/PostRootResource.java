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

import com.cisco.cmad.madblog.api.BlogException;
import com.cisco.cmad.madblog.api.Post;
import com.cisco.cmad.madblog.api.User;

@Path("/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
public class PostRootResource {
	
	@GET
	@Path("/posts")
	public Response getRecentPosts( ) {
		try {
			List<Post> posts = new ArrayList<>();
			for(int i=0;i<10;i++){
				Post post = new Post();
				post.setContent("This is post content");
				post.setTitle("This is post title:"+i);
				post.setCreateDate(new Date());
				post.setPostId(i);
				User author = new User();
				author.setEmail("user@email.com");
				author.setName("Test Author");
				post.setAuthor(author);
				posts.add(post);
			}
			
			//List<Post> recentPosts = posts.getRecentPosts(10);
			return Response.ok().entity(posts).build();
		} catch (Exception e) {
			throw new BlogException();
		}

	}
	
	@GET
	@Path("/posts/{postId}")
	public Response getPost( @PathParam("postId") int postId) {
		try {
			//Post specificPost = posts.getPost(postId);
			Post post = new Post();
			StringBuilder contentBuilder = new StringBuilder();
			for(int i=0;i<200;i++){
				contentBuilder.append("This is post content.");
				if(i%50==0){
					contentBuilder.append("</p><p>");
				}
			}
			post.setContent(contentBuilder.toString());
			post.setTitle("This is post title:"+postId);
			post.setCreateDate(new Date());
			post.setPostId(postId);
			User author = new User();
			author.setEmail("user@email.com");
			author.setName("Test Author");
			post.setAuthor(author);
			return Response.ok().entity(post).build();
		} catch (Exception e) {
			throw new BlogException();
		}

	}

}
