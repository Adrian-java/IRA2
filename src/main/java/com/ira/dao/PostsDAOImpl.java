package com.ira.dao;

import com.ira.domain.Posts;

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
 * DAO to manage Posts entities.
 * 
 */
@Repository("PostsDAO")
@Transactional
public class PostsDAOImpl extends AbstractJpaDao<Posts> implements PostsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Posts.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PostsDAOImpl
	 *
	 */
	public PostsDAOImpl() {
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
	 * JPQL Query - findPostsByTitle
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByTitle(String title) throws DataAccessException {

		return findPostsByTitle(title, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByTitle(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByTitle", startResult, maxRows, title);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsByShareDateAfter
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByShareDateAfter(java.util.Calendar shareDate) throws DataAccessException {

		return findPostsByShareDateAfter(shareDate, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByShareDateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByShareDateAfter(java.util.Calendar shareDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByShareDateAfter", startResult, maxRows, shareDate);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsByIsPrivate
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByIsPrivate(Integer isPrivate) throws DataAccessException {

		return findPostsByIsPrivate(isPrivate, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByIsPrivate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByIsPrivate(Integer isPrivate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByIsPrivate", startResult, maxRows, isPrivate);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsByTitleContaining
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByTitleContaining(String title) throws DataAccessException {

		return findPostsByTitleContaining(title, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByTitleContaining", startResult, maxRows, title);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsById
	 *
	 */
	@Transactional
	public Posts findPostsById(Integer id) throws DataAccessException {

		return findPostsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findPostsById
	 *
	 */

	@Transactional
	public Posts findPostsById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPostsById", startResult, maxRows, id);
			return (com.ira.domain.Posts) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPostsByContent
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByContent(String content) throws DataAccessException {

		return findPostsByContent(content, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByContent(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByContent", startResult, maxRows, content);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsByContentContaining
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByContentContaining(String content) throws DataAccessException {

		return findPostsByContentContaining(content, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByContentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByContentContaining(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByContentContaining", startResult, maxRows, content);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsByShareDateBefore
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByShareDateBefore(java.util.Calendar shareDate) throws DataAccessException {

		return findPostsByShareDateBefore(shareDate, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByShareDateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByShareDateBefore(java.util.Calendar shareDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByShareDateBefore", startResult, maxRows, shareDate);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllPostss
	 *
	 */
	@Transactional
	public Set<Posts> findAllPostss() throws DataAccessException {

		return findAllPostss(-1, -1);
	}

	/**
	 * JPQL Query - findAllPostss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findAllPostss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPostss", startResult, maxRows);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsByShareDate
	 *
	 */
	@Transactional
	public Set<Posts> findPostsByShareDate(java.util.Calendar shareDate) throws DataAccessException {

		return findPostsByShareDate(shareDate, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByShareDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Posts> findPostsByShareDate(java.util.Calendar shareDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostsByShareDate", startResult, maxRows, shareDate);
		return new LinkedHashSet<Posts>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostsByPrimaryKey
	 *
	 */
	@Transactional
	public Posts findPostsByPrimaryKey(Integer id) throws DataAccessException {

		return findPostsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findPostsByPrimaryKey
	 *
	 */

	@Transactional
	public Posts findPostsByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPostsByPrimaryKey", startResult, maxRows, id);
			return (com.ira.domain.Posts) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Posts entity) {
		return true;
	}
}
