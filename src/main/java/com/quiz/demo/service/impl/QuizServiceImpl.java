package com.quiz.demo.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.demo.entity.AnswerEntity;
import com.quiz.demo.entity.MCQuestionEntity;
import com.quiz.demo.entity.MatchQuestionEntity;
import com.quiz.demo.entity.ParticipantEntity;
import com.quiz.demo.entity.QuestionEntity;
import com.quiz.demo.model.MCQuestionModel;
import com.quiz.demo.model.MatchQuestionModel;
import com.quiz.demo.model.ParticipantModel;
import com.quiz.demo.model.QuestionModel;
import com.quiz.demo.model.QuizModel;
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
	public List<QuizModel> getAllQuestions() {
		List<QuestionEntity> questionEntityList = questionRepository.findAll();
		List<QuestionModel> questionModelList = QuestionModel.formModel(questionEntityList);
		if (!questionModelList.isEmpty()) {
			return getQuestions(questionModelList);
		}
		return Collections.emptyList();
	}

	/**
	 * getQuestions is used to fetch sub items and options.
	 * 
	 * @param questionModelList
	 * 			contains question main.
	 * @return List<QuizModel>
	 */
	private List<QuizModel> getQuestions(List<QuestionModel> questionModelList) {
		List<QuizModel> quizModelList = new ArrayList<>();
		questionModelList.stream().forEach(questionModel->{
			QuizModel quizModel = new QuizModel();
			quizModel.setQuestionId(questionModel.getQuestionId());
			quizModel.setQuestionMain(questionModel.getQuestionMain());
			quizModel.setQuestionSub(questionModel.getQuestionSub());
			quizModel.setQuestionType(questionModel.getQuestionType());
			AnswerEntity answerEntity = answerRepository.findByQuestionId(
					questionModel.getQuestionId());
			if (Objects.nonNull(answerEntity)) {
				quizModel.setAnswerId(answerEntity.getAnswerId());
				quizModel.setAnswer(answerEntity.getAnswer());
				quizModel.setOption1(answerEntity.getOption1());
				quizModel.setOption2(answerEntity.getOption2());
				quizModel.setOption3(answerEntity.getOption3());
				quizModel.setOption4(answerEntity.getOption4());
				List<String> optionList = new ArrayList<>();
				optionList.add(answerEntity.getOption1());
				optionList.add(answerEntity.getOption2());
				optionList.add(answerEntity.getOption3());
				optionList.add(answerEntity.getOption4());
				quizModel.setOptions(optionList);
			}
			switch(questionModel.getQuestionType()) {
				case 2:
					MCQuestionEntity mcQuestionEntity = mcQuestionRepository.findByQuestionId(
							questionModel.getQuestionId());
					MCQuestionModel mcQuestionModel = MCQuestionModel.formModel(
							Arrays.asList(mcQuestionEntity)).get(0);
					quizModel.setMcQuestionModel(mcQuestionModel);
					break;
				case 3:
					List<MatchQuestionEntity> matchQuestionEntityList = matchQuestionRepository.findByQuestionId(
							questionModel.getQuestionId());
					List<MatchQuestionModel> matchQuestionModelList = MatchQuestionModel.formModel(
							matchQuestionEntityList);
					quizModel.setMatchQuestionModel(matchQuestionModelList);
					break;
				default:
					//Do Nothing.
					break;
			}
			quizModelList.add(quizModel);
		});
		return quizModelList;
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
