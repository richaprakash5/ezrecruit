package com.example.demoRecruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoRecruit.dao.CandidateDetailsRepo;
import com.example.demoRecruit.dao.CandidateRepo;
import com.example.demoRecruit.entity.CandidateDetails;

@Service
public class CandidateService {
	
	@Autowired
	private CandidateDetailsRepo repo;
	
	@Autowired
	private CandidateRepo crepo;
	
	public String insertCandidate(CandidateDetails data)
	{
		
		int res = crepo.getCandidate(data);
		if(res>0)
			return "Candidate Already Present";
		else
		{
		
		CandidateDetails details = new CandidateDetails();
		
		details.setName(data.getName());
		details.setEmail(data.getEmail());
		details.setPosition(data.getPosition());
		details.setExp(data.getExp());
		details.setIntname(data.getIntname());
		details.setLrc(data.getLrc());
		details.setTime(data.getTime());
		details.setCreatedby(data.getCreatedby());
		details.setCreateddate(data.getCreateddate());
		details.setUpdatedby(data.getUpdatedby());
		details.setUpdateddate(data.getUpdateddate());
		details.getIntdetails().addAll(data.getIntdetails());
		details.getIntdetails().stream().forEach(object->object.setC_id(details));
		repo.save(details);
		
		return "Candidate Inserted";
		
		}
	}

}
