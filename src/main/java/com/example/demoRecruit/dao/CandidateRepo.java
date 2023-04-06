package com.example.demoRecruit.dao;

import org.springframework.stereotype.Repository;

import com.example.demoRecruit.entity.CandidateDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CandidateRepo {
	
	@PersistenceContext
	private EntityManager em;
	
	int details;
	@Transactional
	public int getCandidate(CandidateDetails data)
	{
		
		System.out.println("Data is "+data.getName());
		details = 0;
		try
		{
		details = (int) em.createQuery("select l.id from CandidateDetails l where l.email=:email")
				.setParameter("email", data.getEmail())
				.getSingleResult();
		}
		catch(Exception e)
		{
			
		}
		if(details>0)
			return 1;
		else
			return 0;
	
	}

}
