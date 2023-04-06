package com.example.demoRecruit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="irefer_login_details")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String username;
	private String role;
	private String email_id;
	private String password;
	private String created_by;
	private String created_date;
	private String updated_by;
	private String updated_date;
	private String last_login;
	private String login_history;
	


	
	public Users(int user_id, String username, String role, String password, String created_by, String created_date,
			String updated_by, String updated_date) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.role = role;
		this.password = password;
		this.created_by = created_by;
		this.created_date = created_date;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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


	public String getEmailId() {
		return email_id;
	}



	public void setEmailId(String emailId) {
		this.email_id = emailId;
	}



	public String getLast_login() {
		return last_login;
	}



	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}



	public String getLogin_history() {
		return login_history;
	}



	public void setLogin_history(String login_history) {
		this.login_history = login_history;
	}



	public Users() {
		
	}
	
}
