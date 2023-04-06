package com.example.demoRecruit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoRecruit.dao.RosterRepo;
import com.example.demoRecruit.entity.Roster;

@Service
public class RosterServiceImpl implements RosterService {
	
	private RosterRepo rosterRepo;
	
	@Autowired
	public RosterServiceImpl(RosterRepo theRosterRepo) {
		rosterRepo = theRosterRepo;
	}

	@Override
	public List<Roster> findAll() {
		return rosterRepo.findAll(); 
	}

	@Override
	public List<Roster> findByUsername(String theUsername) {
		
		
		List<Roster> result = rosterRepo.findByUsername(theUsername);
		System.out.println(result);
		if(result.isEmpty()) {
			throw new RuntimeException("User name not found in DB : " + theUsername);
		}
		return result;
	}

	@Override
	public List<Roster> findBySkill(String theSkill) {
		
		List<Roster> result = rosterRepo.findBySkill(theSkill);
		System.out.println("HEre : " + result);
		if(result.isEmpty()) {
			throw new RuntimeException("Skill not found in DB : " + theSkill);
		}
		return result;
	}
	
	@Override
	public Roster findById(int theId) {
		Optional<Roster> result = rosterRepo.findById(theId);
		Roster theRoster = null;
		if(result.isPresent())
			theRoster = result.get();
		else
			throw new RuntimeException("Did not find employee id : " + theId);
			
		return theRoster;
	}	

	@Override
	public void save(Roster theRoster) {
		rosterRepo.save(theRoster);
		
	}

	@Override
	public void deleteById(int theId) {
		rosterRepo.deleteById(theId);
	}

	 

}
