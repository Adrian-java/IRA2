package com.ira.service;

import com.ira.domain.Comments;
import com.ira.domain.Posts;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Comments entities
 * 
 */
public interface CommentsService {

	/**
	 * Save an existing Posts entity
	 * 
	 */
	public Comments saveCommentsPosts(Integer id, Posts related_posts);

	/**
	 * Save an existing Comments entity
	 * 
	 */
	public Comments saveCommentsComments(Integer id_1, Comments related_comments);

	/**
	 * Return all Comments entity
	 * 
	 */
	public List<Comments> findAllCommentss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Comments entity
	 * 
	 */
	public Integer countCommentss();

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	public Comments deleteCommentsPosts(Integer comments_id, Integer related_posts_id);

	/**
	 * Load an existing Comments entity
	 * 
	 */
	public Set<Comments> loadCommentss();

	/**
	 * Save an existing Comments entity
	 * 
	 */
	public Comments saveCommentsCommentses(Integer id_2, Comments related_commentses);

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	public Comments deleteCommentsComments(Integer comments_id_1, Integer related_comments_id);

	/**
	 */
	public Comments findCommentsByPrimaryKey(Integer id_3);

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	public void deleteComments(Comments comments);

	/**
	 * Save an existing Comments entity
	 * 
	 */
	public void saveComments(Comments comments_1);

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	public Comments deleteCommentsCommentses(Integer comments_id_2, Integer related_commentses_id);
}