package com.ira.web.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ira.dao.FriendDAO;
import com.ira.dao.UsersDAO;
import com.ira.domain.Friend;
import com.ira.domain.Users;
import com.ira.service.FriendService;

/**
 * Spring Rest controller that handles CRUD requests for Friend entities
 * 
 */

@Path("/FriendRest")
@Component("FriendRestController")
public class FriendRestController {

	/**
	 * DAO injected by Spring that manages Friend entities
	 * 
	 */
	@Autowired
	private FriendDAO friendDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Friend entities
	 * 
	 */
	@Autowired
	private FriendService friendService;

	/**
	 * Select an existing Friend entity
	 * 
	 */
	@Path("/Friend/{friend_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Friend loadFriend(@PathVariable Integer friend_id) {
		return friendDAO.findFriendByPrimaryKey(friend_id);
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUser2/{users_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Users loadFriendUsersByIdUser2(@PathVariable Integer friend_id, @PathVariable Integer related_usersbyiduser2_id) {
		Users users = usersDAO.findUsersByPrimaryKey(related_usersbyiduser2_id, -1, -1);

		return users;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUser2/{users_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteFriendUsersByIdUser2(@PathVariable Integer friend_id, @PathVariable Integer related_usersbyiduser2_id) {
		friendService.deleteFriendUsersByIdUser2(friend_id, related_usersbyiduser2_id);
	}

	/**
	 * Get Users entity by Friend
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUser2")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Users getFriendUsersByIdUser2(@PathVariable Integer friend_id) {
		return friendDAO.findFriendByPrimaryKey(friend_id).getUsersByIdUser2();
	}

	/**
	 * Save an existing Friend entity
	 * 
	 */
	@Path("/Friend")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Friend saveFriend(@RequestBody Friend friend) {
		friendService.saveFriend(friend);
		return friendDAO.findFriendByPrimaryKey(friend.getId());
	}


	/**
	 * View an existing Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUsers1/{users_id}")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Users loadFriendUsersByIdUsers1(@PathVariable Integer friend_id, @PathVariable Integer related_usersbyidusers1_id) {
		Users users = usersDAO.findUsersByPrimaryKey(related_usersbyidusers1_id, -1, -1);

		return users;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUser2")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Users saveFriendUsersByIdUser2(@PathVariable Integer friend_id, @RequestBody Users usersbyiduser2) {
		friendService.saveFriendUsersByIdUser2(friend_id, usersbyiduser2);
		return usersDAO.findUsersByPrimaryKey(usersbyiduser2.getId());
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUser2")@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Users newFriendUsersByIdUser2(@PathVariable Integer friend_id, @RequestBody Users users) {
		friendService.saveFriendUsersByIdUser2(friend_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Create a new Friend entity
	 * 
	 */
	@Path("/Friend")@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Friend newFriend(@RequestBody Friend friend) {
		friendService.saveFriend(friend);
		return friendDAO.findFriendByPrimaryKey(friend.getId());
	}

	/**
	 * Show all Friend entities
	 * 
	 */
	@Path("/Friend")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend> listFriends() {
		return new java.util.ArrayList<Friend>(friendService.loadFriends());
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUsers1")@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Users saveFriendUsersByIdUsers1(@PathVariable Integer friend_id, @RequestBody Users usersbyidusers1) {
		friendService.saveFriendUsersByIdUsers1(friend_id, usersbyidusers1);
		return usersDAO.findUsersByPrimaryKey(usersbyidusers1.getId());
	}

	/**
	 * Delete an existing Friend entity
	 * 
	 */
	@Path("/Friend/{friend_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteFriend(@PathVariable Integer friend_id) {
		Friend friend = friendDAO.findFriendByPrimaryKey(friend_id);
		friendService.deleteFriend(friend);
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUsers1/{users_id}")@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteFriendUsersByIdUsers1(@PathVariable Integer friend_id, @PathVariable Integer related_usersbyidusers1_id) {
		friendService.deleteFriendUsersByIdUsers1(friend_id, related_usersbyidusers1_id);
	}

	/**
	 * Get Users entity by Friend
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUsers1")@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Users getFriendUsersByIdUsers1(@PathVariable Integer friend_id) {
		return friendDAO.findFriendByPrimaryKey(friend_id).getUsersByIdUsers1();
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@Path("/Friend/{friend_id}/usersByIdUsers1")@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Users newFriendUsersByIdUsers1(@PathVariable Integer friend_id, @RequestBody Users users) {
		friendService.saveFriendUsersByIdUsers1(friend_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}
}