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
import com.ira.dao.UsersDAO;
import com.ira.domain.Comments;
import com.ira.domain.Posts;
import com.ira.domain.Users;
import com.ira.service.PostsService;

/**
 * Spring Rest controller that handles CRUD requests for Posts entities
 * 
 */

@Path("/Posts")
@Component("PostsRestController")
public class PostsRestController {

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
	 * Service injected by Spring that provides CRUD operations for Posts entities
	 * 
	 */
	@Autowired
	private PostsService postsService;

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Path("/Posts/{posts_id}/users/{users_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deletePostsUsers(@PathParam("posts_id") Integer posts_id, @PathParam("users_id") Integer related_users_id) {
		postsService.deletePostsUsers(posts_id, related_users_id);
	}

	/**
	 * View an existing Comments entity
	 * 
	 */
	@Path("/Posts/{posts_id}/commentses/{comments_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Comments loadPostsCommentses(@PathParam("posts_id") Integer posts_id, @PathParam("comments_id") Integer related_commentses_id) {
		Comments comments = commentsDAO.findCommentsByPrimaryKey(related_commentses_id, -1, -1);

		return comments;
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@Path("/Posts/{posts_id}/users/{users_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Users loadPostsUsers(@PathParam("posts_id") Integer posts_id, @PathParam("users_id") Integer related_users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(related_users_id, -1, -1);

		return users;
	}

	/**
	 * Create a new Posts entity
	 * 
	 */
	@Path("/Posts")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Posts newPosts( Posts posts) {
		postsService.savePosts(posts);
		return postsDAO.findPostsByPrimaryKey(posts.getId());
	}

	/**
	 * Save an existing Comments entity
	 * 
	 */
	@Path("/Posts/{posts_id}/commentses")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments savePostsCommentses(@PathParam("posts_id") Integer posts_id,  Comments commentses) {
		postsService.savePostsCommentses(posts_id, commentses);
		return commentsDAO.findCommentsByPrimaryKey(commentses.getId());
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@Path("/Posts/{posts_id}/users")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Users newPostsUsers(@PathParam("posts_id") Integer posts_id,  Users users) {
		postsService.savePostsUsers(posts_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Path("/Posts/{posts_id}/users")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Users savePostsUsers(@PathParam("posts_id") Integer posts_id,  Users users) {
		postsService.savePostsUsers(posts_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Create a new Comments entity
	 * 
	 */
	@Path("/Posts/{posts_id}/commentses")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Comments newPostsCommentses(@PathParam("posts_id") Integer posts_id,  Comments comments) {
		postsService.savePostsCommentses(posts_id, comments);
		return commentsDAO.findCommentsByPrimaryKey(comments.getId());
	}

	/**
	 * Delete an existing Comments entity
	 * 
	 */
	@Path("/Posts/{posts_id}/commentses/{comments_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deletePostsCommentses(@PathParam("posts_id") Integer posts_id, @PathParam("comments_id") Integer related_commentses_id) {
		postsService.deletePostsCommentses(posts_id, related_commentses_id);
	}

	/**
	 * Save an existing Posts entity
	 * 
	 */
	@Path("/Posts")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Posts savePosts( Posts posts) {
		postsService.savePosts(posts);
		return postsDAO.findPostsByPrimaryKey(posts.getId());
	}

	/**
	 * Delete an existing Posts entity
	 * 
	 */
	@Path("/Posts/{posts_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deletePosts(@PathParam("posts_id") Integer posts_id) {
		Posts posts = postsDAO.findPostsByPrimaryKey(posts_id);
		postsService.deletePosts(posts);
	}

	/**
	 * Show all Posts entities
	 * 
	 */
	@Path("/Posts")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Posts> listPostss() {
		return new java.util.ArrayList<Posts>(postsService.loadPostss());
	}

	/**
	 * Get Users entity by Posts
	 * 
	 */
	@Path("/Posts/{posts_id}/users")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Users getPostsUsers(@PathParam("posts_id") Integer posts_id) {
		return postsDAO.findPostsByPrimaryKey(posts_id).getUsers();
	}

	/**
	 * Select an existing Posts entity
	 * 
	 */
	@Path("/Posts/{posts_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Posts loadPosts(@PathParam("posts_id") Integer posts_id) {
		return postsDAO.findPostsByPrimaryKey(posts_id);
	}


	/**
	 * Show all Comments entities by Posts
	 * 
	 */
	@Path("/Posts/{posts_id}/commentses")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comments> getPostsCommentses(@PathParam("posts_id") Integer posts_id) {
		return new java.util.ArrayList<Comments>(postsDAO.findPostsByPrimaryKey(posts_id).getCommentses());
	}
}