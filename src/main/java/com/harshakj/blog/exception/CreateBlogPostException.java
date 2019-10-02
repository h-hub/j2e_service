package com.harshakj.blog.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class CreateBlogPostException extends WebApplicationException {
	
	public CreateBlogPostException(String errorMessage, Exception e) {
		super(Response.status(400).header("info", errorMessage).build());
	}
	
}
