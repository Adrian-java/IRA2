package com.ira.dao;

import com.ira.domain.Friend;

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
 * DAO to manage Friend entities.
 * 
 */
@Repository("FriendDAO")
@Transactional
public class FriendDAOImpl extends AbstractJpaDao<Friend> implements FriendDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Friend.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new FriendDAOImpl
	 *
	 */
	public FriendDAOImpl() {
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
	 * JPQL Query - findFriendById
	 *
	 */
	@Transactional
	public Friend findFriendById(Integer id) throws DataAccessException {

		return findFriendById(id, -1, -1);
	}

	/**
	 * JPQL Query - findFriendById
	 *
	 */

	@Transactional
	public Friend findFriendById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findFriendById", startResult, maxRows, id);
			return (com.ira.domain.Friend) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllFriends
	 *
	 */
	@Transactional
	public Set<Friend> findAllFriends() throws DataAccessException {

		return findAllFriends(-1, -1);
	}

	/**
	 * JPQL Query - findAllFriends
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Friend> findAllFriends(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllFriends", startResult, maxRows);
		return new LinkedHashSet<Friend>(query.getResultList());
	}

	/**
	 * JPQL Query - findFriendByPrimaryKey
	 *
	 */
	@Transactional
	public Friend findFriendByPrimaryKey(Integer id) throws DataAccessException {

		return findFriendByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findFriendByPrimaryKey
	 *
	 */

	@Transactional
	public Friend findFriendByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findFriendByPrimaryKey", startResult, maxRows, id);
			return (com.ira.domain.Friend) query.getSingleResult();
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
	public boolean canBeMerged(Friend entity) {
		return true;
	}
}
