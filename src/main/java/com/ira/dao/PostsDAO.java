package com.ira.dao;

import com.ira.domain.Posts;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Posts entities.
 * 
 */
public interface PostsDAO extends JpaDao<Posts> {

	/**
	 * JPQL Query - findPostsByTitle
	 *
	 */
	public Set<Posts> findPostsByTitle(String title) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByTitle
	 *
	 */
	public Set<Posts> findPostsByTitle(String title, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByShareDateAfter
	 *
	 */
	public Set<Posts> findPostsByShareDateAfter(java.util.Calendar shareDate) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByShareDateAfter
	 *
	 */
	public Set<Posts> findPostsByShareDateAfter(Calendar shareDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByIsPrivate
	 *
	 */
	public Set<Posts> findPostsByIsPrivate(Integer isPrivate) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByIsPrivate
	 *
	 */
	public Set<Posts> findPostsByIsPrivate(Integer isPrivate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByTitleContaining
	 *
	 */
	public Set<Posts> findPostsByTitleContaining(String title_1) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByTitleContaining
	 *
	 */
	public Set<Posts> findPostsByTitleContaining(String title_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsById
	 *
	 */
	public Posts findPostsById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findPostsById
	 *
	 */
	public Posts findPostsById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByContent
	 *
	 */
	public Set<Posts> findPostsByContent(String content) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByContent
	 *
	 */
	public Set<Posts> findPostsByContent(String content, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByContentContaining
	 *
	 */
	public Set<Posts> findPostsByContentContaining(String content_1) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByContentContaining
	 *
	 */
	public Set<Posts> findPostsByContentContaining(String content_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByShareDateBefore
	 *
	 */
	public Set<Posts> findPostsByShareDateBefore(java.util.Calendar shareDate_1) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByShareDateBefore
	 *
	 */
	public Set<Posts> findPostsByShareDateBefore(Calendar shareDate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPostss
	 *
	 */
	public Set<Posts> findAllPostss() throws DataAccessException;

	/**
	 * JPQL Query - findAllPostss
	 *
	 */
	public Set<Posts> findAllPostss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByShareDate
	 *
	 */
	public Set<Posts> findPostsByShareDate(java.util.Calendar shareDate_2) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByShareDate
	 *
	 */
	public Set<Posts> findPostsByShareDate(Calendar shareDate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByPrimaryKey
	 *
	 */
	public Posts findPostsByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findPostsByPrimaryKey
	 *
	 */
	public Posts findPostsByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}