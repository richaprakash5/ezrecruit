package com.example.demoRecruit.rest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRecruit.entity.AcceptProfile;
import com.example.demoRecruit.entity.IntervieweeDetails;
import com.example.demoRecruit.entity.InterviewerFeedBackDetails;
import com.example.demoRecruit.entity.Roster;
import com.example.demoRecruit.service.HrServiceImpl;
import com.example.demoRecruit.service.InterviewerServiceImpl;

import jakarta.validation.Valid;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
public class HrController {
	
	@Autowired
	HrServiceImpl hrServiceImpl;
	
	@Autowired
	InterviewerServiceImpl interviewerServiceImpl;
	
	@GetMapping("/hrScreen")
	public List<IntervieweeDetails> HrScreen() {
		return hrServiceImpl.findAll();
	}
	
	@GetMapping("/hrScreenActive")
	public List<IntervieweeDetails> HrScreenActive() throws ParseException {
		return hrServiceImpl.findAllActive();
	}
	
	@GetMapping("/upcomingInterview")
	public List<IntervieweeDetails> upcomingInterview() throws ParseException {
		return hrServiceImpl.findUpcomingInterview();
	}
	
	@GetMapping("/feedback/{emailId}")
	public InterviewerFeedBackDetails getFeedback(@PathVariable String emailId) {
		List<InterviewerFeedBackDetails> candidate = interviewerServiceImpl.findByEmail(emailId);
		List<InterviewerFeedBackDetails> candidateFeedback = new ArrayList<>();
		for(InterviewerFeedBackDetails i : candidate) {
			System.out.println("In here i : " + i);
			System.out.println(i.getCodingSkills());
			candidateFeedback.add(i);
		}
		System.out.println("Size : " + candidateFeedback.size());
		return candidateFeedback.get(candidateFeedback.size()-1);
	}
	
	@PostMapping("/acceptProfile")
	public HashMap acceptProfile(@Valid @RequestBody AcceptProfile accptData) {
		HashMap output = null;
			
			System.out.println(accptData.getInterviewID());
			System.out.println(accptData.getAcceptStatus());
			output =  hrServiceImpl.getDetails(accptData.getInterviewID(),accptData.getAcceptStatus());
			
		return output;
	}

}
