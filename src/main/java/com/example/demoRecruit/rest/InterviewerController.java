package com.example.demoRecruit.rest;

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
import com.example.demoRecruit.entity.FeedBackProfile;
import com.example.demoRecruit.entity.InterviewerFeedBackDetails;
import com.example.demoRecruit.service.InterviewerServiceImpl;

import jakarta.validation.Valid;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class InterviewerController {

	@Autowired
	InterviewerServiceImpl interviewerServiceImpl;
	
	
	@GetMapping("/interviewerScreen")
	public List<InterviewerFeedBackDetails> interviewerScreen() {
		return interviewerServiceImpl.findAll();
	}
	
	@GetMapping("/interviewerScreen/{theInterviewerName}")
	public List<InterviewerFeedBackDetails> findByInterviewerName(@PathVariable String theInterviewerName) {
		
		List<InterviewerFeedBackDetails> result = interviewerServiceImpl.findByInterviewerName(theInterviewerName);
		if(result == null) {
			throw new RuntimeException("Interviewer not found with skill : "+theInterviewerName);
		}
		return result;
	}
	

	@PostMapping("/acceptInterview")
	public HashMap acceptInterView(@Valid @RequestBody AcceptProfile accptData) {

		HashMap output=null;
	
			System.out.println("/acceptInterview");
			System.out.println(accptData.getInterviewID());
			System.out.println(accptData.getAcceptStatus());
			
			output =  interviewerServiceImpl.getDetails(accptData.getInterviewID(),accptData.getAcceptStatus());
			
		
		return output;
	}
	
	@PostMapping("/shareInterviewerFeedback")
	public HashMap shareInterViewrFeedback(@Valid @RequestBody FeedBackProfile feedBackData) {

		HashMap output=null;
	
			System.out.println("/shareInterviewerFeedback");
			System.out.println(feedBackData.getInterviewID());
			System.out.println(feedBackData.getAcceptStatus());
			
			output =  interviewerServiceImpl.saveFeedback(feedBackData);
			
		
		return output;
	}
	
}
