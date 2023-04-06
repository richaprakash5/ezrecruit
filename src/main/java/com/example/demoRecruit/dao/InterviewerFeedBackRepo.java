package com.example.demoRecruit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoRecruit.entity.InterviewerFeedBackDetails;

@Repository
public interface InterviewerFeedBackRepo extends JpaRepository<InterviewerFeedBackDetails, Integer> {
	
	List<InterviewerFeedBackDetails> findByInterviewerName(String theInterviewerName);
	
	List<InterviewerFeedBackDetails> findByEmail(String emailID);

}
