package com.quiz.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.demo.entity.QuestionEntity;
import com.quiz.demo.model.QuestionModel;
import com.quiz.demo.repository.QuestionRepository;
import com.quiz.demo.service.QuizService;

/**
 * QuizServiceImpl is the class for implementing quiz page logics in QuizService.
 * 
 * @author Mohan Chidambaram
 *
 */
@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public List<QuestionModel> getAll() {
		List<QuestionEntity> questionEntityList = questionRepository.findAll();
		return QuestionModel.formModel(questionEntityList);
	}

}
