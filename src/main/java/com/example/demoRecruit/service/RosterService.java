package com.example.demoRecruit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoRecruit.entity.Roster;

@Service
public interface RosterService {
	
	public List<Roster> findAll();

	public List<Roster> findByUsername(String theUserName);
	
	public List<Roster> findBySkill(String theSkill);
	
	public Roster findById(int theId);
	
	public void save(Roster theRoster);
	
	public void deleteById(int theId);
}
