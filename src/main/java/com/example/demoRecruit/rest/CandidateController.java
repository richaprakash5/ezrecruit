package com.example.demoRecruit.rest;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRecruit.entity.CandidateDetails;
import com.example.demoRecruit.service.CandidateService;
import com.example.demoRecruit.service.ScheduleIntService;

@CrossOrigin(origins = "http://localhost:4200") 

@RestController
public class CandidateController {
	
	@Autowired 
	  private CandidateService serv;
	  @Autowired
	  private ScheduleIntService sservice;
	  
	  @RequestMapping(value = "/addCandidate", produces = "application/json")
	  public Map insertCandidate(@RequestBody CandidateDetails data) 
	  { 
	  String result = serv.insertCandidate(data); 
	  JSONObject obj = new JSONObject();
	  obj.put("Status", result);
	  
	  return obj.toMap();
	  
	  }
	 
	  @RequestMapping(value = "/scheduleInterview", produces = "application/json")
	  public Map scheduleInterview(@RequestBody CandidateDetails data) 
	  { 
	  String result = sservice.ScheduleInterview(data);
	  JSONObject obj = new JSONObject();
	  obj.put("Status", result);
	  
	  return obj.toMap();
	  
	  }
	  

}
