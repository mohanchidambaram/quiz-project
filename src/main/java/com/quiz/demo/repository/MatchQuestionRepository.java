package com.quiz.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.demo.entity.MatchQuestionEntity;

/**
 * MatchQuestionRepository is the repository interface to perform operation on match_question entity.
 * 
 * @author Mohan Chidambaram
 *
 */
@Repository
public interface MatchQuestionRepository extends JpaRepository<MatchQuestionEntity, Integer> {

	/**
	 * findByQuestionId is used to fetch the data based on question id.
	 * 
	 * @param questionId
	 * 			question id to be fetched.
	 * @return List<MatchQuestionEntity>
	 */
	List<MatchQuestionEntity> findByQuestionId(int questionId);
}
