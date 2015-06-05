package com.ira.dao;

import com.ira.domain.Users;

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
 * DAO to manage Users entities.
 * 
 */
@Repository("UsersDAO")
@Transactional
public class UsersDAOImpl extends AbstractJpaDao<Users> implements UsersDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Users.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsersDAOImpl
	 *
	 */
	public UsersDAOImpl() {
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
	 * JPQL Query - findUsersById
	 *
	 */
	@Transactional
	public Users findUsersById(Integer id) throws DataAccessException {

		return findUsersById(id, -1, -1);
	}

	/**
	 * JPQL Query - findUsersById
	 *
	 */

	@Transactional
	public Users findUsersById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersById", startResult, maxRows, id);
			return (com.ira.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password) throws DataAccessException {

		return findUsersByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByRole
	 *
	 */
	@Transactional
	public Set<Users> findUsersByRole(String role) throws DataAccessException {

		return findUsersByRole(role, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByRole
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByRole(String role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByRole", startResult, maxRows, role);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPassword(String password) throws DataAccessException {

		return findUsersByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByLoginContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByLoginContaining(String login) throws DataAccessException {

		return findUsersByLoginContaining(login, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByLoginContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByLoginContaining(String login, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByLoginContaining", startResult, maxRows, login);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByLogin
	 *
	 */
	@Transactional
	public Set<Users> findUsersByLogin(String login) throws DataAccessException {

		return findUsersByLogin(login, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByLogin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByLogin(String login, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByLogin", startResult, maxRows, login);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByRoleContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByRoleContaining(String role) throws DataAccessException {

		return findUsersByRoleContaining(role, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByRoleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByRoleContaining(String role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByRoleContaining", startResult, maxRows, role);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	@Transactional
	public Set<Users> findAllUserss() throws DataAccessException {

		return findAllUserss(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserss", startResult, maxRows);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	@Transactional
	public Users findUsersByPrimaryKey(Integer id) throws DataAccessException {

		return findUsersByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */

	@Transactional
	public Users findUsersByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersByPrimaryKey", startResult, maxRows, id);
			return (com.ira.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByIsEnabled
	 *
	 */
	@Transactional
	public Set<Users> findUsersByIsEnabled(Integer isEnabled) throws DataAccessException {

		return findUsersByIsEnabled(isEnabled, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByIsEnabled
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByIsEnabled(Integer isEnabled, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByIsEnabled", startResult, maxRows, isEnabled);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Users entity) {
		return true;
	}
}
