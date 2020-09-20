package com.quiz.demo.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.quiz.demo.entity.ParticipantEntity;

/**
 * ParticipantModel is the model class for the participant entity.
 * 
 * @author Mohan Chidambaram
 *
 */
public class ParticipantModel {

	public int participantId;

	public String participantName;
	
	public String participantMail;
	
	public int score;

	/**
	 * formModel is to convert ParticipantEntity to ParticipantModel.
	 * 
	 * @param participantEntityList
	 * 			the list of participantEntity to be converted.
	 * @return List<ParticipantModel>
	 */
	public static List<ParticipantModel> formModel(List<ParticipantEntity> participantEntityList){
		if (participantEntityList.isEmpty()) {
			return Collections.emptyList();
		} else {
			return participantEntityList.stream().map(participantEntity ->{
				ParticipantModel participantModel = new ParticipantModel();
				participantModel.setParticipantId(participantEntity.getParticipantId());
				participantModel.setParticipantMail(participantEntity.getParticipantMail());
				participantModel.setParticipantName(participantEntity.getParticipantName());
				participantModel.setScore(participantEntity.getScore());
				return participantModel;
			}).collect(Collectors.toList());
		}
	}
	
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
