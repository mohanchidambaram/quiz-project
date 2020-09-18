package com.quiz.demo.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.quiz.demo.entity.MatchQuestionEntity;

/**
 * MatchQuestionModel is the model class for the match question entity.
 * 
 * @author Mohan Chidambaram
 *
 */
public class MatchQuestionModel {

	public int matchQuestionId;
	
	public int questionId;
	
	public int matchNumber;
	
	public String matchLeft;
	
	public String matchRight;

	/**
	 * formModel is to convert MatchQuestionEntity to MatchQuestionModel.
	 * 
	 * @param mQuestionEntityList
	 * 			the list of matchQuestionEntity to be converted.
	 * @return List<MatchQuestionModel>
	 */
	public static List<MatchQuestionModel> formModel(List<MatchQuestionEntity> mQuestionEntityList){
		if (mQuestionEntityList.isEmpty()) {
			return Collections.emptyList();
		} else {
			return mQuestionEntityList.stream().map(mQuestionEntity ->{
				MatchQuestionModel mQuestionModel = new MatchQuestionModel();
				mQuestionModel.setMatchQuestionId(mQuestionEntity.getMatchQuestionId());
				mQuestionModel.setQuestionId(mQuestionEntity.getQuestionId());
				mQuestionModel.setMatchNumber(mQuestionEntity.getMatchNumber());
				mQuestionModel.setMatchLeft(mQuestionEntity.getMatchLeft());
				mQuestionModel.setMatchRight(mQuestionEntity.getMatchRight());
				return mQuestionModel;
			}).collect(Collectors.toList());
		}
	}
	
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
