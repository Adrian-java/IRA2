package com.ira.service;

import com.ira.domain.Friend;
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
public class FriendServiceTest {

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
	protected FriendService service;

	/**
	 * Instantiates a new FriendServiceTest.
	 *
	 */
	public FriendServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Friend entity
	 * 
	 */
	@Test
	public void deleteFriend() {
		// TODO: JUnit - Populate test inputs for operation: deleteFriend 
		Friend friend = new com.ira.domain.Friend();
		service.deleteFriend(friend);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Friend entity
	 * 
	 */
	@Test
	public void loadFriends() {
		Set<Friend> response = null;
		response = service.loadFriends();
		// TODO: JUnit - Add assertions to test outputs of operation: loadFriends
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findFriendByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findFriendByPrimaryKey 
		Integer id = 0;
		Friend response = null;
		response = service.findFriendByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findFriendByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deleteFriendUsersByIdUser2() {
		// TODO: JUnit - Populate test inputs for operation: deleteFriendUsersByIdUser2 
		Integer friend_id = 0;
		Integer related_usersbyiduser2_id = 0;
		Friend response = null;
		response = service.deleteFriendUsersByIdUser2(friend_id, related_usersbyiduser2_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteFriendUsersByIdUser2
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Friend entity
	 * 
	 */
	@Test
	public void countFriends() {
		Integer response = null;
		response = service.countFriends();
		// TODO: JUnit - Add assertions to test outputs of operation: countFriends
	}

	/**
	 * Operation Unit Test
	 * Save an existing Friend entity
	 * 
	 */
	@Test
	public void saveFriend() {
		// TODO: JUnit - Populate test inputs for operation: saveFriend 
		Friend friend_1 = new com.ira.domain.Friend();
		service.saveFriend(friend_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Friend entity
	 * 
	 */
	@Test
	public void findAllFriends() {
		// TODO: JUnit - Populate test inputs for operation: findAllFriends 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Friend> response = null;
		response = service.findAllFriends(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllFriends
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void saveFriendUsersByIdUsers1() {
		// TODO: JUnit - Populate test inputs for operation: saveFriendUsersByIdUsers1 
		Integer id_1 = 0;
		Users related_usersbyidusers1 = new com.ira.domain.Users();
		Friend response = null;
		response = service.saveFriendUsersByIdUsers1(id_1, related_usersbyidusers1);
		// TODO: JUnit - Add assertions to test outputs of operation: saveFriendUsersByIdUsers1
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void saveFriendUsersByIdUser2() {
		// TODO: JUnit - Populate test inputs for operation: saveFriendUsersByIdUser2 
		Integer id_2 = 0;
		Users related_usersbyiduser2 = new com.ira.domain.Users();
		Friend response = null;
		response = service.saveFriendUsersByIdUser2(id_2, related_usersbyiduser2);
		// TODO: JUnit - Add assertions to test outputs of operation: saveFriendUsersByIdUser2
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deleteFriendUsersByIdUsers1() {
		// TODO: JUnit - Populate test inputs for operation: deleteFriendUsersByIdUsers1 
		Integer friend_id_1 = 0;
		Integer related_usersbyidusers1_id = 0;
		Friend response = null;
		response = service.deleteFriendUsersByIdUsers1(friend_id_1, related_usersbyidusers1_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteFriendUsersByIdUsers1
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
