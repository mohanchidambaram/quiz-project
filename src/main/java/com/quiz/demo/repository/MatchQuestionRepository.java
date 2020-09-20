package com.quiz.demo.repository;

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

}
