package com.ira.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
		@NamedQuery(name = "findAllPostss", query = "select myPosts from Posts myPosts"),
		@NamedQuery(name = "findPostsByContent", query = "select myPosts from Posts myPosts where myPosts.content = ?1"),
		@NamedQuery(name = "findPostsByContentContaining", query = "select myPosts from Posts myPosts where myPosts.content like ?1"),
		@NamedQuery(name = "findPostsById", query = "select myPosts from Posts myPosts where myPosts.id = ?1"),
		@NamedQuery(name = "findPostsByIsPrivate", query = "select myPosts from Posts myPosts where myPosts.isPrivate = ?1"),
		@NamedQuery(name = "findPostsByPrimaryKey", query = "select myPosts from Posts myPosts where myPosts.id = ?1"),
		@NamedQuery(name = "findPostsByShareDate", query = "select myPosts from Posts myPosts where myPosts.shareDate = ?1"),
		@NamedQuery(name = "findPostsByShareDateAfter", query = "select myPosts from Posts myPosts where myPosts.shareDate > ?1"),
		@NamedQuery(name = "findPostsByShareDateBefore", query = "select myPosts from Posts myPosts where myPosts.shareDate < ?1"),
		@NamedQuery(name = "findPostsByTitle", query = "select myPosts from Posts myPosts where myPosts.title = ?1"),
		@NamedQuery(name = "findPostsByTitleContaining", query = "select myPosts from Posts myPosts where myPosts.title like ?1") })
@Table(catalog = "ira2015", name = "Posts")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "IRA/com/ira/domain", name = "Posts")
@XmlRootElement(namespace = "IRA/com/ira/domain")
public class Posts implements Serializable {
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

	@Column(name = "title", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String title;
	/**
	 */

	@Column(name = "content", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String content;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "share_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar shareDate;
	/**
	 */

	@Column(name = "is_private", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer isPrivate;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_users", referencedColumnName = "Id") })
	@XmlTransient
	Users users;
	/**
	 */
	@OneToMany(mappedBy = "posts", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ira.domain.Comments> commentses;

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
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 */
	public void setShareDate(Calendar shareDate) {
		this.shareDate = shareDate;
	}

	/**
	 */
	public Calendar getShareDate() {
		return this.shareDate;
	}

	/**
	 */
	public void setIsPrivate(Integer isPrivate) {
		this.isPrivate = isPrivate;
	}

	/**
	 */
	public Integer getIsPrivate() {
		return this.isPrivate;
	}

	/**
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 */
	@JsonIgnore
	public Users getUsers() {
		return users;
	}

	/**
	 */
	public void setCommentses(Set<Comments> commentses) {
		this.commentses = commentses;
	}

	/**
	 */
	@JsonIgnore
	public Set<Comments> getCommentses() {
		if (commentses == null) {
			commentses = new java.util.LinkedHashSet<com.ira.domain.Comments>();
		}
		return commentses;
	}

	/**
	 */
	public Posts() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Posts that) {
		setId(that.getId());
		setTitle(that.getTitle());
		setContent(that.getContent());
		setShareDate(that.getShareDate());
		setIsPrivate(that.getIsPrivate());
		setUsers(that.getUsers());
		setCommentses(new java.util.LinkedHashSet<com.ira.domain.Comments>(that.getCommentses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("title=[").append(title).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("shareDate=[").append(shareDate).append("] ");
		buffer.append("isPrivate=[").append(isPrivate).append("] ");

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
		if (!(obj instanceof Posts))
			return false;
		Posts equalCheck = (Posts) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
