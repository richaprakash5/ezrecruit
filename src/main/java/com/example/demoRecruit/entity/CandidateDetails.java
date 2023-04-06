package com.example.demoRecruit.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="irefer_hr_interviewee_details")
public class CandidateDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="interviewee_id")
	private int id;
	@Column(name="interviewee_name")
	private String name;
	@Column(name="position_title")
	private String position;
	@Column(name="email")
	private String email;
	@Column(name="latest_interviewer_feedback")
	private String latest_interviewer_feedback; 
	@Column(name="total_experience")
	private float exp;
	@Column(name="latest_round_completed")
	private String lrc;
	@Column(name="interviewer_name")
	private String intname;
	@Column(name="interview_timestamp")
	private String time;
	@Column(name="created_by")
	private String createdby;
	@Column(name="created_date")
	private String createddate;
	@Column(name="updated_by")
	private String updatedby;
	@Column(name="updated_date")
	private String updateddate;
	@OneToMany(mappedBy = "c_id", cascade = CascadeType.ALL)
	//@OneToMany(cascade = CascadeType.MERGE)
	//@JoinColumn(name="interviewee_id", referencedColumnName = "interviewee_id")
	@JsonManagedReference
	private List<InterviewerFeedback> intdetails = new ArrayList<InterviewerFeedback>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public String getLrc() {
		return lrc;
	}
	public void setLrc(String lrc) {
		this.lrc = lrc;
	}
	public String getIntname() {
		return intname;
	}
	public void setIntname(String intname) {
		this.intname = intname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}
	public List<InterviewerFeedback> getIntdetails() {
		return intdetails;
	}
	public void setIntdetails(List<InterviewerFeedback> intdetails) {
		this.intdetails = intdetails;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLatest_interviewer_feedback() {
		return latest_interviewer_feedback;
	}
	public void setLatest_interviewer_feedback(String latest_interviewer_feedback) {
		this.latest_interviewer_feedback = latest_interviewer_feedback;
	}


}
