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
 * Unit test for the <code>FriendRestController</code> controller.
 *
 * @see com.ira.web.rest.FriendRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/IRA-security-context.xml",
		"file:./src/main/resources/IRA-service-context.xml",
		"file:./src/main/resources/IRA-dao-context.xml",
		"file:./src/main/resources/IRA-web-context.xml" })
public class FriendRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Friendfriend_idusersByIdUser2()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFriendfriend_idusersByIdUser2() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUser2");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUser2()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostFriendfriend_idusersByIdUser2() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUser2");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUser2()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutFriendfriend_idusersByIdUser2() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUser2");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUser2users_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteFriendfriend_idusersByIdUser2users_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUser2/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUser2users_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFriendfriend_idusersByIdUser2users_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUser2/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUsers1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFriendfriend_idusersByIdUsers1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUsers1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUsers1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostFriendfriend_idusersByIdUsers1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUsers1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUsers1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutFriendfriend_idusersByIdUsers1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUsers1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUsers1users_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteFriendfriend_idusersByIdUsers1users_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUsers1/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_idusersByIdUsers1users_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFriendfriend_idusersByIdUsers1users_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}/usersByIdUsers1/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friend()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFriend() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFriendfriend_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friend()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutFriend() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friend()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostFriend() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Friendfriend_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteFriendfriend_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Friend/{friend_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FriendRestController controller = (FriendRestController) context.getBean("FriendRestController");

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