package com.ira.service;

import com.ira.domain.Friend;
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
public class UsersServiceTest {

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
	protected UsersService service;

	/**
	 * Instantiates a new UsersServiceTest.
	 *
	 */
	public UsersServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Friend entity
	 * 
	 */
	@Test
	public void deleteUsersFriendsForIdUser2() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsersFriendsForIdUser2 
		Integer users_id = 0;
		Integer related_friendsforiduser2_id = 0;
		Users response = null;
		response = service.deleteUsersFriendsForIdUser2(users_id, related_friendsforiduser2_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsersFriendsForIdUser2
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Posts entity
	 * 
	 */
	@Test
	public void deleteUsersPostses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsersPostses 
		Integer users_id_1 = 0;
		Integer related_postses_id = 0;
		Users response = null;
		response = service.deleteUsersPostses(users_id_1, related_postses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsersPostses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void saveUsers() {
		// TODO: JUnit - Populate test inputs for operation: saveUsers 
		Users users = new com.ira.domain.Users();
		service.saveUsers(users);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Friend entity
	 * 
	 */
	@Test
	public void saveUsersFriendsForIdUser2() {
		// TODO: JUnit - Populate test inputs for operation: saveUsersFriendsForIdUser2 
		Integer id = 0;
		Friend related_friendsforiduser2 = new com.ira.domain.Friend();
		Users response = null;
		response = service.saveUsersFriendsForIdUser2(id, related_friendsforiduser2);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsersFriendsForIdUser2
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUsersByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUsersByPrimaryKey 
		Integer id_1 = 0;
		Users response = null;
		response = service.findUsersByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findUsersByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Users entity
	 * 
	 */
	@Test
	public void loadUserss() {
		Set<Users> response = null;
		response = service.loadUserss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUserss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Friend entity
	 * 
	 */
	@Test
	public void saveUsersFriendsForIdUsers1() {
		// TODO: JUnit - Populate test inputs for operation: saveUsersFriendsForIdUsers1 
		Integer id_2 = 0;
		Friend related_friendsforidusers1 = new com.ira.domain.Friend();
		Users response = null;
		response = service.saveUsersFriendsForIdUsers1(id_2, related_friendsforidusers1);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsersFriendsForIdUsers1
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deleteUsers() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsers 
		Users users_1 = new com.ira.domain.Users();
		service.deleteUsers(users_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Users entity
	 * 
	 */
	@Test
	public void countUserss() {
		Integer response = null;
		response = service.countUserss();
		// TODO: JUnit - Add assertions to test outputs of operation: countUserss
	}

	/**
	 * Operation Unit Test
	 * Return all Users entity
	 * 
	 */
	@Test
	public void findAllUserss() {
		// TODO: JUnit - Populate test inputs for operation: findAllUserss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Users> response = null;
		response = service.findAllUserss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUserss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Friend entity
	 * 
	 */
	@Test
	public void deleteUsersFriendsForIdUsers1() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsersFriendsForIdUsers1 
		Integer users_id_2 = 0;
		Integer related_friendsforidusers1_id = 0;
		Users response = null;
		response = service.deleteUsersFriendsForIdUsers1(users_id_2, related_friendsforidusers1_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsersFriendsForIdUsers1
	}

	/**
	 * Operation Unit Test
	 * Save an existing Posts entity
	 * 
	 */
	@Test
	public void saveUsersPostses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsersPostses 
		Integer id_3 = 0;
		Posts related_postses = new com.ira.domain.Posts();
		Users response = null;
		response = service.saveUsersPostses(id_3, related_postses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsersPostses
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
