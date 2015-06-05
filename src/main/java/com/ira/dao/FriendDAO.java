package com.ira.dao;

import com.ira.domain.Friend;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Friend entities.
 * 
 */
public interface FriendDAO extends JpaDao<Friend> {

	/**
	 * JPQL Query - findFriendById
	 *
	 */
	public Friend findFriendById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findFriendById
	 *
	 */
	public Friend findFriendById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllFriends
	 *
	 */
	public Set<Friend> findAllFriends() throws DataAccessException;

	/**
	 * JPQL Query - findAllFriends
	 *
	 */
	public Set<Friend> findAllFriends(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findFriendByPrimaryKey
	 *
	 */
	public Friend findFriendByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findFriendByPrimaryKey
	 *
	 */
	public Friend findFriendByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}