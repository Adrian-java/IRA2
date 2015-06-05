package com.ira.dao;

import com.ira.domain.Comments;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Comments entities.
 * 
 */
public interface CommentsDAO extends JpaDao<Comments> {

	/**
	 * JPQL Query - findCommentsByCommentDate
	 *
	 */
	public Set<Comments> findCommentsByCommentDate(java.util.Calendar commentDate) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByCommentDate
	 *
	 */
	public Set<Comments> findCommentsByCommentDate(Calendar commentDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByCommentDateAfter
	 *
	 */
	public Set<Comments> findCommentsByCommentDateAfter(java.util.Calendar commentDate_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByCommentDateAfter
	 *
	 */
	public Set<Comments> findCommentsByCommentDateAfter(Calendar commentDate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsById
	 *
	 */
	public Comments findCommentsById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsById
	 *
	 */
	public Comments findCommentsById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByContent
	 *
	 */
	public Set<Comments> findCommentsByContent(String content) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByContent
	 *
	 */
	public Set<Comments> findCommentsByContent(String content, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByPrimaryKey
	 *
	 */
	public Comments findCommentsByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByPrimaryKey
	 *
	 */
	public Comments findCommentsByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCommentss
	 *
	 */
	public Set<Comments> findAllCommentss() throws DataAccessException;

	/**
	 * JPQL Query - findAllCommentss
	 *
	 */
	public Set<Comments> findAllCommentss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByContentContaining
	 *
	 */
	public Set<Comments> findCommentsByContentContaining(String content_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByContentContaining
	 *
	 */
	public Set<Comments> findCommentsByContentContaining(String content_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByCommentDateBefore
	 *
	 */
	public Set<Comments> findCommentsByCommentDateBefore(java.util.Calendar commentDate_2) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByCommentDateBefore
	 *
	 */
	public Set<Comments> findCommentsByCommentDateBefore(Calendar commentDate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByIsResponse
	 *
	 */
	public Set<Comments> findCommentsByIsResponse(Integer isResponse) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByIsResponse
	 *
	 */
	public Set<Comments> findCommentsByIsResponse(Integer isResponse, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByShowCounter
	 *
	 */
	public Set<Comments> findCommentsByShowCounter(Integer showCounter) throws DataAccessException;

	/**
	 * JPQL Query - findCommentsByShowCounter
	 *
	 */
	public Set<Comments> findCommentsByShowCounter(Integer showCounter, int startResult, int maxRows) throws DataAccessException;

}