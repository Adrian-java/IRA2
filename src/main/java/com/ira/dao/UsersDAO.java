package com.ira.dao;

import com.ira.domain.Users;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Users entities.
 * 
 */
public interface UsersDAO extends JpaDao<Users> {

	/**
	 * JPQL Query - findUsersById
	 *
	 */
	public Users findUsersById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findUsersById
	 *
	 */
	public Users findUsersById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	public Set<Users> findUsersByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	public Set<Users> findUsersByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByRole
	 *
	 */
	public Set<Users> findUsersByRole(String role) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByRole
	 *
	 */
	public Set<Users> findUsersByRole(String role, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	public Set<Users> findUsersByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	public Set<Users> findUsersByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLoginContaining
	 *
	 */
	public Set<Users> findUsersByLoginContaining(String login) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLoginContaining
	 *
	 */
	public Set<Users> findUsersByLoginContaining(String login, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLogin
	 *
	 */
	public Set<Users> findUsersByLogin(String login_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLogin
	 *
	 */
	public Set<Users> findUsersByLogin(String login_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByRoleContaining
	 *
	 */
	public Set<Users> findUsersByRoleContaining(String role_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByRoleContaining
	 *
	 */
	public Set<Users> findUsersByRoleContaining(String role_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss() throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByIsEnabled
	 *
	 */
	public Set<Users> findUsersByIsEnabled(Integer isEnabled) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByIsEnabled
	 *
	 */
	public Set<Users> findUsersByIsEnabled(Integer isEnabled, int startResult, int maxRows) throws DataAccessException;

}