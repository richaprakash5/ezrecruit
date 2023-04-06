package com.example.demoRecruit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRecruit.entity.Roster;
import com.example.demoRecruit.service.RosterService;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/api")
public class RosterRestController {
	
	private RosterService rosterService;
	
	@Autowired
	public RosterRestController(RosterService theRosterService) {
		rosterService = theRosterService;
	}
	
	@GetMapping("/roster")
	public List<Roster> findAll(){
		return rosterService.findAll();
	}
	
	@GetMapping("/roster/{theUserName}")
	public List<Roster> findByUserName(@PathVariable String theUserName){
		List<Roster> roster = rosterService.findByUsername(theUserName);
		if(roster == null) {
			throw new RuntimeException("Employee not found for name : "+theUserName);
		}
		return roster;
	}
	
	@GetMapping("/roster/skill/{theSkill}")
	public List<Roster> findBySkill(@PathVariable String theSkill){
		List<Roster> roster = rosterService.findBySkill(theSkill);
		if(roster == null) {
			throw new RuntimeException("Employee not found with skill : "+theSkill);
		}
		return roster;
	}
	
	@PostMapping("/roster")
	public Roster addEntry(@RequestBody Roster theRoster) {
		theRoster.setId(0);
		rosterService.save(theRoster);
		return theRoster;
	}
	
	@PutMapping("/roster")
	public Roster updateEmploye(@RequestBody Roster theRoster) {
		rosterService.save(theRoster);
		return theRoster;
	}
	
	@DeleteMapping("/roster/{rosterId}")
	public String deleteEmp(@PathVariable int rosterId) {
		Roster theRoster = rosterService.findById(rosterId);
		if(theRoster == null) {
			throw new RuntimeException("Id not found : "+ rosterId);
		}
		rosterService.deleteById(rosterId);
		return "Deleted rooster Id :" + rosterId;
	}
	
	

	
}
