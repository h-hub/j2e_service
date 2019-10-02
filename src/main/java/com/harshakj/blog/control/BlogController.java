package com.harshakj.blog.control;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.harshakj.blog.entity.BlogPost;
import com.harshakj.blog.exception.DbInsertException;

@ApplicationScoped
public class BlogController {

	@Inject
	private EntityManager em;

	public BlogPost createBlogPost(BlogPost blogPost) throws DbInsertException {
		
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(blogPost);
			tx.commit();
		} catch(Exception e) {
			tx.rollback();
			throw new DbInsertException("DB exception");
		}
		
		return blogPost;

	}

}
