package com.ira.web.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ira.dao.CommentsDAO;
import com.ira.dao.PostsDAO;
import com.ira.domain.Comments;
import com.ira.domain.Posts;
import com.ira.service.CommentsService;

/**
 * Spring Rest controller that handles CRUD requests for Comments entities
 * 
 */

@Path("/Comments")
@Component("CommentsRestController")
public class CommentsRestController {

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
	 * Service injected by Spring that provides CRUD operations for Comments entities
	 * 
	 */
	@Autowired
	private CommentsService commentsService;

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}/comments/{comments_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCommentsComments(@PathParam("comments_id") Integer comments_id, @PathParam("comments_id") Integer related_comments_id) {
		commentsService.deleteCommentsComments(comments_id, related_comments_id);
	}

	/**
	 * Get Posts entity by Comments
	 * 
	 */
	@Path("/{comments_id}/posts")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Posts getCommentsPosts(@PathParam("comments_id") Integer comments_id) {
		return commentsDAO.findCommentsByPrimaryKey(comments_id).getPosts();
	}

	/**
	 * Create a new Comments entity
	 * 
	 */
	@Path("/{comments_id}/comments")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments newCommentsComments(@PathParam("comments_id") Integer comments_id,  Comments comments) {
		commentsService.saveCommentsComments(comments_id, comments);
		return commentsDAO.findCommentsByPrimaryKey(comments.getId());
	}

	/**
	 * Get Comments entity by Comments
	 * 
	 */
	@Path("/{comments_id}/comments")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Comments getCommentsComments(@PathParam("comments_id") Integer comments_id) {
		return commentsDAO.findCommentsByPrimaryKey(comments_id).getComments();
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}/comments")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments saveCommentsComments(@PathParam("comments_id") Integer comments_id,  Comments comments) {
		commentsService.saveCommentsComments(comments_id, comments);
		return commentsDAO.findCommentsByPrimaryKey(comments.getId());
	}

	/**
	 * View an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}/commentses/{comments_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Comments loadCommentsCommentses(@PathParam("comments_id") Integer comments_id, @PathParam("comments_id") Integer related_commentses_id) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(related_commentses_id, -1, -1);

		return comments;
	}

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}/commentses/{comments_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCommentsCommentses(@PathParam("") Integer comments_id, @PathParam("") Integer related_commentses_id) {
		commentsService.deleteCommentsCommentses(comments_id, related_commentses_id);
	}

	/**
	 * View an existing Posts entity
	 * 
	 */
	@Path("/{comments_id}/posts/{posts_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Posts loadCommentsPosts(@PathParam("comments_id") Integer comments_id, @PathParam("posts_id") Integer related_posts_id) {
		Posts posts = postsDAO.findPostsByPrimaryKey(related_posts_id, -1, -1);

		return posts;
	}

	/**
	 * Create a new Comments entity
	 * 
	 */
	@Path("/{comments_id}/commentses")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments newCommentsCommentses(@PathParam("comments_id") Integer comments_id,  Comments comments) {
		commentsService.saveCommentsCommentses(comments_id, comments);
		return commentsDAO.findCommentsByPrimaryKey(comments.getId());
	}

	/**
	 * View an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}/comments/{comments_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Comments loadCommentsComments(@PathParam("comments_id") Integer comments_id, @PathParam("comments_id") Integer related_comments_id) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(related_comments_id, -1, -1);

		return comments;
	}

	/**
	 * Create a new Posts entity
	 * 
	 */
	@Path("/{comments_id}/posts")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Posts newCommentsPosts(@PathParam("comments_id") Integer comments_id,  Posts posts) {
		commentsService.saveCommentsPosts(comments_id, posts);
		return postsDAO.findPostsByPrimaryKey(posts.getId());
	}

	/**
	 * Create a new Comments entity
	 * 
	 */
	@Path("")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments newComments( Comments comments) {
		commentsService.saveComments(comments);
		return commentsDAO.findCommentsByPrimaryKey(comments.getId());
	}

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	@Path("/{comments_id}/posts/{posts_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCommentsPosts(@PathParam("posts_id") Integer comments_id, @PathParam("posts_id") Integer related_posts_id) {
		commentsService.deleteCommentsPosts(comments_id, related_posts_id);
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}/commentses")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments saveCommentsCommentses(@PathParam("comments_id") Integer comments_id,  Comments commentses) {
		commentsService.saveCommentsCommentses(comments_id, commentses);
		return commentsDAO.findCommentsByPrimaryKey(commentses.getId());
	}

	/**
	 * Show all Comments entities
	 * 
	 */
	@Path("")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comments> listCommentss() {
		return new java.util.ArrayList<Comments>(commentsService.loadCommentss());
	}


	/**
	 * Save an existing Posts entity
	 * 
	 */
	@Path("/{comments_id}/posts")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Posts saveCommentsPosts(@PathParam("comments_id") Integer comments_id,  Posts posts) {
		commentsService.saveCommentsPosts(comments_id, posts);
		return postsDAO.findPostsByPrimaryKey(posts.getId());
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Path("")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments saveComments( Comments comments) {
		commentsService.saveComments(comments);
		return commentsDAO.findCommentsByPrimaryKey(comments.getId());
	}

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteComments(@PathParam("comments_id") Integer comments_id) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(comments_id);
		commentsService.deleteComments(comments);
	}

	/**
	 * Show all Comments entities by Comments
	 * 
	 */
	@Path("/{comments_id}/commentses")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comments> getCommentsCommentses(@PathParam("comments_id") Integer comments_id) {
		return new java.util.ArrayList<Comments>(commentsDAO.findCommentsByPrimaryKey(comments_id).getCommentses());
	}

	/**
	 * Select an existing Comments entity
	 * 
	 */
	@Path("/{comments_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Comments loadComments(@PathParam("comments_id") Integer comments_id) {
		return commentsDAO.findCommentsByPrimaryKey(comments_id);
	}
}