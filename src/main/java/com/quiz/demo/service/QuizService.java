package com.quiz.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.demo.model.ParticipantModel;
import com.quiz.demo.model.QuizModel;

/**
 * QuizService is the interface for declaring quiz page logics.
 * 
 * @author Mohan Chidambaram
 *
 */
@Service
public interface QuizService {

	/**
	 * getAllQuestions is used to fetch all the questions from the question table.
	 * 
	 * @return List<QuizModel>
	 */
	List<QuizModel> getAllQuestions();

	/**
	 * insertParticipant is used to insert participant to attend the quiz.
	 * 
	 * @param participantModel
	 * 			participant information.
	 */
	String insertParticipant(ParticipantModel participantModel);

}
