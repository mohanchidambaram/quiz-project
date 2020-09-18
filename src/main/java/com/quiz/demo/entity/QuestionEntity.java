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
@Table(name = "question")
public class QuestionEntity {

	@Id
	@Column(name = "question_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int questionId;

	@Column(name = "question_main")
	public String questionMain;
	
	@Column(name = "question_sub")
	public String questionSub;
	
	@Column(name = "question_type")
	public int questionType;

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
	 * @return the questionMain
	 */
	public String getQuestionMain() {
		return questionMain;
	}

	/**
	 * @param questionMain the questionMain to set
	 */
	public void setQuestionMain(String questionMain) {
		this.questionMain = questionMain;
	}

	/**
	 * @return the questionSub
	 */
	public String getQuestionSub() {
		return questionSub;
	}

	/**
	 * @param questionSub the questionSub to set
	 */
	public void setQuestionSub(String questionSub) {
		this.questionSub = questionSub;
	}

	/**
	 * @return the questionType
	 */
	public int getQuestionType() {
		return questionType;
	}

	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(int questionType) {
		this.questionType = questionType;
	}
	
	
}
