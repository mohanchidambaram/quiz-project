package com.quiz.demo.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.quiz.demo.entity.QuestionEntity;

/**
 * QuestionModel is the model class for the question entity.
 * 
 * @author Mohan Chidambaram
 *
 */
public class QuestionModel {

	public int questionId;
	
	public String questionMain;
	
	public String questionSub;
	
	public int questionType;

	
	/**
	 * formModel is to convert QuestionEntity to QuestionModel.
	 * 
	 * @param questionEntityList
	 * 			the list of questionEntity to be converted.
	 * @return List<QuestionModel>
	 */
	public static List<QuestionModel> formModel(List<QuestionEntity> questionEntityList){
		if (questionEntityList.isEmpty()) {
			return Collections.emptyList();
		} else {
			return questionEntityList.stream().map(questionEntity ->{
				QuestionModel questionModel = new QuestionModel();
				questionModel.setQuestionId(questionEntity.getQuestionId());
				questionModel.setQuestionMain(questionEntity.getQuestionMain());
				questionModel.setQuestionSub(questionEntity.getQuestionSub());
				questionModel.setQuestionType(questionEntity.getQuestionType());
				return questionModel;
			}).collect(Collectors.toList());
		}
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
