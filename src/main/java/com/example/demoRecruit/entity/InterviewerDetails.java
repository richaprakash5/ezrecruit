package com.example.demoRecruit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="irefer_interviewer_details")
public class InterviewerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="interviewer_id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="skill_set")
	private String skill;
	@Column(name="availability")
	private String availability;
	@Column(name="blocked_datetime")
	private String blockeddate;
	@Column(name="created_by")
	private String createdby;
	@Column(name="created_date")
	private String createddate;
	@Column(name="updated_by")
	private String updatedby;
	@Column(name="updated_date")
	private String updateddate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getBlockeddate() {
		return blockeddate;
	}
	public void setBlockeddate(String blockeddate) {
		this.blockeddate = blockeddate;
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
	
	


}
