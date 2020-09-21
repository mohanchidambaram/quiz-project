package com.quiz.demo.model;

import java.util.List;

/**
 * QuizModel is the model class for the response.
 * 
 * @author Mohan Chidambaram
 *
 */
public class QuizModel {

	public int questionId;
	
	public String questionMain;
	
	public String questionSub;
	
	public int questionType;
	
	public int answerId;
	
	public String option1;
	
	public String option2;
	
	public String option3;
	
	public String option4;
	
	public List<String> options;
	
	public int answer;
	
	public List<MatchQuestionModel> matchQuestionModelList;
	
	public MCQuestionModel mcQuestionModel;

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

	/**
	 * @return the matchQuestionModelList
	 */
	public List<MatchQuestionModel> getMatchQuestionModel() {
		return matchQuestionModelList;
	}

	/**
	 * @param matchQuestionModelList the matchQuestionModelList to set
	 */
	public void setMatchQuestionModel(List<MatchQuestionModel> matchQuestionModelList) {
		this.matchQuestionModelList = matchQuestionModelList;
	}

	/**
	 * @return the mcQuestionModel
	 */
	public MCQuestionModel getMcQuestionModel() {
		return mcQuestionModel;
	}

	/**
	 * @param mcQuestionModel the mcQuestionModel to set
	 */
	public void setMcQuestionModel(MCQuestionModel mcQuestionModel) {
		this.mcQuestionModel = mcQuestionModel;
	}

	/**
	 * @return the options
	 */
	public List<String> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(List<String> options) {
		this.options = options;
	}

	/**
	 * @return the matchQuestionModelList
	 */
	public List<MatchQuestionModel> getMatchQuestionModelList() {
		return matchQuestionModelList;
	}

	/**
	 * @param matchQuestionModelList the matchQuestionModelList to set
	 */
	public void setMatchQuestionModelList(List<MatchQuestionModel> matchQuestionModelList) {
		this.matchQuestionModelList = matchQuestionModelList;
	}
	
	
}
