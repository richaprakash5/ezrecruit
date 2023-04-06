package com.example.demoRecruit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="irefer_interviewer_feedback")
public class InterviewerFeedBackDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="interview_id")
	private int interviewId ;
	
	@Column(name="interviewee_id")
	private int intervieweeId ;
	
	@Column(name="interviewee_name")
	private String intervieweeName ;
	
	@Column(name="interview_round")
	private String interviewRound ;
	
	@Column(name="interviewer_name")
	private String interviewerName ;
	
	@Column(name="interview_timestamp")
	private String interviewTimestamp ;
	
	@Column(name="interviewer_accept_status")
	private String interviewerAcceptStatus ;
	
	@Column(name="coding_skills")
	private String codingSkills;
	
	@Column(name="skills_based_on_yoe")
	private String skillOnYOE;
	
	@Column(name="decision_making")
	private String decisionMaking;
	
	@Column(name="client_handling")
	private String clientHandling;
	
	@Column(name="team_management")
	private String teamMgmnt;
	
	@Column(name="articulate_ability")
	private String articulateAbility;
	
	@Column(name="solution_approach")
	private String solutionApproach;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="interviewer_feedback")
	private String interviewerFeedback ;
	
	@Column(name="created_by")
	private String createdBy ;
	
	@Column(name="created_date")
    private String createdDate ;
	
	@Column(name="updated_by")
	private String updatedBy ;
	
	@Column(name="updated_date")
	private String updatedDate ;
	
	@Column(name="email")
	private String email ;
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="interviewee_id") private IntervieweeDetails
	 * intervieweeDetails;
	 */
	
	
	public InterviewerFeedBackDetails() {
		
	}


	public InterviewerFeedBackDetails(int interviewId, int intervieweeId, String intervieweeName, String interviewRound,
			String interviewerName, String interviewTimestamp, String interviewerAcceptStatus,
			String interviewerFeedback, String createdBy, String createdDate, String updatedBy, String updatedDate) {
		super();
		this.interviewId = interviewId;
		this.intervieweeId = intervieweeId;
		this.intervieweeName = intervieweeName;
		this.interviewRound = interviewRound;
		this.interviewerName = interviewerName;
		this.interviewTimestamp = interviewTimestamp;
		this.interviewerAcceptStatus = interviewerAcceptStatus;
		this.interviewerFeedback = interviewerFeedback;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public int getInterviewId() {
		return interviewId;
	}


	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}


	public int getIntervieweeId() {
		return intervieweeId;
	}


	public void setIntervieweeId(int intervieweeId) {
		this.intervieweeId = intervieweeId;
	}


	public String getIntervieweeName() {
		return intervieweeName;
	}


	public void setIntervieweeName(String intervieweeName) {
		this.intervieweeName = intervieweeName;
	}


	public String getInterviewRound() {
		return interviewRound;
	}


	public void setInterviewRound(String interviewRound) {
		this.interviewRound = interviewRound;
	}


	public String getInterviewerName() {
		return interviewerName;
	}


	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}


	public String getInterviewTimestamp() {
		return interviewTimestamp;
	}


	public void setInterviewTimestamp(String interviewTimestamp) {
		this.interviewTimestamp = interviewTimestamp;
	}


	public String getInterviewerAcceptStatus() {
		return interviewerAcceptStatus;
	}


	public void setInterviewerAcceptStatus(String interviewerAcceptStatus) {
		this.interviewerAcceptStatus = interviewerAcceptStatus;
	}


	public String getInterviewerFeedback() {
		return interviewerFeedback;
	}


	public void setInterviewerFeedback(String interviewerFeedback) {
		this.interviewerFeedback = interviewerFeedback;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public String getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCodingSkills() {
		return codingSkills;
	}


	public void setCodingSkills(String codingSkills) {
		this.codingSkills = codingSkills;
	}


	public String getSkillOnYOE() {
		return skillOnYOE;
	}


	public void setSkillOnYOE(String skillOnYOE) {
		this.skillOnYOE = skillOnYOE;
	}


	public String getDecisionMaking() {
		return decisionMaking;
	}


	public void setDecisionMaking(String decisionMaking) {
		this.decisionMaking = decisionMaking;
	}


	public String getClientHandling() {
		return clientHandling;
	}


	public void setClientHandling(String clientHandling) {
		this.clientHandling = clientHandling;
	}


	public String getTeamMgmnt() {
		return teamMgmnt;
	}


	public void setTeamMgmnt(String teamMgmnt) {
		this.teamMgmnt = teamMgmnt;
	}


	public String getArticulateAbility() {
		return articulateAbility;
	}


	public void setArticulateAbility(String articulateAbility) {
		this.articulateAbility = articulateAbility;
	}


	public String getSolutionApproach() {
		return solutionApproach;
	}


	public void setSolutionApproach(String solutionApproach) {
		this.solutionApproach = solutionApproach;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	
	
	
	
}
