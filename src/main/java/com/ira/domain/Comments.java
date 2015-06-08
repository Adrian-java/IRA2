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
		@NamedQuery(name = "findAllCommentss", query = "select myComments from Comments myComments"),
		@NamedQuery(name = "findCommentsByCommentDate", query = "select myComments from Comments myComments where myComments.commentDate = ?1"),
		@NamedQuery(name = "findCommentsByCommentDateAfter", query = "select myComments from Comments myComments where myComments.commentDate > ?1"),
		@NamedQuery(name = "findCommentsByCommentDateBefore", query = "select myComments from Comments myComments where myComments.commentDate < ?1"),
		@NamedQuery(name = "findCommentsByContent", query = "select myComments from Comments myComments where myComments.content = ?1"),
		@NamedQuery(name = "findCommentsByContentContaining", query = "select myComments from Comments myComments where myComments.content like ?1"),
		@NamedQuery(name = "findCommentsById", query = "select myComments from Comments myComments where myComments.id = ?1"),
		@NamedQuery(name = "findCommentsByIsResponse", query = "select myComments from Comments myComments where myComments.isResponse = ?1"),
		@NamedQuery(name = "findCommentsByPrimaryKey", query = "select myComments from Comments myComments where myComments.id = ?1"),
		@NamedQuery(name = "findCommentsByShowCounter", query = "select myComments from Comments myComments where myComments.showCounter = ?1") })
@Table(catalog = "ira2015", name = "Comments")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "IRA/com/ira/domain", name = "Comments")
@XmlRootElement(namespace = "IRA/com/ira/domain")
public class Comments implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "content", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String content;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "comment_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar commentDate;
	/**
	 */

	@Column(name = "is_response", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer isResponse;
	/**
	 */

	@Column(name = "show_counter", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer showCounter;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_post", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Posts posts;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_response", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Comments comments;
	/**
	 */
	@OneToMany(mappedBy = "comments", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
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
	public void setCommentDate(Calendar commentDate) {
		this.commentDate = commentDate;
	}

	/**
	 */
	public Calendar getCommentDate() {
		return this.commentDate;
	}

	/**
	 */
	public void setIsResponse(Integer isResponse) {
		this.isResponse = isResponse;
	}

	/**
	 */
	public Integer getIsResponse() {
		return this.isResponse;
	}

	/**
	 */
	public void setShowCounter(Integer showCounter) {
		this.showCounter = showCounter;
	}

	/**
	 */
	public Integer getShowCounter() {
		return this.showCounter;
	}

	/**
	 */
	public void setPosts(Posts posts) {
		this.posts = posts;
	}

	/**
	 */
	@JsonIgnore
	public Posts getPosts() {
		return posts;
	}

	/**
	 */
	public void setComments(Comments comments) {
		this.comments = comments;
	}

	/**
	 */
	@JsonIgnore
	public Comments getComments() {
		return comments;
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
	public Comments() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Comments that) {
		setId(that.getId());
		setContent(that.getContent());
		setCommentDate(that.getCommentDate());
		setIsResponse(that.getIsResponse());
		setShowCounter(that.getShowCounter());
		setPosts(that.getPosts());
		setComments(that.getComments());
		setCommentses(new java.util.LinkedHashSet<com.ira.domain.Comments>(that.getCommentses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("commentDate=[").append(commentDate).append("] ");
		buffer.append("isResponse=[").append(isResponse).append("] ");
		buffer.append("showCounter=[").append(showCounter).append("] ");

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
		if (!(obj instanceof Comments))
			return false;
		Comments equalCheck = (Comments) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
