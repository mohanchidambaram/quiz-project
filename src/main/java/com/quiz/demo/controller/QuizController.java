package com.quiz.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.demo.model.ParticipantModel;
import com.quiz.demo.model.QuestionModel;
import com.quiz.demo.service.QuizService;

/**
 * QuizController is the front controller file that receives the request from quiz web page.
 * 
 * @author Mohan Chidambaram
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@RequestMapping(value="/")
	public String index() {
		return "Hi";
	}
	
	@GetMapping(value="/getAll")
	public List<QuestionModel> getAll() {
		List<QuestionModel> qm = quizService.getAll();
		return qm;
	}
	
	@PostMapping("/insertParticipant")
	public String insertParticipant(@RequestBody ParticipantModel participantModel) {
		String s = quizService.insertParticipant(participantModel);
		return participantModel.getParticipantName();
	}

}
