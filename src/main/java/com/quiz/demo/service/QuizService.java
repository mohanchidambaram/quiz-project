package com.quiz.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.demo.model.QuestionModel;

/**
 * QuizService is the interface for declaring quiz page logics.
 * 
 * @author Mohan Chidambaram
 *
 */
@Service
public interface QuizService {

	/**
	 * getAll is used to fetch all the questions from the question.
	 * 
	 * @return
	 */
	List<QuestionModel> getAll();

}
