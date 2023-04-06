package com.example.demoRecruit.entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

@Entity
@Table(name="irefer_hr_interviewee_details")
public class IntervieweeDetails {
	
	@Id
	private int interviewee_id ;
	private String interviewee_name ;
	private String position_title ;
	private String total_experience ;
	private String resume ;
	private String latest_round_completed ;
	private String interviewer_name ;
	private String latest_interviewer_feedback ;
	private String interview_timestamp ;
	private String profile_acceptance_status ;
	private String created_by ;
	private String created_date ;
	private String updated_by ;
	private String updated_date ;
	private String email;
	
	
	/*
	 * @OneToMany(mappedBy = "IntervieweeDetails", cascade = CascadeType.ALL)
	 * private List<InterviewerFeedBackDetails> interviewerFeedBackDetails;
	 */
	 

	public int getInterviewee_id() {
		return interviewee_id;
	}
	public void setInterviewee_id(int interviewee_id) {
		this.interviewee_id = interviewee_id;
	}
	public String getInterviewee_name() {
		return interviewee_name;
	}
	public void setInterviewee_name(String interviewee_name) {
		this.interviewee_name = interviewee_name;
	}
	public String getPosition_title() {
		return position_title;
	}
	public void setPosition_title(String position_title) {
		this.position_title = position_title;
	}
	public String getTotal_experience() {
		return total_experience;
	}
	public void setTotal_experience(String total_experience) {
		this.total_experience = total_experience;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getLatest_round_completed() {
		return latest_round_completed;
	}
	public void setLatest_round_completed(String latest_round_completed) {
		this.latest_round_completed = latest_round_completed;
	}
	public String getInterviewer_name() {
		return interviewer_name;
	}
	public void setInterviewer_name(String interviewer_name) {
		this.interviewer_name = interviewer_name;
	}
	public String getLatest_interviewer_feedback() {
		return latest_interviewer_feedback;
	}
	public void setLatest_interviewer_feedback(String latest_interviewer_feedback) {
		this.latest_interviewer_feedback = latest_interviewer_feedback;
	}
	public String getInterview_timestamp() {
		return interview_timestamp;
	}
	public void setInterview_timestamp(String interview_timestamp) {
		this.interview_timestamp = interview_timestamp;
	}
	public String getProfile_acceptance_status() {
		return profile_acceptance_status;
	}
	public void setProfile_acceptance_status(String profile_acceptance_status) {
		this.profile_acceptance_status = profile_acceptance_status;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
