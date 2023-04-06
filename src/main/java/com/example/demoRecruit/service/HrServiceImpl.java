package com.example.demoRecruit.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoRecruit.dao.HrServiceRepo;
import com.example.demoRecruit.dao.InterviewerFeedBackRepo;
import com.example.demoRecruit.entity.IntervieweeDetails;
import com.example.demoRecruit.entity.InterviewerFeedBackDetails;
import com.example.demoRecruit.exceptions.RecordNotFoundException;



@Service
public class HrServiceImpl {
	
	@Autowired
	HrServiceRepo hrRepos;
	
	@Autowired
	InterviewerFeedBackRepo interviewerFeedBackRepo;
	
	public List<IntervieweeDetails> findAll(){
		List<IntervieweeDetails> finResult = hrRepos.findAll(); 
		List<IntervieweeDetails> finalResult = new ArrayList<>();
		for (int i = finResult.size() - 1; i >= 0; i--) {
			finalResult.add(finResult.get(i));
		}
		return finalResult;
	}
	
	public List<IntervieweeDetails> findAllActive() throws ParseException{
		List<IntervieweeDetails> finResult = hrRepos.findAll(); 
		List<IntervieweeDetails> finalResult = new ArrayList<>();
		//String timeStamp = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(Calendar.getInstance().getTime());
		//System.out.println("Time here: " + timeStamp);
		
		Date dcurr = new Date();
        System.out.println("Current date : " + dcurr);
        
        Date dt = new Date();
        long ltime = dt.getTime()+2*24*60*60*1000;
        Date dt5 = new Date(ltime);
        System.out.println("Current date + 5 : " + dt5);
		
		for(IntervieweeDetails i:finResult){
			System.out.println("getProfile_acceptance_status : " + i.getProfile_acceptance_status());
			System.out.println("getInterview_timestamp: " + i.getInterview_timestamp());
			
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(i.getInterview_timestamp());
			System.out.println("date here : " + date);
			
			System.out.println("test1 : " + date.after(dcurr));
			System.out.println("test2 : " + date.equals(dcurr));
			System.out.println("test3 : " + date.before(dt5));
			
			if(i.getProfile_acceptance_status() == null && date.before(dt5)) {
				System.out.println("In here if");
				finalResult.add(i);
			}else {
				System.out.println("In here else");
				continue;
			}	
		}
		
		List<IntervieweeDetails> finalResultActive = new ArrayList<>();
		for (int i = finalResult.size() - 1; i >= 0; i--) {
			finalResultActive.add(finalResult.get(i));
		}
		return finalResultActive;
	}
	
	public List<IntervieweeDetails> findUpcomingInterview() throws ParseException{
		
		List<IntervieweeDetails> finResult = hrRepos.findAll(); 
		List<IntervieweeDetails> finalResult = new ArrayList<>();
		
		Date dcurr = new Date();
        System.out.println("Current date : " + dcurr);
        
        Date dt = new Date();
        long ltime = dt.getTime()+2*24*60*60*1000;
        Date dt5 = new Date(ltime);
        System.out.println("Current date + 5 : " + dt5);
		
		for(IntervieweeDetails i:finResult){
			System.out.println("getProfile_acceptance_status : " + i.getProfile_acceptance_status());
			System.out.println("getInterview_timestamp: " + i.getInterview_timestamp());
			
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(i.getInterview_timestamp());
			System.out.println("date here : " + date);
			
			System.out.println("test3 : " + date.after(dt5));
			
			if((i.getProfile_acceptance_status() == null) && date.after(dt5)) {
				System.out.println("In here if");
				finalResult.add(i);
			}else {
				System.out.println("In here else");
				continue;
			}	
		}
		
		List<IntervieweeDetails> finalResultActive = new ArrayList<>();
		for (int i = finalResult.size() - 1; i >= 0; i--) {
			finalResultActive.add(finalResult.get(i));
		}
		return finalResultActive;
		
	}
	
	public HashMap getDetails(Integer intervieweeId,String acceptStatus) {
		
		IntervieweeDetails data;
		HashMap<String,String> output=new HashMap();
		
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date)); 
		    
		    data =  hrRepos.findById(intervieweeId)
				.orElseThrow(()-> new RecordNotFoundException("No Such record"));

	
			data.setProfile_acceptance_status(acceptStatus);
			data.setUpdated_by(data.getCreated_by());
			data.setUpdated_date(formatter.format(date));
			
			 hrRepos.save(data) ;
			 
			 output.put("message", acceptStatus);
			 output.put("isStatus", "Y");
	
		return output;
	}
	

}
