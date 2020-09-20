package com.quiz.demo.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.demo.entity.ParticipantEntity;
import com.quiz.demo.entity.QuestionEntity;
import com.quiz.demo.model.ParticipantModel;
import com.quiz.demo.model.QuestionModel;
import com.quiz.demo.repository.AnswerRepository;
import com.quiz.demo.repository.MCQuestionRepository;
import com.quiz.demo.repository.MatchQuestionRepository;
import com.quiz.demo.repository.ParticipantRepository;
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
	
	@Autowired
	private MatchQuestionRepository matchQuestionRepository;
	
	@Autowired
	private MCQuestionRepository mcQuestionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@Override
	public List<QuestionModel> getAll() {
		List<QuestionEntity> questionEntityList = questionRepository.findAll();
		return QuestionModel.formModel(questionEntityList);
	}

	@Override
	public String insertParticipant(ParticipantModel participantModel) {
		if (Objects.nonNull(participantModel)) {
			ParticipantEntity participantEntity = new ParticipantEntity();
			participantEntity.setParticipantName(participantModel.getParticipantName());
			participantEntity.setParticipantMail(participantModel.getParticipantMail());
			try {
				participantRepository.save(participantEntity);
				return "Success";
			} catch (Exception exception) {
				return "Fail";
			}
		} else {
			return "Fail";
		}
	}

}
