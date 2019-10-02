package com.harshakj.blog.boundary;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import com.harshakj.blog.control.BlogController;
import com.harshakj.blog.entity.BlogPost;
import com.harshakj.blog.exception.CreateBlogPostException;
import com.harshakj.blog.exception.DbInsertException;

@Produces(MediaType.APPLICATION_JSON)
@Path("blog")
public class BlogResource {
	
	@Inject
	private BlogController blogController;
	
	@GET
	@Path("get")
	@APIResponse(description = "returns a blog post")
    public BlogPost getPost() {
        return  new BlogPost("title of post", "Microprofile has extended some of the Java EE specifications to address microservices patterns.");
    }
	
	@POST
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createPost(BlogPost blogPost) {
		
		try {
			blogController.createBlogPost(blogPost);
		} catch (DbInsertException e) {
			throw new CreateBlogPostException("Couldn't create blog post", e);
		}
		
		return "created";
	}
	
}
