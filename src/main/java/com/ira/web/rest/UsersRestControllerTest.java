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
 * Unit test for the <code>UsersRestController</code> controller.
 *
 * @see com.ira.web.rest.UsersRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/IRA-security-context.xml",
		"file:./src/main/resources/IRA-service-context.xml",
		"file:./src/main/resources/IRA-dao-context.xml",
		"file:./src/main/resources/IRA-web-context.xml" })
public class UsersRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Usersusers_idfriendsForIdUser2()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idfriendsForIdUser2() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUser2");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUser2()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsersusers_idfriendsForIdUser2() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUser2");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUser2()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsersusers_idfriendsForIdUser2() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUser2");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUser2friend_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_idfriendsForIdUser2friend_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUser2/{friend_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUser2friend_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idfriendsForIdUser2friend_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUser2/{friend_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idpostses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idpostses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/postses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idpostses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsersusers_idpostses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/postses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idpostses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsersusers_idpostses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/postses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idpostsesposts_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_idpostsesposts_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/postses/{posts_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idpostsesposts_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idpostsesposts_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/postses/{posts_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUsers1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idfriendsForIdUsers1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUsers1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUsers1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsersusers_idfriendsForIdUsers1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUsers1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUsers1()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsersusers_idfriendsForIdUsers1() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUsers1");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUsers1friend_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_idfriendsForIdUsers1friend_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUsers1/{friend_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idfriendsForIdUsers1friend_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idfriendsForIdUsers1friend_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/friendsForIdUsers1/{friend_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

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