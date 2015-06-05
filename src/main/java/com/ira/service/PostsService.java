package com.ira.service;

import com.ira.domain.Comments;
import com.ira.domain.Posts;
import com.ira.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Posts entities
 * 
 */
public interface PostsService {

	/**
	 * Return all Posts entity
	 * 
	 */
	public List<Posts> findAllPostss(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Comments entity
	 * 
	 */
	public Posts savePostsCommentses(Integer id, Comments related_commentses);

	/**
	 * Save an existing Posts entity
	 * 
	 */
	public void savePosts(Posts posts);

	/**
	 */
	public Posts findPostsByPrimaryKey(Integer id_1);

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	public Posts deletePostsCommentses(Integer posts_id, Integer related_commentses_id);

	/**
	 * Load an existing Posts entity
	 * 
	 */
	public Set<Posts> loadPostss();

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	public void deletePosts(Posts posts_1);

	/**
	 * Return a count of all Posts entity
	 * 
	 */
	public Integer countPostss();

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public Posts deletePostsUsers(Integer posts_id_1, Integer related_users_id);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public Posts savePostsUsers(Integer id_2, Users related_users);
}