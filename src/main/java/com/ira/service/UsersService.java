package com.ira.service;

import com.ira.domain.Friend;
import com.ira.domain.Posts;
import com.ira.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */
public interface UsersService {

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	public Users deleteUsersFriendsForIdUser2(Integer users_id, Integer related_friendsforiduser2_id);

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	public Users deleteUsersPostses(Integer users_id_1, Integer related_postses_id);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public void saveUsers(Users users);

	/**
	 * Save an existing Friend entity
	 * 
	 */
	public Users saveUsersFriendsForIdUser2(Integer id, Friend related_friendsforiduser2);

	/**
	 */
	public Users findUsersByPrimaryKey(Integer id_1);

	/**
	 * Load an existing Users entity
	 * 
	 */
	public Set<Users> loadUserss();

	/**
	 * Save an existing Friend entity
	 * 
	 */
	public Users saveUsersFriendsForIdUsers1(Integer id_2, Friend related_friendsforidusers1);

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public void deleteUsers(Users users_1);

	/**
	 * Return a count of all Users entity
	 * 
	 */
	public Integer countUserss();

	/**
	 * Return all Users entity
	 * 
	 */
	public List<Users> findAllUserss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	public Users deleteUsersFriendsForIdUsers1(Integer users_id_2, Integer related_friendsforidusers1_id);

	/**
	 * Save an existing Posts entity
	 * 
	 */
	public Users saveUsersPostses(Integer id_3, Posts related_postses);
}