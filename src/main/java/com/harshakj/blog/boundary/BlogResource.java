package com.harshakj.blog.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import com.harshakj.blog.model.BlogPost;


@Produces(MediaType.APPLICATION_JSON)
@Path("getPost")
public class BlogResource {
	
	@GET
	@APIResponse(description = "returns a blog post")
    public BlogPost getPost() {
        return  new BlogPost("title of post", "Microprofile has extended some of the Java EE specifications to address microservices patternsx.");
    }
	
}
