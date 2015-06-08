package com.ira.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllUserss", query = "select myUsers from Users myUsers"),
		@NamedQuery(name = "findUsersById", query = "select myUsers from Users myUsers where myUsers.id = ?1"),
		@NamedQuery(name = "findUsersByIsEnabled", query = "select myUsers from Users myUsers where myUsers.isEnabled = ?1"),
		@NamedQuery(name = "findUsersByLogin", query = "select myUsers from Users myUsers where myUsers.login = ?1"),
		@NamedQuery(name = "findUsersByLoginContaining", query = "select myUsers from Users myUsers where myUsers.login like ?1"),
		@NamedQuery(name = "findUsersByPassword", query = "select myUsers from Users myUsers where myUsers.password = ?1"),
		@NamedQuery(name = "findUsersByPasswordContaining", query = "select myUsers from Users myUsers where myUsers.password like ?1"),
		@NamedQuery(name = "findUsersByPrimaryKey", query = "select myUsers from Users myUsers where myUsers.id = ?1"),
		@NamedQuery(name = "findUsersByRole", query = "select myUsers from Users myUsers where myUsers.role = ?1"),
		@NamedQuery(name = "findUsersByRoleContaining", query = "select myUsers from Users myUsers where myUsers.role like ?1") })
@Table(catalog = "ira2015", name = "Users")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "IRA/com/ira/domain", name = "Users")
@XmlRootElement(namespace = "IRA/com/ira/domain")
public class Users implements Serializable, UserDetails {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "Id", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "login", length = 20, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String login;
	/**
	 */

	@Column(name = "password", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 */

	@Column(name = "role", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String role;
	/**
	 */

	@Column(name = "is_enabled")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer isEnabled;

	/**
	 */
	@OneToMany(mappedBy = "usersByIdUser2", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ira.domain.Friend> friendsForIdUser2;
	/**
	 */
	@OneToMany(mappedBy = "users", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ira.domain.Posts> postses;
	/**
	 */
	@OneToMany(mappedBy = "usersByIdUser2", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ira.domain.Friend> friendsForIdUsers1;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 */
	public String getRole() {
		return this.role;
	}

	/**
	 */
	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 */
	public Integer getIsEnabled() {
		return this.isEnabled;
	}

	/**
	 */
	public void setFriendsForIdUser2(Set<Friend> friendsForIdUser2) {
		this.friendsForIdUser2 = friendsForIdUser2;
	}

	/**
	 */
	@JsonIgnore
	public Set<Friend> getFriendsForIdUser2() {
		if (friendsForIdUser2 == null) {
			friendsForIdUser2 = new java.util.LinkedHashSet<com.ira.domain.Friend>();
		}
		return friendsForIdUser2;
	}

	/**
	 */
	public void setPostses(Set<Posts> postses) {
		this.postses = postses;
	}

	/**
	 */
	@JsonIgnore
	public Set<Posts> getPostses() {
		if (postses == null) {
			postses = new java.util.LinkedHashSet<com.ira.domain.Posts>();
		}
		return postses;
	}

	/**
	 */
	public void setFriendsForIdUsers1(Set<Friend> friendsForIdUsers1) {
		this.friendsForIdUsers1 = friendsForIdUsers1;
	}

	/**
	 */
	@JsonIgnore
	public Set<Friend> getFriendsForIdUsers1() {
		if (friendsForIdUsers1 == null) {
			friendsForIdUsers1 = new java.util.LinkedHashSet<com.ira.domain.Friend>();
		}
		return friendsForIdUsers1;
	}

	/**
	 */
	public Users() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Users that) {
		setId(that.getId());
		setLogin(that.getLogin());
		setPassword(that.getPassword());
		setRole(that.getRole());
		setIsEnabled(that.getIsEnabled());
		setFriendsForIdUser2(new java.util.LinkedHashSet<com.ira.domain.Friend>(
				that.getFriendsForIdUser2()));
		setPostses(new java.util.LinkedHashSet<com.ira.domain.Posts>(
				that.getPostses()));
		setFriendsForIdUsers1(new java.util.LinkedHashSet<com.ira.domain.Friend>(
				that.getFriendsForIdUsers1()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("login=[").append(login).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("role=[").append(role).append("] ");
		buffer.append("isEnabled=[").append(isEnabled).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Users))
			return false;
		Users equalCheck = (Users) obj;
		if ((id == null && equalCheck.id != null)
				|| (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

	@Override
	@Transient
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(role));
		return authorities;
	}

	@Override
	@Transient
	public String getUsername() {
		// TODO Auto-generated method stub
		return login;
	}

	@Override
	@Transient
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	@Transient
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	@Transient
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	@Transient
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
