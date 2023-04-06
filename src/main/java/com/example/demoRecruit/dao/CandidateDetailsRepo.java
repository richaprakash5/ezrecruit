package com.example.demoRecruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoRecruit.entity.CandidateDetails;

public interface CandidateDetailsRepo extends JpaRepository<CandidateDetails, Integer> {

}
