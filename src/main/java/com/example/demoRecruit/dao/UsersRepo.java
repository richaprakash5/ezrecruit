package com.example.demoRecruit.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoRecruit.entity.Roster;
import com.example.demoRecruit.entity.Users;


@Repository
public interface UsersRepo extends JpaRepository<Users, Integer>{

	public Users findByUsernameAndPasswordAndRole(String username, String password, String role);
	
	public Users findByUsername(String username);
	
	public Users save(Users theUsers);

	

}
