package com.example.demoRecruit.entity;

import jakarta.validation.constraints.NotNull;

public class AcceptProfile {
	
	@NotNull(message = "InterviewID field must not be null.")
	private Integer interviewID;
	
	@NotNull(message = "AcceptStatus field must not be null.")
	private String acceptStatus;
	
	public Integer getInterviewID() {
		return interviewID;
	}
	public void setInterviewID(Integer interviewID) {
		this.interviewID = interviewID;
	}
	public String getAcceptStatus() {
		return acceptStatus;
	}
	public void setAcceptStatus(String acceptStatus) {
		this.acceptStatus = acceptStatus;
	}
	

}
