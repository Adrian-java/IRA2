package com.ira.service;

import com.ira.domain.Comments;
import com.ira.domain.Posts;
import com.ira.domain.Users;

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
public class PostsServiceTest {

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
	protected PostsService service;

	/**
	 * Instantiates a new PostsServiceTest.
	 *
	 */
	public PostsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Posts entity
	 * 
	 */
	@Test
	public void findAllPostss() {
		// TODO: JUnit - Populate test inputs for operation: findAllPostss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Posts> response = null;
		response = service.findAllPostss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPostss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Comments entity
	 * 
	 */
	@Test
	public void savePostsCommentses() {
		// TODO: JUnit - Populate test inputs for operation: savePostsCommentses 
		Integer id = 0;
		Comments related_commentses = new com.ira.domain.Comments();
		Posts response = null;
		response = service.savePostsCommentses(id, related_commentses);
		// TODO: JUnit - Add assertions to test outputs of operation: savePostsCommentses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Posts entity
	 * 
	 */
	@Test
	public void savePosts() {
		// TODO: JUnit - Populate test inputs for operation: savePosts 
		Posts posts = new com.ira.domain.Posts();
		service.savePosts(posts);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findPostsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPostsByPrimaryKey 
		Integer id_1 = 0;
		Posts response = null;
		response = service.findPostsByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findPostsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Comments entity
	 * 
	 */
	@Test
	public void deletePostsCommentses() {
		// TODO: JUnit - Populate test inputs for operation: deletePostsCommentses 
		Integer posts_id = 0;
		Integer related_commentses_id = 0;
		Posts response = null;
		response = service.deletePostsCommentses(posts_id, related_commentses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePostsCommentses
	}

	/**
	 * Operation Unit Test
	 * Load an existing Posts entity
	 * 
	 */
	@Test
	public void loadPostss() {
		Set<Posts> response = null;
		response = service.loadPostss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPostss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Posts entity
	 * 
	 */
	@Test
	public void deletePosts() {
		// TODO: JUnit - Populate test inputs for operation: deletePosts 
		Posts posts_1 = new com.ira.domain.Posts();
		service.deletePosts(posts_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Posts entity
	 * 
	 */
	@Test
	public void countPostss() {
		Integer response = null;
		response = service.countPostss();
		// TODO: JUnit - Add assertions to test outputs of operation: countPostss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deletePostsUsers() {
		// TODO: JUnit - Populate test inputs for operation: deletePostsUsers 
		Integer posts_id_1 = 0;
		Integer related_users_id = 0;
		Posts response = null;
		response = service.deletePostsUsers(posts_id_1, related_users_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePostsUsers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void savePostsUsers() {
		// TODO: JUnit - Populate test inputs for operation: savePostsUsers 
		Integer id_2 = 0;
		Users related_users = new com.ira.domain.Users();
		Posts response = null;
		response = service.savePostsUsers(id_2, related_users);
		// TODO: JUnit - Add assertions to test outputs of operation: savePostsUsers
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
