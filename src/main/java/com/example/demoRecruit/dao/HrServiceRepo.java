package com.example.demoRecruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoRecruit.entity.IntervieweeDetails;

@Repository
public interface HrServiceRepo extends JpaRepository<IntervieweeDetails,Integer> {

}
