package com.ira.service;

import com.ira.dao.CommentsDAO;
import com.ira.dao.PostsDAO;

import com.ira.domain.Comments;
import com.ira.domain.Posts;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Comments entities
 * 
 */

@Service("CommentsService")
@Transactional
public class CommentsServiceImpl implements CommentsService {

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
	 * Instantiates a new CommentsServiceImpl.
	 *
	 */
	public CommentsServiceImpl() {
	}

	/**
	 * Save an existing Posts entity
	 * 
	 */
	@Transactional
	public Comments saveCommentsPosts(Integer id, Posts related_posts) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(id, -1, -1);
		Posts existingposts = postsDAO.findPostsByPrimaryKey(related_posts.getId());

		// copy into the existing record to preserve existing relationships
		if (existingposts != null) {
			existingposts.setId(related_posts.getId());
			existingposts.setTitle(related_posts.getTitle());
			existingposts.setContent(related_posts.getContent());
			existingposts.setShareDate(related_posts.getShareDate());
			existingposts.setIsPrivate(related_posts.getIsPrivate());
			related_posts = existingposts;
		}

		comments.setPosts(related_posts);
		related_posts.getCommentses().add(comments);
		comments = commentsDAO.store(comments);
		commentsDAO.flush();

		related_posts = postsDAO.store(related_posts);
		postsDAO.flush();

		return comments;
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Transactional
	public Comments saveCommentsComments(Integer id, Comments related_comments) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(id, -1, -1);
		Comments existingcomments = commentsDAO.findCommentsByPrimaryKey(related_comments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcomments != null) {
			existingcomments.setId(related_comments.getId());
			existingcomments.setContent(related_comments.getContent());
			existingcomments.setCommentDate(related_comments.getCommentDate());
			existingcomments.setIsResponse(related_comments.getIsResponse());
			existingcomments.setShowCounter(related_comments.getShowCounter());
			related_comments = existingcomments;
		}

		comments.setComments(related_comments);
		related_comments.getCommentses().add(comments);
		comments = commentsDAO.store(comments);
		commentsDAO.flush();

		related_comments = commentsDAO.store(related_comments);
		commentsDAO.flush();

		return comments;
	}

	/**
	 * Return all Comments entity
	 * 
	 */
	@Transactional
	public List<Comments> findAllCommentss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Comments>(commentsDAO.findAllCommentss(startResult, maxRows));
	}

	/**
	 * Return a count of all Comments entity
	 * 
	 */
	@Transactional
	public Integer countCommentss() {
		return ((Long) commentsDAO.createQuerySingleResult("select count(o) from Comments o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	@Transactional
	public Comments deleteCommentsPosts(Integer comments_id, Integer related_posts_id) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(comments_id, -1, -1);
		Posts related_posts = postsDAO.findPostsByPrimaryKey(related_posts_id, -1, -1);

		comments.setPosts(null);
		related_posts.getCommentses().remove(comments);
		comments = commentsDAO.store(comments);
		commentsDAO.flush();

		related_posts = postsDAO.store(related_posts);
		postsDAO.flush();

		postsDAO.remove(related_posts);
		postsDAO.flush();

		return comments;
	}

	/**
	 * Load an existing Comments entity
	 * 
	 */
	@Transactional
	public Set<Comments> loadCommentss() {
		return commentsDAO.findAllCommentss();
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Transactional
	public Comments saveCommentsCommentses(Integer id, Comments related_commentses) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(id, -1, -1);
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

		comments.setComments(related_commentses);
		related_commentses.getCommentses().add(comments);
		comments = commentsDAO.store(comments);
		commentsDAO.flush();

		related_commentses = commentsDAO.store(related_commentses);
		commentsDAO.flush();

		return comments;
	}

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Transactional
	public Comments deleteCommentsComments(Integer comments_id, Integer related_comments_id) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(comments_id, -1, -1);
		Comments related_comments = commentsDAO.findCommentsByPrimaryKey(related_comments_id, -1, -1);

		comments.setComments(null);
		related_comments.getCommentses().remove(comments);
		comments = commentsDAO.store(comments);
		commentsDAO.flush();

		related_comments = commentsDAO.store(related_comments);
		commentsDAO.flush();

		commentsDAO.remove(related_comments);
		commentsDAO.flush();

		return comments;
	}

	/**
	 */
	@Transactional
	public Comments findCommentsByPrimaryKey(Integer id) {
		return commentsDAO.findCommentsByPrimaryKey(id);
	}

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Transactional
	public void deleteComments(Comments comments) {
		commentsDAO.remove(comments);
		commentsDAO.flush();
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Transactional
	public void saveComments(Comments comments) {
		Comments existingComments = commentsDAO.findCommentsByPrimaryKey(comments.getId());

		if (existingComments != null) {
			if (existingComments != comments) {
				existingComments.setId(comments.getId());
				existingComments.setContent(comments.getContent());
				existingComments.setCommentDate(comments.getCommentDate());
				existingComments.setIsResponse(comments.getIsResponse());
				existingComments.setShowCounter(comments.getShowCounter());
			}
			comments = commentsDAO.store(existingComments);
		} else {
			comments = commentsDAO.store(comments);
		}
		commentsDAO.flush();
	}

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Transactional
	public Comments deleteCommentsCommentses(Integer comments_id, Integer related_commentses_id) {
		Comments related_commentses = commentsDAO.findCommentsByPrimaryKey(related_commentses_id, -1, -1);

		Comments comments = commentsDAO.findCommentsByPrimaryKey(comments_id, -1, -1);

		comments.setComments(null);
		related_commentses.getCommentses().remove(comments);

		commentsDAO.remove(related_commentses);
		commentsDAO.flush();

		return comments;
	}
}
