package com.example.demoRecruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoRecruit.entity.InterviewerFeedback;


public interface InterFeedbackRepo extends JpaRepository<InterviewerFeedback, Integer> {

}
