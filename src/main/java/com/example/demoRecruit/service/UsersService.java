package com.example.demoRecruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoRecruit.dao.UsersRepo;
import com.example.demoRecruit.entity.Roster;
import com.example.demoRecruit.entity.Users;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepo usersRepo;

	public Users fetchUserById(String username,String password, String role) {
		
		return usersRepo.findByUsernameAndPasswordAndRole(username, password, role);
		
	}
	
	public Users fetchUserByUsername(String username) {
		return usersRepo.findByUsername(username);
	}
	
	public void save(Users theUser) {
		usersRepo.save(theUser);
		
	}

}
