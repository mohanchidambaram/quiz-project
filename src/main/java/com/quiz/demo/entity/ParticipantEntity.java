package com.quiz.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * QuestionEntity is the entity class for the question table.
 * 
 * @author Mohan Chidambaram
 *
 */
@Entity
@Table(name = "participant")
public class ParticipantEntity {

	@Id
	@Column(name = "participant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int participantId;

	@Column(name = "participant_name")
	public String participantName;
	
	@Column(name = "participant_mail")
	public String participantMail;
	
	@Column(name = "score")
	public int score;

	/**
	 * @return the participantId
	 */
	public int getParticipantId() {
		return participantId;
	}

	/**
	 * @param participantId the participantId to set
	 */
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	/**
	 * @return the participantName
	 */
	public String getParticipantName() {
		return participantName;
	}

	/**
	 * @param participantName the participantName to set
	 */
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	/**
	 * @return the participantMail
	 */
	public String getParticipantMail() {
		return participantMail;
	}

	/**
	 * @param participantMail the participantMail to set
	 */
	public void setParticipantMail(String participantMail) {
		this.participantMail = participantMail;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
