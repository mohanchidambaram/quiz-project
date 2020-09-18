package com.quiz.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.demo.model.QuestionModel;
import com.quiz.demo.service.QuizService;

/**
 * QuizController is the front controller file that receives the request from quiz web page.
 * 
 * @author Mohan Chidambaram
 *
 */
@RestController
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@RequestMapping(value="/")
	public String index() {
		return "Hi";
	}
	
	@RequestMapping(value="/getAll")
	public List<QuestionModel> getAll() {
		List<QuestionModel> qm = quizService.getAll();
		return qm;
	}

}
