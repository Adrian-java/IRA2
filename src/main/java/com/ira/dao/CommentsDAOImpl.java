package com.ira.dao;

import com.ira.domain.Comments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Comments entities.
 * 
 */
@Repository("CommentsDAO")
@Transactional
public class CommentsDAOImpl extends AbstractJpaDao<Comments> implements
		CommentsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Comments.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CommentsDAOImpl
	 *
	 */
	public CommentsDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findCommentsByCommentDate
	 *
	 */
	@Transactional
	public Set<Comments> findCommentsByCommentDate(java.util.Calendar commentDate) throws DataAccessException {

		return findCommentsByCommentDate(commentDate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByCommentDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findCommentsByCommentDate(java.util.Calendar commentDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentsByCommentDate", startResult, maxRows, commentDate);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentsByCommentDateAfter
	 *
	 */
	@Transactional
	public Set<Comments> findCommentsByCommentDateAfter(java.util.Calendar commentDate) throws DataAccessException {

		return findCommentsByCommentDateAfter(commentDate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByCommentDateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findCommentsByCommentDateAfter(java.util.Calendar commentDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentsByCommentDateAfter", startResult, maxRows, commentDate);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentsById
	 *
	 */
	@Transactional
	public Comments findCommentsById(Integer id) throws DataAccessException {

		return findCommentsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsById
	 *
	 */

	@Transactional
	public Comments findCommentsById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCommentsById", startResult, maxRows, id);
			return (com.ira.domain.Comments) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCommentsByContent
	 *
	 */
	@Transactional
	public Set<Comments> findCommentsByContent(String content) throws DataAccessException {

		return findCommentsByContent(content, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findCommentsByContent(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentsByContent", startResult, maxRows, content);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentsByPrimaryKey
	 *
	 */
	@Transactional
	public Comments findCommentsByPrimaryKey(Integer id) throws DataAccessException {

		return findCommentsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByPrimaryKey
	 *
	 */

	@Transactional
	public Comments findCommentsByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCommentsByPrimaryKey", startResult, maxRows, id);
			return (com.ira.domain.Comments) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllCommentss
	 *
	 */
	@Transactional
	public Set<Comments> findAllCommentss() throws DataAccessException {

		return findAllCommentss(-1, -1);
	}

	/**
	 * JPQL Query - findAllCommentss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findAllCommentss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCommentss", startResult, maxRows);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentsByContentContaining
	 *
	 */
	@Transactional
	public Set<Comments> findCommentsByContentContaining(String content) throws DataAccessException {

		return findCommentsByContentContaining(content, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByContentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findCommentsByContentContaining(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentsByContentContaining", startResult, maxRows, content);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentsByCommentDateBefore
	 *
	 */
	@Transactional
	public Set<Comments> findCommentsByCommentDateBefore(java.util.Calendar commentDate) throws DataAccessException {

		return findCommentsByCommentDateBefore(commentDate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByCommentDateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findCommentsByCommentDateBefore(java.util.Calendar commentDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentsByCommentDateBefore", startResult, maxRows, commentDate);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentsByIsResponse
	 *
	 */
	@Transactional
	public Set<Comments> findCommentsByIsResponse(Integer isResponse) throws DataAccessException {

		return findCommentsByIsResponse(isResponse, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByIsResponse
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findCommentsByIsResponse(Integer isResponse, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentsByIsResponse", startResult, maxRows, isResponse);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentsByShowCounter
	 *
	 */
	@Transactional
	public Set<Comments> findCommentsByShowCounter(Integer showCounter) throws DataAccessException {

		return findCommentsByShowCounter(showCounter, -1, -1);
	}

	/**
	 * JPQL Query - findCommentsByShowCounter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comments> findCommentsByShowCounter(Integer showCounter, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentsByShowCounter", startResult, maxRows, showCounter);
		return new LinkedHashSet<Comments>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Comments entity) {
		return true;
	}
}
