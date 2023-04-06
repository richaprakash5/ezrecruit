package com.example.demoRecruit.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="irefer_interviewer_feedback")
public class InterviewerFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="interview_id")
	private int id;
	@Column(name="interviewee_name")
	private String name;
	@Column
	private String email;
	@Column(name="interview_round")
	private String round;
	@Column(name="interviewer_name")
	private String int_name;
	@Column(name="interview_timestamp")
	private String time;
	@Column(name="interviewer_feedback")
	private String feedback;
	@Column(name="created_by")
	private String createdby;
	@Column(name="created_date")
	private String createddate;
	@Column(name="updated_by")
	private String updatedby;
	@Column(name="updated_date")
	private String updateddate;
	@ManyToOne
	@JoinColumn(name="interviewee_id", referencedColumnName = "interviewee_id")
	@JsonBackReference
	private CandidateDetails c_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInt_name() {
		return int_name;
	}
	public void setInt_name(String int_name) {
		this.int_name = int_name;
	}
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
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
	public CandidateDetails getC_id() {
		return c_id;
	}
	public void setC_id(CandidateDetails c_id) {
		this.c_id = c_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
