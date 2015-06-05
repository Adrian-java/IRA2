package com.ira.service;

import com.ira.domain.Friend;
import com.ira.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Friend entities
 * 
 */
public interface FriendService {

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	public void deleteFriend(Friend friend);

	/**
	 * Load an existing Friend entity
	 * 
	 */
	public Set<Friend> loadFriends();

	/**
	 */
	public Friend findFriendByPrimaryKey(Integer id);

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public Friend deleteFriendUsersByIdUser2(Integer friend_id, Integer related_usersbyiduser2_id);

	/**
	 * Return a count of all Friend entity
	 * 
	 */
	public Integer countFriends();

	/**
	 * Save an existing Friend entity
	 * 
	 */
	public void saveFriend(Friend friend_1);

	/**
	 * Return all Friend entity
	 * 
	 */
	public List<Friend> findAllFriends(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public Friend saveFriendUsersByIdUsers1(Integer id_1, Users related_usersbyidusers1);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public Friend saveFriendUsersByIdUser2(Integer id_2, Users related_usersbyiduser2);

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public Friend deleteFriendUsersByIdUsers1(Integer friend_id_1, Integer related_usersbyidusers1_id);
}