package com.example.demoRecruit.dao;

import org.springframework.stereotype.Repository;

import com.example.demoRecruit.entity.InterviewerFeedback;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class IntFeedbackRepo {
	
	@PersistenceContext
	private EntityManager em;
	
	public String insertIntFeedback(InterviewerFeedback fdb)
	{
		em.persist(fdb);
		return "Inserted";
	}


}
