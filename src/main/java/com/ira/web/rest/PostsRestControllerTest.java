package com.ira.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>PostsRestController</code> controller.
 *
 * @see com.ira.web.rest.PostsRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/IRA-security-context.xml",
		"file:./src/main/resources/IRA-service-context.xml",
		"file:./src/main/resources/IRA-dao-context.xml",
		"file:./src/main/resources/IRA-web-context.xml" })
public class PostsRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Postsposts_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPostsposts_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostPostsposts_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutPostsposts_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idusersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeletePostsposts_idusersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idusersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPostsposts_idusersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPostsposts_idcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/commentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostPostsposts_idcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/commentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutPostsposts_idcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/commentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idcommentsescomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeletePostsposts_idcommentsescomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/commentses/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_idcommentsescomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPostsposts_idcommentsescomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}/commentses/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Posts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPosts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPostsposts_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Posts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutPosts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Posts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostPosts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Postsposts_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeletePostsposts_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Posts/{posts_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PostsRestController controller = (PostsRestController) context.getBean("PostsRestController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}