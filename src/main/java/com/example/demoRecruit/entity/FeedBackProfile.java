package com.example.demoRecruit.entity;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FeedBackProfile {
	
	@NotNull(message = "InterviewID field must not be null.")
	private Integer interviewID;
	
	@NotBlank(message = "coding_skills field must not be Blank.")
	private String coding_skills;
	
	
	@NotBlank(message = "skills_based_on_yoe field must not be Blank.")
	private String skills_based_on_yoe;
	

	@NotBlank(message = "decision_making field must not be Blank.")
	private String decision_making;
	
	@NotBlank(message = "client_handling field must not be Blank.")
	private String client_handling;
	
	@NotBlank(message = "team_management field must not be Blank.")
	private String team_management;
	
	@NotBlank(message = "articulate_ability field must not be Blank.")
	private String articulate_ability;
	
	@NotBlank(message = "solution_approach field must not be Blank.")
	private String solution_approach;
	
	@NotBlank(message = "remarks field must not be Blank.")
	private String remarks;
	
	@NotBlank(message = "acceptStatus field must not be Blank.")
	private String acceptStatus;

	public Integer getInterviewID() {
		return interviewID;
	}

	public void setInterviewID(Integer interviewID) {
		this.interviewID = interviewID;
	}

	public String getCoding_skills() {
		return coding_skills;
	}

	public void setCoding_skills(String coding_skills) {
		this.coding_skills = coding_skills;
	}

	public String getSkills_based_on_yoe() {
		return skills_based_on_yoe;
	}

	public void setSkills_based_on_yoe(String skills_based_on_yoe) {
		this.skills_based_on_yoe = skills_based_on_yoe;
	}

	public String getDecision_making() {
		return decision_making;
	}

	public void setDecision_making(String decision_making) {
		this.decision_making = decision_making;
	}

	public String getClient_handling() {
		return client_handling;
	}

	public void setClient_handling(String client_handling) {
		this.client_handling = client_handling;
	}

	public String getTeam_management() {
		return team_management;
	}

	public void setTeam_management(String team_management) {
		this.team_management = team_management;
	}

	public String getArticulate_ability() {
		return articulate_ability;
	}

	public void setArticulate_ability(String articulate_ability) {
		this.articulate_ability = articulate_ability;
	}

	public String getSolution_approach() {
		return solution_approach;
	}

	public void setSolution_approach(String solution_approach) {
		this.solution_approach = solution_approach;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getAcceptStatus() {
		return acceptStatus;
	}

	public void setAcceptStatus(String acceptStatus) {
		this.acceptStatus = acceptStatus;
	}
	
	
	

}
