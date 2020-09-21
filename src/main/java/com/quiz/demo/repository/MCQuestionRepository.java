package com.quiz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.demo.entity.MCQuestionEntity;

/**
 * MCQuestionRepository is the repository interface to perform operation on mc_question entity.
 * 
 * @author Mohan Chidambaram
 *
 */
@Repository
public interface MCQuestionRepository extends JpaRepository<MCQuestionEntity, Integer> {

	/**
	 * findByQuestionId is used to fetch the data based on question id.
	 * 
	 * @param questionId
	 * 			question id to be fetched.
	 * @return MCQuestionEntity
	 */
	MCQuestionEntity findByQuestionId(int questionId);

}
