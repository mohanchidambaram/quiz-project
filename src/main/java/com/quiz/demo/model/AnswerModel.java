package com.quiz.demo.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.quiz.demo.entity.AnswerEntity;

/**
 * AnswerModel is the model class for the answer entity.
 * 
 * @author Mohan Chidambaram
 *
 */
public class AnswerModel {

	public int answerId;
	
	public int questionId;
	
	public String option1;
	
	public String option2;
	
	public String option3;
	
	public String option4;
	
	public int answer;

	/**
	 * formModel is to convert AnswerEntity to AnswerModel.
	 * 
	 * @param answerEntityList
	 * 			the list of answerEntity to be converted.
	 * @return List<AnswerModel>
	 */
	public static List<AnswerModel> formModel(List<AnswerEntity> answerEntityList){
		if (answerEntityList.isEmpty()) {
			return Collections.emptyList();
		} else {
			return answerEntityList.stream().map(answerEntity ->{
				AnswerModel answerModel = new AnswerModel();
				answerModel.setAnswerId(answerEntity.getAnswerId());
				answerModel.setQuestionId(answerEntity.getQuestionId());
				answerModel.setOption1(answerEntity.getOption1());
				answerModel.setOption2(answerEntity.getOption2());
				answerModel.setOption3(answerEntity.getOption3());
				answerModel.setOption4(answerEntity.getOption4());
				answerModel.setAnswer(answerEntity.getAnswer());
				return answerModel;
			}).collect(Collectors.toList());
		}
	}
	
	/**
	 * @return the answerId
	 */
	public int getAnswerId() {
		return answerId;
	}

	/**
	 * @param answerId the answerId to set
	 */
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
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
	 * @return the option1
	 */
	public String getOption1() {
		return option1;
	}

	/**
	 * @param option1 the option1 to set
	 */
	public void setOption1(String option1) {
		this.option1 = option1;
	}

	/**
	 * @return the option2
	 */
	public String getOption2() {
		return option2;
	}

	/**
	 * @param option2 the option2 to set
	 */
	public void setOption2(String option2) {
		this.option2 = option2;
	}

	/**
	 * @return the option3
	 */
	public String getOption3() {
		return option3;
	}

	/**
	 * @param option3 the option3 to set
	 */
	public void setOption3(String option3) {
		this.option3 = option3;
	}

	/**
	 * @return the option4
	 */
	public String getOption4() {
		return option4;
	}

	/**
	 * @param option4 the option4 to set
	 */
	public void setOption4(String option4) {
		this.option4 = option4;
	}

	/**
	 * @return the answer
	 */
	public int getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
}
