package com.ira.service;

import com.ira.dao.FriendDAO;
import com.ira.dao.UsersDAO;

import com.ira.domain.Friend;
import com.ira.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Friend entities
 * 
 */

@Service("FriendService")
@Transactional
public class FriendServiceImpl implements FriendService {

	/**
	 * DAO injected by Spring that manages Friend entities
	 * 
	 */
	@Autowired
	private FriendDAO friendDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new FriendServiceImpl.
	 *
	 */
	public FriendServiceImpl() {
	}

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	@Transactional
	public void deleteFriend(Friend friend) {
		friendDAO.remove(friend);
		friendDAO.flush();
	}

	/**
	 * Load an existing Friend entity
	 * 
	 */
	@Transactional
	public Set<Friend> loadFriends() {
		return friendDAO.findAllFriends();
	}

	/**
	 */
	@Transactional
	public Friend findFriendByPrimaryKey(Integer id) {
		return friendDAO.findFriendByPrimaryKey(id);
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public Friend deleteFriendUsersByIdUser2(Integer friend_id, Integer related_usersbyiduser2_id) {
		Friend friend = friendDAO.findFriendByPrimaryKey(friend_id, -1, -1);
		Users related_usersbyiduser2 = usersDAO.findUsersByPrimaryKey(related_usersbyiduser2_id, -1, -1);

		friend.setUsersByIdUser2(null);
		related_usersbyiduser2.getFriendsForIdUser2().remove(friend);
		friend = friendDAO.store(friend);
		friendDAO.flush();

		related_usersbyiduser2 = usersDAO.store(related_usersbyiduser2);
		usersDAO.flush();

		usersDAO.remove(related_usersbyiduser2);
		usersDAO.flush();

		return friend;
	}

	/**
	 * Return a count of all Friend entity
	 * 
	 */
	@Transactional
	public Integer countFriends() {
		return ((Long) friendDAO.createQuerySingleResult("select count(o) from Friend o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Friend entity
	 * 
	 */
	@Transactional
	public void saveFriend(Friend friend) {
		Friend existingFriend = friendDAO.findFriendByPrimaryKey(friend.getId());

		if (existingFriend != null) {
			if (existingFriend != friend) {
				existingFriend.setId(friend.getId());
			}
			friend = friendDAO.store(existingFriend);
		} else {
			friend = friendDAO.store(friend);
		}
		friendDAO.flush();
	}

	/**
	 * Return all Friend entity
	 * 
	 */
	@Transactional
	public List<Friend> findAllFriends(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Friend>(friendDAO.findAllFriends(startResult, maxRows));
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public Friend saveFriendUsersByIdUsers1(Integer id, Users related_usersbyidusers1) {
		Friend friend = friendDAO.findFriendByPrimaryKey(id, -1, -1);
		Users existingusersByIdUsers1 = usersDAO.findUsersByPrimaryKey(related_usersbyidusers1.getId());

		// copy into the existing record to preserve existing relationships
		if (existingusersByIdUsers1 != null) {
			existingusersByIdUsers1.setId(related_usersbyidusers1.getId());
			existingusersByIdUsers1.setLogin(related_usersbyidusers1.getLogin());
			existingusersByIdUsers1.setPassword(related_usersbyidusers1.getPassword());
			existingusersByIdUsers1.setRole(related_usersbyidusers1.getRole());
			existingusersByIdUsers1.setIsEnabled(related_usersbyidusers1.getIsEnabled());
			related_usersbyidusers1 = existingusersByIdUsers1;
		}

		friend.setUsersByIdUsers1(related_usersbyidusers1);
		related_usersbyidusers1.getFriendsForIdUsers1().add(friend);
		friend = friendDAO.store(friend);
		friendDAO.flush();

		related_usersbyidusers1 = usersDAO.store(related_usersbyidusers1);
		usersDAO.flush();

		return friend;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public Friend saveFriendUsersByIdUser2(Integer id, Users related_usersbyiduser2) {
		Friend friend = friendDAO.findFriendByPrimaryKey(id, -1, -1);
		Users existingusersByIdUser2 = usersDAO.findUsersByPrimaryKey(related_usersbyiduser2.getId());

		// copy into the existing record to preserve existing relationships
		if (existingusersByIdUser2 != null) {
			existingusersByIdUser2.setId(related_usersbyiduser2.getId());
			existingusersByIdUser2.setLogin(related_usersbyiduser2.getLogin());
			existingusersByIdUser2.setPassword(related_usersbyiduser2.getPassword());
			existingusersByIdUser2.setRole(related_usersbyiduser2.getRole());
			existingusersByIdUser2.setIsEnabled(related_usersbyiduser2.getIsEnabled());
			related_usersbyiduser2 = existingusersByIdUser2;
		}

		friend.setUsersByIdUser2(related_usersbyiduser2);
		related_usersbyiduser2.getFriendsForIdUser2().add(friend);
		friend = friendDAO.store(friend);
		friendDAO.flush();

		related_usersbyiduser2 = usersDAO.store(related_usersbyiduser2);
		usersDAO.flush();

		return friend;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public Friend deleteFriendUsersByIdUsers1(Integer friend_id, Integer related_usersbyidusers1_id) {
		Friend friend = friendDAO.findFriendByPrimaryKey(friend_id, -1, -1);
		Users related_usersbyidusers1 = usersDAO.findUsersByPrimaryKey(related_usersbyidusers1_id, -1, -1);

		friend.setUsersByIdUsers1(null);
		related_usersbyidusers1.getFriendsForIdUsers1().remove(friend);
		friend = friendDAO.store(friend);
		friendDAO.flush();

		related_usersbyidusers1 = usersDAO.store(related_usersbyidusers1);
		usersDAO.flush();

		usersDAO.remove(related_usersbyidusers1);
		usersDAO.flush();

		return friend;
	}
}
