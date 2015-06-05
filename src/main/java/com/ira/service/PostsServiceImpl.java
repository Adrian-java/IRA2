package com.ira.service;

import com.ira.dao.CommentsDAO;
import com.ira.dao.PostsDAO;
import com.ira.dao.UsersDAO;

import com.ira.domain.Comments;
import com.ira.domain.Posts;
import com.ira.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Posts entities
 * 
 */

@Service("PostsService")
@Transactional
public class PostsServiceImpl implements PostsService {

	/**
	 * DAO injected by Spring that manages Comments entities
	 * 
	 */
	@Autowired
	private CommentsDAO commentsDAO;

	/**
	 * DAO injected by Spring that manages Posts entities
	 * 
	 */
	@Autowired
	private PostsDAO postsDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new PostsServiceImpl.
	 *
	 */
	public PostsServiceImpl() {
	}

	/**
	 * Return all Posts entity
	 * 
	 */
	@Transactional
	public List<Posts> findAllPostss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Posts>(postsDAO.findAllPostss(startResult, maxRows));
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Transactional
	public Posts savePostsCommentses(Integer id, Comments related_commentses) {
		Posts posts = postsDAO.findPostsByPrimaryKey(id, -1, -1);
		Comments existingcommentses = commentsDAO.findCommentsByPrimaryKey(related_commentses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcommentses != null) {
			existingcommentses.setId(related_commentses.getId());
			existingcommentses.setContent(related_commentses.getContent());
			existingcommentses.setCommentDate(related_commentses.getCommentDate());
			existingcommentses.setIsResponse(related_commentses.getIsResponse());
			existingcommentses.setShowCounter(related_commentses.getShowCounter());
			related_commentses = existingcommentses;
		}

		related_commentses.setPosts(posts);
		posts.getCommentses().add(related_commentses);
		related_commentses = commentsDAO.store(related_commentses);
		commentsDAO.flush();

		posts = postsDAO.store(posts);
		postsDAO.flush();

		return posts;
	}

	/**
	 * Save an existing Posts entity
	 * 
	 */
	@Transactional
	public void savePosts(Posts posts) {
		Posts existingPosts = postsDAO.findPostsByPrimaryKey(posts.getId());

		if (existingPosts != null) {
			if (existingPosts != posts) {
				existingPosts.setId(posts.getId());
				existingPosts.setTitle(posts.getTitle());
				existingPosts.setContent(posts.getContent());
				existingPosts.setShareDate(posts.getShareDate());
				existingPosts.setIsPrivate(posts.getIsPrivate());
			}
			posts = postsDAO.store(existingPosts);
		} else {
			posts = postsDAO.store(posts);
		}
		postsDAO.flush();
	}

	/**
	 */
	@Transactional
	public Posts findPostsByPrimaryKey(Integer id) {
		return postsDAO.findPostsByPrimaryKey(id);
	}

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Transactional
	public Posts deletePostsCommentses(Integer posts_id, Integer related_commentses_id) {
		Comments related_commentses = commentsDAO.findCommentsByPrimaryKey(related_commentses_id, -1, -1);

		Posts posts = postsDAO.findPostsByPrimaryKey(posts_id, -1, -1);

		related_commentses.setPosts(null);
		posts.getCommentses().remove(related_commentses);

		commentsDAO.remove(related_commentses);
		commentsDAO.flush();

		return posts;
	}

	/**
	 * Load an existing Posts entity
	 * 
	 */
	@Transactional
	public Set<Posts> loadPostss() {
		return postsDAO.findAllPostss();
	}

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	@Transactional
	public void deletePosts(Posts posts) {
		postsDAO.remove(posts);
		postsDAO.flush();
	}

	/**
	 * Return a count of all Posts entity
	 * 
	 */
	@Transactional
	public Integer countPostss() {
		return ((Long) postsDAO.createQuerySingleResult("select count(o) from Posts o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public Posts deletePostsUsers(Integer posts_id, Integer related_users_id) {
		Posts posts = postsDAO.findPostsByPrimaryKey(posts_id, -1, -1);
		Users related_users = usersDAO.findUsersByPrimaryKey(related_users_id, -1, -1);

		posts.setUsers(null);
		related_users.getPostses().remove(posts);
		posts = postsDAO.store(posts);
		postsDAO.flush();

		related_users = usersDAO.store(related_users);
		usersDAO.flush();

		usersDAO.remove(related_users);
		usersDAO.flush();

		return posts;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public Posts savePostsUsers(Integer id, Users related_users) {
		Posts posts = postsDAO.findPostsByPrimaryKey(id, -1, -1);
		Users existingusers = usersDAO.findUsersByPrimaryKey(related_users.getId());

		// copy into the existing record to preserve existing relationships
		if (existingusers != null) {
			existingusers.setId(related_users.getId());
			existingusers.setLogin(related_users.getLogin());
			existingusers.setPassword(related_users.getPassword());
			existingusers.setRole(related_users.getRole());
			existingusers.setIsEnabled(related_users.getIsEnabled());
			related_users = existingusers;
		} else {
			related_users = usersDAO.store(related_users);
			usersDAO.flush();
		}

		posts.setUsers(related_users);
		related_users.getPostses().add(posts);
		posts = postsDAO.store(posts);
		postsDAO.flush();

		related_users = usersDAO.store(related_users);
		usersDAO.flush();

		return posts;
	}
}
