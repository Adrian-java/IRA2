package com.ira.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllFriends", query = "select myFriend from Friend myFriend"),
		@NamedQuery(name = "findFriendById", query = "select myFriend from Friend myFriend where myFriend.id = ?1"),
		@NamedQuery(name = "findFriendByPrimaryKey", query = "select myFriend from Friend myFriend where myFriend.id = ?1") })
@Table(catalog = "ira2015", name = "Friend")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "IRA/com/ira/domain", name = "Friend")
public class Friend implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_user2", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Users usersByIdUser2;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_users1", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Users usersByIdUsers1;

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
	public void setUsersByIdUser2(Users usersByIdUser2) {
		this.usersByIdUser2 = usersByIdUser2;
	}

	/**
	 */
	@JsonIgnore
	public Users getUsersByIdUser2() {
		return usersByIdUser2;
	}

	/**
	 */
	public void setUsersByIdUsers1(Users usersByIdUsers1) {
		this.usersByIdUsers1 = usersByIdUsers1;
	}

	/**
	 */
	@JsonIgnore
	public Users getUsersByIdUsers1() {
		return usersByIdUsers1;
	}

	/**
	 */
	public Friend() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Friend that) {
		setId(that.getId());
		setUsersByIdUser2(that.getUsersByIdUser2());
		setUsersByIdUsers1(that.getUsersByIdUsers1());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");

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
		if (!(obj instanceof Friend))
			return false;
		Friend equalCheck = (Friend) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
