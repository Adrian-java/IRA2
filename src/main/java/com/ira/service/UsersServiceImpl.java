package com.ira.service;

import com.ira.dao.FriendDAO;
import com.ira.dao.PostsDAO;
import com.ira.dao.UsersDAO;

import com.ira.domain.Friend;
import com.ira.domain.Posts;
import com.ira.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */

@Service("UsersService")
@Transactional
public class UsersServiceImpl implements UsersService {

	/**
	 * DAO injected by Spring that manages Friend entities
	 * 
	 */
	@Autowired
	private FriendDAO friendDAO;

	/**
	 * DAO injected by Spring that manages Posts entities
	 * 
	 */
	@Autowired
	private PostsDAO postsDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new UsersServiceImpl.
	 *
	 */
	public UsersServiceImpl() {
	}

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	@Transactional
	public Users deleteUsersFriendsForIdUser2(Integer users_id, Integer related_friendsforiduser2_id) {
		Friend related_friendsforiduser2 = friendDAO.findFriendByPrimaryKey(related_friendsforiduser2_id, -1, -1);

		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		related_friendsforiduser2.setUsersByIdUser2(null);
		users.getFriendsForIdUser2().remove(related_friendsforiduser2);

		friendDAO.remove(related_friendsforiduser2);
		friendDAO.flush();

		return users;
	}

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	@Transactional
	public Users deleteUsersPostses(Integer users_id, Integer related_postses_id) {
		Posts related_postses = postsDAO.findPostsByPrimaryKey(related_postses_id, -1, -1);

		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		related_postses.setUsers(null);
		users.getPostses().remove(related_postses);

		postsDAO.remove(related_postses);
		postsDAO.flush();

		return users;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public void saveUsers(Users users) {
		Users existingUsers = usersDAO.findUsersByPrimaryKey(users.getId());

		if (existingUsers != null) {
			if (existingUsers != users) {
				existingUsers.setId(users.getId());
				existingUsers.setLogin(users.getLogin());
				existingUsers.setPassword(users.getPassword());
				existingUsers.setRole(users.getRole());
				existingUsers.setIsEnabled(users.getIsEnabled());
			}
			users = usersDAO.store(existingUsers);
		} else {
			users = usersDAO.store(users);
		}
		usersDAO.flush();
	}

	/**
	 * Save an existing Friend entity
	 * 
	 */
	@Transactional
	public Users saveUsersFriendsForIdUser2(Integer id, Friend related_friendsforiduser2) {
		Users users = usersDAO.findUsersByPrimaryKey(id, -1, -1);
		Friend existingfriendsForIdUser2 = friendDAO.findFriendByPrimaryKey(related_friendsforiduser2.getId());

		// copy into the existing record to preserve existing relationships
		if (existingfriendsForIdUser2 != null) {
			existingfriendsForIdUser2.setId(related_friendsforiduser2.getId());
			related_friendsforiduser2 = existingfriendsForIdUser2;
		}

		related_friendsforiduser2.setUsersByIdUser2(users);
		users.getFriendsForIdUser2().add(related_friendsforiduser2);
		related_friendsforiduser2 = friendDAO.store(related_friendsforiduser2);
		friendDAO.flush();

		users = usersDAO.store(users);
		usersDAO.flush();

		return users;
	}

	/**
	 */
	@Transactional
	public Users findUsersByPrimaryKey(Integer id) {
		return usersDAO.findUsersByPrimaryKey(id);
	}

	/**
	 * Load an existing Users entity
	 * 
	 */
	@Transactional
	public Set<Users> loadUserss() {
		return usersDAO.findAllUserss();
	}

	/**
	 * Save an existing Friend entity
	 * 
	 */
	@Transactional
	public Users saveUsersFriendsForIdUsers1(Integer id, Friend related_friendsforidusers1) {
		Users users = usersDAO.findUsersByPrimaryKey(id, -1, -1);
		Friend existingfriendsForIdUsers1 = friendDAO.findFriendByPrimaryKey(related_friendsforidusers1.getId());

		// copy into the existing record to preserve existing relationships
		if (existingfriendsForIdUsers1 != null) {
			existingfriendsForIdUsers1.setId(related_friendsforidusers1.getId());
			related_friendsforidusers1 = existingfriendsForIdUsers1;
		}

		related_friendsforidusers1.setUsersByIdUser2(users);
		users.getFriendsForIdUser2().add(related_friendsforidusers1);
		related_friendsforidusers1 = friendDAO.store(related_friendsforidusers1);
		friendDAO.flush();

		users = usersDAO.store(users);
		usersDAO.flush();

		return users;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public void deleteUsers(Users users) {
		usersDAO.remove(users);
		usersDAO.flush();
	}

	/**
	 * Return a count of all Users entity
	 * 
	 */
	@Transactional
	public Integer countUserss() {
		return ((Long) usersDAO.createQuerySingleResult("select count(o) from Users o").getSingleResult()).intValue();
	}

	/**
	 * Return all Users entity
	 * 
	 */
	@Transactional
	public List<Users> findAllUserss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Users>(usersDAO.findAllUserss(startResult, maxRows));
	}

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	@Transactional
	public Users deleteUsersFriendsForIdUsers1(Integer users_id, Integer related_friendsforidusers1_id) {
		Friend related_friendsforidusers1 = friendDAO.findFriendByPrimaryKey(related_friendsforidusers1_id, -1, -1);

		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		related_friendsforidusers1.setUsersByIdUser2(null);
		users.getFriendsForIdUser2().remove(related_friendsforidusers1);

		friendDAO.remove(related_friendsforidusers1);
		friendDAO.flush();

		return users;
	}

	/**
	 * Save an existing Posts entity
	 * 
	 */
	@Transactional
	public Users saveUsersPostses(Integer id, Posts related_postses) {
		Users users = usersDAO.findUsersByPrimaryKey(id, -1, -1);
		Posts existingpostses = postsDAO.findPostsByPrimaryKey(related_postses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingpostses != null) {
			existingpostses.setId(related_postses.getId());
			existingpostses.setTitle(related_postses.getTitle());
			existingpostses.setContent(related_postses.getContent());
			existingpostses.setShareDate(related_postses.getShareDate());
			existingpostses.setIsPrivate(related_postses.getIsPrivate());
			related_postses = existingpostses;
		} else {
			related_postses = postsDAO.store(related_postses);
			postsDAO.flush();
		}

		related_postses.setUsers(users);
		users.getPostses().add(related_postses);
		related_postses = postsDAO.store(related_postses);
		postsDAO.flush();

		users = usersDAO.store(users);
		usersDAO.flush();

		return users;
	}
}
