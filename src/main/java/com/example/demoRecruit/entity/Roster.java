package com.example.demoRecruit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="irefer_interviewer_details")
public class Roster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="interviewer_id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="skill_set")
	private String skill;

	@Column(name="availability")
	private String availability;
	
	@Column(name="blocked_datetime")
	private String blocked_datetime;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="created_date")
	private String created_date;
	
	@Column(name="updated_by")
	private String updated_by;
	
	@Column(name="updated_date")
	private String updated_date;
	
	public Roster() {
		
	}

	public Roster(String username, String skill, String availability, String blocked_datetime, String created_by, String created_date, String updated_by,
			String updated_date) 
	{
		
		this.username = username;
		this.skill = skill;
		this.availability = availability;
		this.blocked_datetime = blocked_datetime;
		this.created_by = created_by;
		this.created_date = created_date;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
	}



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

	public String getBlocked_datetime() {
		return blocked_datetime;
	}

	public void setBlocked_datetime(String blocked_datetime) {
		this.blocked_datetime = blocked_datetime;
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



	@Override
	public String toString() {
		return "Roster [id=" + id + ", username=" + username + ", skill=" + skill
				+ ", availability=" + availability + ", blocked_datetime=" + blocked_datetime + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", updated_by=" + updated_by + ", updated_date=" + updated_date
				+ "]";
	}

	


	
	
}
