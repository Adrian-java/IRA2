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
 * Unit test for the <code>CommentsRestController</code> controller.
 *
 * @see com.ira.web.rest.CommentsRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/IRA-security-context.xml",
		"file:./src/main/resources/IRA-service-context.xml",
		"file:./src/main/resources/IRA-dao-context.xml",
		"file:./src/main/resources/IRA-web-context.xml" })
public class CommentsRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Commentscomments_idposts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentscomments_idposts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/posts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idposts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCommentscomments_idposts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/posts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idposts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCommentscomments_idposts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/posts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idpostsposts_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCommentscomments_idpostsposts_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/posts/{posts_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idpostsposts_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentscomments_idpostsposts_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/posts/{posts_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentscomments_idcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCommentscomments_idcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCommentscomments_idcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcommentscomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCommentscomments_idcommentscomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/comments/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcommentscomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentscomments_idcommentscomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/comments/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentscomments_idcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/commentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCommentscomments_idcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/commentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCommentscomments_idcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/commentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcommentsescomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCommentscomments_idcommentsescomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/commentses/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_idcommentsescomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentscomments_idcommentsescomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}/commentses/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentscomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentscomments_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCommentscomments_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comments/{comments_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentsRestController controller = (CommentsRestController) context.getBean("CommentsRestController");

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