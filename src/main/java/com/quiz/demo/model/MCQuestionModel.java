package com.quiz.demo.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.quiz.demo.entity.MCQuestionEntity;

public class MCQuestionModel {
	
	public int mcQuestionId;
	
	public int questionId;
	
	public String choice1;
	
	public String choice2;
	
	public String choice3;
	
	public String choice4;
	
	public String choice5;
	
	public String choice6;
	
	public String choice7;

	/**
	 * formModel is to convert MCQuestionEntity to MCQuestionModel.
	 * 
	 * @param mQuestionEntityList
	 * 			the list of mcQuestionEntity to be converted.
	 * @return List<MCQuestionModel>
	 */
	public static List<MCQuestionModel> formModel(List<MCQuestionEntity> mcQuestionEntityList){
		if (mcQuestionEntityList.isEmpty()) {
			return Collections.emptyList();
		} else {
			return mcQuestionEntityList.stream().map(mcQuestionEntity ->{
				MCQuestionModel mcQuestionModel = new MCQuestionModel();
				mcQuestionModel.setMcQuestionId(mcQuestionEntity.getMcQuestionId());
				mcQuestionModel.setQuestionId(mcQuestionEntity.getQuestionId());
				mcQuestionModel.setChoice1(mcQuestionEntity.getChoice1());
				mcQuestionModel.setChoice2(mcQuestionEntity.getChoice2());
				mcQuestionModel.setChoice3(mcQuestionEntity.getChoice3());
				mcQuestionModel.setChoice4(mcQuestionEntity.getChoice4());
				mcQuestionModel.setChoice5(mcQuestionEntity.getChoice5());
				mcQuestionModel.setChoice6(mcQuestionEntity.getChoice6());
				mcQuestionModel.setChoice7(mcQuestionEntity.getChoice7());
				return mcQuestionModel;
			}).collect(Collectors.toList());
		}
	}
	
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
