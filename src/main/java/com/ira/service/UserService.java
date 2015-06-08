package com.ira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ira.dao.UsersDAO;
import com.ira.domain.Users;

@Service("userService")
public class UserService implements UserDetailsService {
	
	@Autowired
	private UsersDAO usersDao;

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Users su = usersDao.findUsersByLogin(username).iterator().next();
		return su;
	}
}
