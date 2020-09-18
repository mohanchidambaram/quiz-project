package com.quiz.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MCQuestionEntity is the entity class for the mc_question table.
 * 
 * @author Mohan Chidambaram
 *
 */
@Entity
@Table(name = "mc_question")
public class MCQuestionEntity {

	@Id
	@Column(name = "mc_question_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int mcQuestionId;
	
	@Column(name = "question_id")
	public int questionId;
	
	@Column(name = "choice_1")
	public String choice1;
	
	@Column(name = "choice_2")
	public String choice2;
	
	@Column(name = "choice_3")
	public String choice3;
	
	@Column(name = "choice_4")
	public String choice4;
	
	@Column(name = "choice_5")
	public String choice5;
	
	@Column(name = "choice_6")
	public String choice6;

	@Column(name = "choice_7")
	public String choice7;

	/**
	 * @return the mcQuestionId
	 */
	public int getMcQuestionId() {
		return mcQuestionId;
	}

	/**
	 * @param mcQuestionId the mcQuestionId to set
	 */
	public void setMcQuestionId(int mcQuestionId) {
		this.mcQuestionId = mcQuestionId;
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
	 * @return the choice1
	 */
	public String getChoice1() {
		return choice1;
	}

	/**
	 * @param choice1 the choice1 to set
	 */
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	/**
	 * @return the choice2
	 */
	public String getChoice2() {
		return choice2;
	}

	/**
	 * @param choice2 the choice2 to set
	 */
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	/**
	 * @return the choice3
	 */
	public String getChoice3() {
		return choice3;
	}

	/**
	 * @param choice3 the choice3 to set
	 */
	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	/**
	 * @return the choice4
	 */
	public String getChoice4() {
		return choice4;
	}

	/**
	 * @param choice4 the choice4 to set
	 */
	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	/**
	 * @return the choice5
	 */
	public String getChoice5() {
		return choice5;
	}

	/**
	 * @param choice5 the choice5 to set
	 */
	public void setChoice5(String choice5) {
		this.choice5 = choice5;
	}

	/**
	 * @return the choice6
	 */
	public String getChoice6() {
		return choice6;
	}

	/**
	 * @param choice6 the choice6 to set
	 */
	public void setChoice6(String choice6) {
		this.choice6 = choice6;
	}

	/**
	 * @return the choice7
	 */
	public String getChoice7() {
		return choice7;
	}

	/**
	 * @param choice7 the choice7 to set
	 */
	public void setChoice7(String choice7) {
		this.choice7 = choice7;
	}
	
	
}
