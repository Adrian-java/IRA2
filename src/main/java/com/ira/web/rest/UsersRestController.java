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

import com.ira.dao.FriendDAO;
import com.ira.dao.PostsDAO;
import com.ira.dao.UsersDAO;
import com.ira.domain.Friend;
import com.ira.domain.Posts;
import com.ira.domain.Users;
import com.ira.service.UsersService;

/**
 * Spring Rest controller that handles CRUD requests for Users entities
 * 
 */

@Path("/Users")
@Component("UsersRestController")
public class UsersRestController {

	/**
	 * DAO injected by Spring that manages Friend entities
	 * 
	 */
	@Autowired
	private FriendDAO friendDAO;

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
	 * Service injected by Spring that provides CRUD operations for Users entities
	 * 
	 */
	@Autowired
	private UsersService usersService;

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUsers1/{friend_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUsersFriendsForIdUsers1(@PathParam("users_id") Integer users_id, @PathParam("friend_id") Integer related_friendsforidusers1_id) {
		usersService.deleteUsersFriendsForIdUsers1(users_id, related_friendsforidusers1_id);
	}

	/**
	 * Show all Friend entities by Users
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUsers1")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend> getUsersFriendsForIdUsers1(@PathParam("users_id") Integer users_id) {
		return new java.util.ArrayList<Friend>(usersDAO.findUsersByPrimaryKey(users_id).getFriendsForIdUsers1());
	}

	/**
	 * Save an existing Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUser2")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Friend saveUsersFriendsForIdUser2(@PathParam("users_id") Integer users_id,  Friend friendsforiduser2) {
		usersService.saveUsersFriendsForIdUser2(users_id, friendsforiduser2);
		return friendDAO.findFriendByPrimaryKey(friendsforiduser2.getId());
	}

	/**
	 * Create a new Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUsers1")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Friend newUsersFriendsForIdUsers1(@PathParam("users_id") Integer users_id,  Friend friend) {
		usersService.saveUsersFriendsForIdUsers1(users_id, friend);
		return friendDAO.findFriendByPrimaryKey(friend.getId());
	}

	/**
	 * View an existing Posts entity
	 * 
	 */
	@Path("/Users/{users_id}/postses/{posts_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Posts loadUsersPostses(@PathParam("") Integer users_id, @PathParam("") Integer related_postses_id) {
		Posts posts = postsDAO.findPostsByPrimaryKey(related_postses_id, -1, -1);

		return posts;
	}

	/**
	 * Save an existing Posts entity
	 * 
	 */
	@Path("/Users/{users_id}/postses")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Posts saveUsersPostses(@PathParam("users_id") Integer users_id,  Posts postses) {
		usersService.saveUsersPostses(users_id, postses);
		return postsDAO.findPostsByPrimaryKey(postses.getId());
	}

	/**
	 * Show all Users entities
	 * 
	 */
	@Path("/list")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Users> listUserss() {
		return new java.util.ArrayList<Users>(usersService.loadUserss());
	}

	/**
	 * Create a new Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUser2")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Friend newUsersFriendsForIdUser2(@PathParam("users_id") Integer users_id,  Friend friend) {
		usersService.saveUsersFriendsForIdUser2(users_id, friend);
		return friendDAO.findFriendByPrimaryKey(friend.getId());
	}

	/**
	 * Create a new Posts entity
	 * 
	 */
	@Path("/Users/{users_id}/postses")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Posts newUsersPostses(@PathParam("users_id") Integer users_id,  Posts posts) {
		usersService.saveUsersPostses(users_id, posts);
		return postsDAO.findPostsByPrimaryKey(posts.getId());
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@Path("/new")@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Users newUsers( Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}


	/**
	 * Delete an existing Posts entity
	 * 
	 */
	@Path("/Users/{users_id}/postses/{posts_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUsersPostses(@PathParam("users_id") Integer users_id, @PathParam("posts_id") Integer related_postses_id) {
		usersService.deleteUsersPostses(users_id, related_postses_id);
	}

	/**
	 * View an existing Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUsers1/{friend_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Friend loadUsersFriendsForIdUsers1(@PathParam("users_id") Integer users_id, @PathParam("friend_id") Integer related_friendsforidusers1_id) {
		Friend friend = friendDAO.findFriendByPrimaryKey(related_friendsforidusers1_id, -1, -1);

		return friend;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Path("/Users/{users_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUsers(@PathParam("users_id") Integer users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(users_id);
		usersService.deleteUsers(users);
	}

	/**
	 * Show all Posts entities by Users
	 * 
	 */
	@Path("/Users/{users_id}/postses")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Posts> getUsersPostses(@PathParam("users_id") Integer users_id) {
		return new java.util.ArrayList<Posts>(usersDAO.findUsersByPrimaryKey(users_id).getPostses());
	}

	/**
	 * Show all Friend entities by Users
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUser2")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend> getUsersFriendsForIdUser2(@PathParam("users_id") Integer users_id) {
		return new java.util.ArrayList<Friend>(usersDAO.findUsersByPrimaryKey(users_id).getFriendsForIdUser2());
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Path("/Users")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Users saveUsers( Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Save an existing Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUsers1")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Friend saveUsersFriendsForIdUsers1(@PathParam("users_id") Integer users_id,  Friend friendsforidusers1) {
		usersService.saveUsersFriendsForIdUsers1(users_id, friendsforidusers1);
		return friendDAO.findFriendByPrimaryKey(friendsforidusers1.getId());
	}

	/**
	 * View an existing Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUser2/{friend_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Friend loadUsersFriendsForIdUser2(@PathParam("users_id") Integer users_id, @PathParam("friend_id") Integer related_friendsforiduser2_id) {
		Friend friend = friendDAO.findFriendByPrimaryKey(related_friendsforiduser2_id, -1, -1);

		return friend;
	}

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	@Path("/Users/{users_id}/friendsForIdUser2/{friend_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUsersFriendsForIdUser2(@PathParam("users_id") Integer users_id, @PathParam("friend_id") Integer related_friendsforiduser2_id) {
		usersService.deleteUsersFriendsForIdUser2(users_id, related_friendsforiduser2_id);
	}

	/**
	 * Select an existing Users entity
	 * 
	 */
	@Path("/Users/{users_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Users loadUsers(@PathParam("users_id") Integer users_id) {
		return usersDAO.findUsersByPrimaryKey(users_id);
	}
}