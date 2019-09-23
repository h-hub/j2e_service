package com.harshakj.blog.model;

public class BlogPost {
	
	private long id;
	private String title;
	private String content;
	
	public BlogPost(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

}
