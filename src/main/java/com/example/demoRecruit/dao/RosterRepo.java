package com.example.demoRecruit.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoRecruit.entity.Roster;

public interface RosterRepo extends JpaRepository<Roster, Integer> {

	List<Roster> findByUsername(String theUsername);

	List<Roster> findBySkill(String theSkill);


}
