package com.ira.service;

import com.ira.domain.Comments;
import com.ira.domain.Posts;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/IRA-security-context.xml",
		"file:./src/main/resources/IRA-service-context.xml",
		"file:./src/main/resources/IRA-dao-context.xml",
		"file:./src/main/resources/IRA-web-context.xml" })
@Transactional
public class CommentsServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected CommentsService service;

	/**
	 * Instantiates a new CommentsServiceTest.
	 *
	 */
	public CommentsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Posts entity
	 * 
	 */
	@Test
	public void saveCommentsPosts() {
		// TODO: JUnit - Populate test inputs for operation: saveCommentsPosts 
		Integer id = 0;
		Posts related_posts = new com.ira.domain.Posts();
		Comments response = null;
		response = service.saveCommentsPosts(id, related_posts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCommentsPosts
	}

	/**
	 * Operation Unit Test
	 * Save an existing Comments entity
	 * 
	 */
	@Test
	public void saveCommentsComments() {
		// TODO: JUnit - Populate test inputs for operation: saveCommentsComments 
		Integer id_1 = 0;
		Comments related_comments = new com.ira.domain.Comments();
		Comments response = null;
		response = service.saveCommentsComments(id_1, related_comments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCommentsComments
	}

	/**
	 * Operation Unit Test
	 * Return all Comments entity
	 * 
	 */
	@Test
	public void findAllCommentss() {
		// TODO: JUnit - Populate test inputs for operation: findAllCommentss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Comments> response = null;
		response = service.findAllCommentss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCommentss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Comments entity
	 * 
	 */
	@Test
	public void countCommentss() {
		Integer response = null;
		response = service.countCommentss();
		// TODO: JUnit - Add assertions to test outputs of operation: countCommentss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Posts entity
	 * 
	 */
	@Test
	public void deleteCommentsPosts() {
		// TODO: JUnit - Populate test inputs for operation: deleteCommentsPosts 
		Integer comments_id = 0;
		Integer related_posts_id = 0;
		Comments response = null;
		response = service.deleteCommentsPosts(comments_id, related_posts_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCommentsPosts
	}

	/**
	 * Operation Unit Test
	 * Load an existing Comments entity
	 * 
	 */
	@Test
	public void loadCommentss() {
		Set<Comments> response = null;
		response = service.loadCommentss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCommentss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Comments entity
	 * 
	 */
	@Test
	public void saveCommentsCommentses() {
		// TODO: JUnit - Populate test inputs for operation: saveCommentsCommentses 
		Integer id_2 = 0;
		Comments related_commentses = new com.ira.domain.Comments();
		Comments response = null;
		response = service.saveCommentsCommentses(id_2, related_commentses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCommentsCommentses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Comments entity
	 * 
	 */
	@Test
	public void deleteCommentsComments() {
		// TODO: JUnit - Populate test inputs for operation: deleteCommentsComments 
		Integer comments_id_1 = 0;
		Integer related_comments_id = 0;
		Comments response = null;
		response = service.deleteCommentsComments(comments_id_1, related_comments_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCommentsComments
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCommentsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCommentsByPrimaryKey 
		Integer id_3 = 0;
		Comments response = null;
		response = service.findCommentsByPrimaryKey(id_3);
		// TODO: JUnit - Add assertions to test outputs of operation: findCommentsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Comments entity
	 * 
	 */
	@Test
	public void deleteComments() {
		// TODO: JUnit - Populate test inputs for operation: deleteComments 
		Comments comments = new com.ira.domain.Comments();
		service.deleteComments(comments);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Comments entity
	 * 
	 */
	@Test
	public void saveComments() {
		// TODO: JUnit - Populate test inputs for operation: saveComments 
		Comments comments_1 = new com.ira.domain.Comments();
		service.saveComments(comments_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Comments entity
	 * 
	 */
	@Test
	public void deleteCommentsCommentses() {
		// TODO: JUnit - Populate test inputs for operation: deleteCommentsCommentses 
		Integer comments_id_2 = 0;
		Integer related_commentses_id = 0;
		Comments response = null;
		response = service.deleteCommentsCommentses(comments_id_2, related_commentses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCommentsCommentses
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
