package com.example.domain;

import org.springframework.security.core.authority.AuthorityUtils;

public class SecurityUser extends org.springframework.security.core.userdetails.User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;

	public SecurityUser(User user) {
		super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

    public Role getRole() {
    	return user.getRole();
    }
	
}
