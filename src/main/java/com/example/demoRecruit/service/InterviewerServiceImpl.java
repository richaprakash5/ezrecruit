package com.example.demoRecruit.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoRecruit.dao.HrServiceRepo;
import com.example.demoRecruit.dao.InterviewerFeedBackRepo;
import com.example.demoRecruit.entity.FeedBackProfile;
import com.example.demoRecruit.entity.IntervieweeDetails;
import com.example.demoRecruit.entity.InterviewerFeedBackDetails;
import com.example.demoRecruit.exceptions.RecordNotFoundException;



@Service
public class InterviewerServiceImpl {

	@Autowired
	InterviewerFeedBackRepo interviewerFeedBackRepo;
	
	@Autowired
	HrServiceRepo hrRepos;
	
	public List<InterviewerFeedBackDetails> findAll(){
		return interviewerFeedBackRepo.findAll(); 
	}
	
	public List<InterviewerFeedBackDetails> findByEmail(String emailId){
		return interviewerFeedBackRepo.findByEmail(emailId); 
	}
	
	
	public List<InterviewerFeedBackDetails> findByInterviewerName(String theInterviewerName) {
		
		List<InterviewerFeedBackDetails> result = interviewerFeedBackRepo.findByInterviewerName(theInterviewerName);
		System.out.println("result here : " + result);
		List<InterviewerFeedBackDetails> finalResult = new ArrayList<>();
		if(result.isEmpty()) {
			throw new RecordNotFoundException("Interviewer not found in DB : " + theInterviewerName);
		}
		for(InterviewerFeedBackDetails i:result){
			System.out.println("Accept Status "+i.getInterviewerAcceptStatus());
			System.out.println("Feedback "+i.getInterviewerFeedback());

			
			if((i.getInterviewerAcceptStatus() == null ||  i.getInterviewerAcceptStatus().equals("Interview Accepted"))&&i.getInterviewerFeedback()==null) {
				finalResult.add(i);
			}else if(i.getInterviewerAcceptStatus().equals("Interview Rejected")){
				continue;
			}	
		}
		if(finalResult.isEmpty()) {
			throw new RecordNotFoundException("List Not found in DB here for : " + theInterviewerName);
		}
		return finalResult;
	}
	
	public HashMap getDetails(Integer interviewId,String acceptStatus) {
		
		InterviewerFeedBackDetails feedBackData;
		HashMap<String,String> output=new HashMap();
	
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
			Date date = new Date();  
			System.out.println(formatter.format(date));
	    
			
			feedBackData =  interviewerFeedBackRepo.findById(interviewId)
					.orElseThrow(()-> new RecordNotFoundException("No Such record"));
		
		
			
			feedBackData.setInterviewerAcceptStatus(acceptStatus);
			feedBackData.setUpdatedBy(feedBackData.getUpdatedBy());
			feedBackData.setUpdatedDate(formatter.format(date));
			
			interviewerFeedBackRepo.save(feedBackData);
		
			IntervieweeDetails intervieweeData = hrRepos.findById(feedBackData.getIntervieweeId()).get();
				 
				if(intervieweeData!=null) {			
					intervieweeData.setLatest_interviewer_feedback(acceptStatus);
					intervieweeData.setUpdated_by(intervieweeData.getCreated_by());
					intervieweeData.setUpdated_date(formatter.format(date));
					
					hrRepos.save(intervieweeData);
					
				}else {
					//No Record found in irefer_hr_interviewee_details table
					System.out.println("No such Record in irefer_hr_interviewee_details");
					throw new RecordNotFoundException("No Such record");
				}
			output.put("message",acceptStatus);		 
			output.put("isStatus","Y");	
			
	
		return output;
	}
	

	public HashMap saveFeedback(FeedBackProfile feedBackProfData) {
		
		InterviewerFeedBackDetails feedBackData;
		HashMap<String,String> output=new HashMap();
	
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
			Date date = new Date();  
			System.out.println(formatter.format(date));
	    
			
			feedBackData =  interviewerFeedBackRepo.findById(feedBackProfData.getInterviewID())
					.orElseThrow(()-> new RecordNotFoundException("No Such record"));
		
			feedBackData.setCodingSkills(feedBackProfData.getCoding_skills());
			feedBackData.setSkillOnYOE(feedBackProfData.getSkills_based_on_yoe());
			feedBackData.setDecisionMaking(feedBackProfData.getDecision_making());
			feedBackData.setClientHandling(feedBackProfData.getClient_handling());
			feedBackData.setTeamMgmnt(feedBackProfData.getTeam_management());
			feedBackData.setArticulateAbility(feedBackProfData.getArticulate_ability());
			feedBackData.setSolutionApproach(feedBackProfData.getSolution_approach());
			feedBackData.setRemarks(feedBackProfData.getRemarks());
			feedBackData.setInterviewerFeedback(feedBackProfData.getAcceptStatus());
			feedBackData.setUpdatedBy(feedBackData.getUpdatedBy());
			feedBackData.setUpdatedDate(formatter.format(date));
			
			interviewerFeedBackRepo.save(feedBackData);
		
			IntervieweeDetails intervieweeData = hrRepos.findById(feedBackData.getIntervieweeId()).get();
				 
				if(intervieweeData!=null) {			
					intervieweeData.setLatest_interviewer_feedback(feedBackProfData.getAcceptStatus());
					intervieweeData.setUpdated_by(intervieweeData.getCreated_by());
					intervieweeData.setUpdated_date(formatter.format(date));
					
					hrRepos.save(intervieweeData);
					
				}else {
					//No Record found in irefer_hr_interviewee_details table
					System.out.println("No such Record in irefer_hr_interviewee_details");
					throw new RecordNotFoundException("No Such record");
				}
			output.put("message",feedBackProfData.getAcceptStatus());		 
			output.put("isStatus","Y");	
			
	
		return output;
		
		
		
	}
}
