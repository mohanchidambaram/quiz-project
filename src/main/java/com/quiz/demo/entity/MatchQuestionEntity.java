package com.quiz.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MatchQuestionEntity is the entity class for the match_question table.
 * 
 * @author Mohan Chidambaram
 *
 */
@Entity
@Table(name = "match_question")
public class MatchQuestionEntity {

	@Id
	@Column(name = "match_question_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int matchQuestionId;
	
	@Column(name = "question_id")
	public int questionId;
	
	@Column(name = "match_number")
	public int matchNumber;
	
	@Column(name = "match_left")
	public String matchLeft;
	
	@Column(name = "match_right")
	public String matchRight;

	/**
	 * @return the matchQuestionId
	 */
	public int getMatchQuestionId() {
		return matchQuestionId;
	}

	/**
	 * @param matchQuestionId the matchQuestionId to set
	 */
	public void setMatchQuestionId(int matchQuestionId) {
		this.matchQuestionId = matchQuestionId;
	}

	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the matchNumber
	 */
	public int getMatchNumber() {
		return matchNumber;
	}

	/**
	 * @param matchNumber the matchNumber to set
	 */
	public void setMatchNumber(int matchNumber) {
		this.matchNumber = matchNumber;
	}

	/**
	 * @return the matchLeft
	 */
	public String getMatchLeft() {
		return matchLeft;
	}

	/**
	 * @param matchLeft the matchLeft to set
	 */
	public void setMatchLeft(String matchLeft) {
		this.matchLeft = matchLeft;
	}

	/**
	 * @return the matchRight
	 */
	public String getMatchRight() {
		return matchRight;
	}

	/**
	 * @param matchRight the matchRight to set
	 */
	public void setMatchRight(String matchRight) {
		this.matchRight = matchRight;
	}
	
	
	
}
